package com.example.stargazer.kidsabclearningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Abcd extends AppCompatActivity {

    GridView gridView;
    String[] letterList = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
            "Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);

        gridView = findViewById(R.id.gridView);
       // GridAdapter gridAdapter = new GridAdapter(this, letterList);
       // gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Abcd.this, "Clicked Letter:"+letterList[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
