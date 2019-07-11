package com.example.week6test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VirtusaActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtusa);
        recyclerView = findViewById(R.id.rvView);


        RetrofitHelper retrofitHelper = new RetrofitHelper();
        retrofitHelper.getVirtusaResponses(RetrofitHelper.BASE_URL).enqueue(new Callback<ArrayList<SATResponse>> () {
            @Override
            public void onResponse(Call<ArrayList<SATResponse>> call, Response<ArrayList<SATResponse>>  response) {
                ArrayList<SATResponse> satResponse = response.body();
                populateRecyclerView(satResponse);

            }

            @Override
            public void onFailure(Call<ArrayList<SATResponse>>  call, Throwable t) {
                Log.e("TAG", t.getMessage(), t);
            }
        });
    }

    private void populateRecyclerView(ArrayList<SATResponse> responses ){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(responses);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}
