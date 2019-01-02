package com.example.dell.pranavapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerviewViewHolder extends RecyclerView.ViewHolder {

    public TextView headingTextview;
    public TextView detailTextview;
    public TextView timeTextview;

    public RecyclerviewViewHolder(View itemView){
        super(itemView);
        headingTextview = itemView.findViewById(R.id.heading_text);
        detailTextview = itemView.findViewById(R.id.detail_text);
        timeTextview = itemView.findViewById(R.id.time_text);
    }
}
