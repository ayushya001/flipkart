package com.example.flipkart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    vpadapter vp;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[]titles = new String[]{"login","signup"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.yellow));
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.view);
        vp= new vpadapter(this);

        viewPager2.setAdapter(vp);
       new TabLayoutMediator(tabLayout,viewPager2,(((tab, position) -> tab.setText(titles[position])))).attach();




    }
}