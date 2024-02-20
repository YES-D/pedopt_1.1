package com.example.pet.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.pet.R;

public class viewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        ImageView img1=findViewById(R.id.img_11);
        ImageView img2=findViewById(R.id.img_22);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca = new Intent(getApplicationContext(),petinfoActivity.class);
                startActivity(ca);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca = new Intent(getApplicationContext(),catActivity.class);
                startActivity(ca);
            }
        });


    }
}