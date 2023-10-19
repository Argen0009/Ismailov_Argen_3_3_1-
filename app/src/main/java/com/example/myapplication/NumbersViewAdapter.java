package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersViewAdapter extends RecyclerView.Adapter<NumbersViewHolder> {
    private final ArrayList<String> numberList;

    public NumbersViewAdapter(ArrayList<String> numberList) {
        this.numberList = numberList;
    }

    @NonNull
    @Override
    public NumbersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumbersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersViewHolder holder, int position) {
        holder.onBind(numberList.get(position));
    }

    @Override
    public int getItemCount() {
        return numberList.size();
    }
}
