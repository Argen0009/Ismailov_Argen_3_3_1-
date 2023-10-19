package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersViewHolder extends RecyclerView.ViewHolder {
    private TextView Zero;
    public NumbersViewHolder(@NonNull View itemView) {
        super(itemView);
        Zero = itemView.findViewById(R.id.zero);
    }
    public void onBind(String numberZero){
        Zero.setText(numberZero);
    }
}
