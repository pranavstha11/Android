package com.example.dell.pranavapp.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.pranavapp.R;

public class AddNarutoDialog extends DialogFragment {
    public AddNarutoDialog(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.add_naruto_dialog_activity,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
