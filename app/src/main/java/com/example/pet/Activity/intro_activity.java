package com.example.pet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pet.R;

public class intro_activity extends AppCompatActivity {
public AppCompatButton introBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        introBtn=findViewById(R.id.introBtn);
        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(intro_activity.this, dash_Activity.class));

            }
        });
    }
}