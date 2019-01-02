package com.example.dell.pranavapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dell.pranavapp.domain.Naruto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerviewAdapter recyclerviewAdapter;
    private ArrayList<Naruto> narutoArrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reycelerview);

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        narutoArrayList=setData();

        recyclerviewAdapter = new RecyclerviewAdapter(this,narutoArrayList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);
    }
    private ArrayList<Naruto>setData(){
        ArrayList<Naruto>narutos = new ArrayList<>();
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        narutos.add(new Naruto("Dancing","Practise for farewell programme","10:10"));
        return narutos;
    }
}
