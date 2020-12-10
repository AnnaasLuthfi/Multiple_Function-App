package com.example.revisiui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Signup Form");
    }

    public void btn_mainActivity(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}