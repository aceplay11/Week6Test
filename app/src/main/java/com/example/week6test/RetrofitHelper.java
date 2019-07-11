package com.example.week6test;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class RetrofitHelper {
    public static final String BASE_URL = "https://data.cityofnewyork.us/resource/f9bf-2cp4.json/";

    private Retrofit getRetrofitInstance(){
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

    }

    private GetVirtusaService getService(){
        return getRetrofitInstance().create(GetVirtusaService.class);
    }

    public Call<ArrayList<SATResponse>> getVirtusaResponses(String string){
        return getService().getVirtusaResponse(string);

    }

    public interface GetVirtusaService {
        @GET
        Call<ArrayList<SATResponse>> getVirtusaResponse(@Url String url);
    }
}
