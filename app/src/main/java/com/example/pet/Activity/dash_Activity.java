package com.example.pet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pet.Adapter.TrendsAdapter;
import com.example.pet.Domain.TrendSDomain;
import com.example.pet.R;

import java.util.ArrayList;

public class dash_Activity extends AppCompatActivity {

public TextView viewAll;
private RecyclerView.Adapter adapterTrendsList;
private RecyclerView recyclerViewTrends;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        viewAll=findViewById(R.id.viewAll);
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dash_Activity.this,viewActivity.class));
            }
        });

        initRecycleView();

        LinearLayout profile = findViewById(R.id.profile);
        LinearLayout setting = findViewById(R.id.setting);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(ca);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(pa);
            }
        });
    }











    private void initRecycleView() {
        ArrayList<TrendSDomain> items=new ArrayList<>();

        items.add(new TrendSDomain("Dog","street dog","dogs1"));
        items.add(new TrendSDomain("cat","street cat","cat"));
        items.add(new TrendSDomain("Dog","street dog","dog"));
        items.add(new TrendSDomain("cat","cute cat","cat2"));



        recyclerViewTrends=findViewById(R.id.view2);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterTrendsList=new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrendsList);



    }
}