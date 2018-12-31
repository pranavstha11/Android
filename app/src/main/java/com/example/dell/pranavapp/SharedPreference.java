package com.example.dell.pranavapp;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {
    private Context context;
    private SharedPreferences sharedPreferneces;
    private SharedPreferences.Editor editor;

    public SharedPreference(Context context){
        this.context=context;
        sharedPreferneces = context.getSharedPreferences("LoginCredential",Context.MODE_PRIVATE);
        editor=sharedPreferneces.edit();
    }
    public void sUsname(String username){
        editor.putString("username",username);
        editor.commit();
    }
    public void sPass(String password){
        editor.putString("password",password);
        editor.commit();
    }
    public String getUsername(){
        String username=sharedPreferneces.getString("username","");
        return username;
    }
    public String getPassword(){
        String password=sharedPreferneces.getString("password","");
        return password;
    }
}
