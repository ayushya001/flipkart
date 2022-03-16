package com.example.flipkart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class intro extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
       // getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(intro.this,R.color.yellow));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        },1000);
    }
}