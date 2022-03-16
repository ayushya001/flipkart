package com.example.flipkart;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class login extends Fragment {
    EditText et1,et2;
    Button login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        et1 = view.findViewById(R.id.et1);
        et2 = view.findViewById(R.id.et2);
        login = view.findViewById(R.id.login);
        onclick();
        return view;
    }
    public void onclick(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),intro.class);
                startActivity(intent);
            }
        });
    }
}