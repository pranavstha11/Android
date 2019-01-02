package com.example.dell.pranavapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.pranavapp.domain.Naruto;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewViewHolder>{

    private Context context;
    private ArrayList<Naruto> narutoArrayList;

    public RecyclerviewAdapter(Context contxt,ArrayList<Naruto> narutoArrayList){
        this.context = context;
        this.narutoArrayList = narutoArrayList;
    }

    @NonNull
    @Override
    public RecyclerviewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_row_design,viewGroup,false);
        return new RecyclerviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewViewHolder recyclerviewViewHolder, int i) {
        recyclerviewViewHolder.headingTextview.setText(narutoArrayList.get(i).getHeading());
        recyclerviewViewHolder.detailTextview.setText(narutoArrayList.get(i).getDetail());
        recyclerviewViewHolder.timeTextview.setText(narutoArrayList.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return narutoArrayList.size();
    }
}
