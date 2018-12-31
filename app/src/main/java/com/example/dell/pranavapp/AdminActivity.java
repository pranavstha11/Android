package com.example.dell.pranavapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }
    public void openActivity(View view){
        @SuppressLint("WrongConstant") SharedPreferences pref= getSharedPreferences("usname",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        EditText uname= findViewById(R.id.username_editext);
        EditText pass= findViewById(R.id.password_editext);
        String username=uname.getText().toString();
        String password=pass.getText().toString();
        editor.putString("username",username);
        editor.putString("password",password);
        editor.commit();
        Intent intent = new Intent(AdminActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
