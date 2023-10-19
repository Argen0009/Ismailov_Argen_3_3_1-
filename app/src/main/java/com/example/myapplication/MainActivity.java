package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView numbers;
    private ArrayList<String> NumberList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers = findViewById(R.id.tv_numbers);
        layoutManager = new GridLayoutManager(this, 2);
        numbers.setLayoutManager(layoutManager);
        initView();
        loadData();
        initAdapter();
    }
    private void initAdapter(){
        NumbersViewAdapter adapter = new NumbersViewAdapter(NumberList);
        numbers.setAdapter(adapter);
    }

    private void loadData() {
            NumberList.add("1");
            NumberList.add("2");
            NumberList.add("3");
            NumberList.add("4");
            NumberList.add("5");
            NumberList.add("6");
            NumberList.add("7");
            NumberList.add("8");
            NumberList.add("9");
            NumberList.add("10");
            NumberList.add("11");
            NumberList.add("12");


    }

    private void initView() {
        numbers = findViewById(R.id.tv_numbers);

    }
}