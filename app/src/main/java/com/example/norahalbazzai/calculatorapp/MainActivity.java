package com.example.norahalbazzai.calculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // For button "move to first"

    public void call1st(View v){
        Intent i = new Intent(this, frstActivity.class);
        startActivity(i);
        finish();

    }

    // For button "move to second"
    public void call2nd(View v){

        Intent i = new Intent(this, secActivity.class);
        startActivity(i);
        finish();
    }

}
