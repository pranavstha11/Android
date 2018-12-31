package com.example.dell.pranavapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserDetailActivity extends AppCompatActivity implements View.OnClickListener {
    EditText uET,pET;
    Button sBT,eBT;
    SharedPreference sharedPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        uET=findViewById(R.id.username);
        String user=uET.getText().toString();
        pET=findViewById(R.id.password);
        String pass=uET.getText().toString();

        sBT=findViewById(R.id.save);
        eBT=findViewById(R.id.edit);

        sBT.setOnClickListener(this);
        eBT.setOnClickListener(this);

        uET.setEnabled(false);
        pET.setEnabled(false);
        sharedPreference=new SharedPreference(this);

        uET.setText(sharedPreference.getUsername());
        pET.setText(sharedPreference.getPassword());

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        String username;
        String pass;

        switch(id){
            case R.id.save:
                username=uET.getText().toString();
                pass=pET.getText().toString();

                sharedPreference.sUsname(username);
                sharedPreference.sPass(pass);

                Toast.makeText(this,"Username and Password updated successfully!!", Toast.LENGTH_SHORT).show();

                uET.setEnabled(false);
                pET.setEnabled(false);

                break;

            case R.id.edit:
                uET.setEnabled(true);
                pET.setEnabled(true);

                break;
        }
    }
}
