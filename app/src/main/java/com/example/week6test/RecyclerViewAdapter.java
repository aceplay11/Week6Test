package com.example.week6test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<SATResponse> responseArrayList;
    public RecyclerViewAdapter(ArrayList<SATResponse> responses) {
        this.responseArrayList = responses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String name = "High School Name: " + responseArrayList.get(position).getSchoolName();
        final String math = "Average SAT Math Score: " + responseArrayList.get(position).getSatMathAvgScore();
        final String reading = "Average SAT Reading Score: " + responseArrayList.get(position).getSatCriticalReadingAvgScore();
        final String writing = "Average SAT Math Score: " + responseArrayList.get(position).getSatWritingAvgScore();
        final String takers = "Number SAT Test Takers: " + responseArrayList.get(position).getNumOfSatTestTakers();

        holder.tvName.setText(name);
        holder.tvTakers.setText(takers);
        holder.tvMath.setText(math);
        holder.tvRead.setText(reading);
        holder.tvWrite.setText(writing);

    }

    @Override
    public int getItemCount() {
        return responseArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvMath;
        TextView tvRead;
        TextView tvWrite;
        TextView tvTakers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvMath = itemView.findViewById(R.id.tvMath);
            tvRead = itemView.findViewById(R.id.tvReading);
            tvWrite = itemView.findViewById(R.id.tvWriting);
            tvTakers = itemView.findViewById(R.id.tvTake);
        }
    }
}
