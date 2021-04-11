package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<FootballModel> listTeam = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvFootball);
        rv.setHasFixedSize(true);
        listTeam.addAll(FootballData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        FootballAdapter footbalAdapter = new FootballAdapter(listTeam,this);
        rv.setAdapter(footballAdapter);
    }

}