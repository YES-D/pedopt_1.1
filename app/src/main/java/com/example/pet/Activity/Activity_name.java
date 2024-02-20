package com.example.pet.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pet.R;
import com.google.android.material.button.MaterialButton;

public class Activity_name extends AppCompatActivity {

    public MaterialButton nexttBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        nexttBtn=findViewById(R.id.nexttBtn);
        nexttBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_name.this, intro_activity.class));
            }
        });
    }
}