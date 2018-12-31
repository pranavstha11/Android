package com.example.dell.pranavapp;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        @SuppressLint("WrongConstant")SharedPreferences pref=getSharedPreferences("usname",MODE_PRIVATE);
        String username=pref.getString("username","");
        String password=pref.getString("password","");
        TextView displayusername=findViewById(R.id.disuname);
        displayusername.setText(username);
        TextView displaypassword=findViewById(R.id.dispassword);
        displaypassword.setText(password);
    }
}
