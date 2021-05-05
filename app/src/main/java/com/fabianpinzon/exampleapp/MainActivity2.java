package com.fabianpinzon.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void backToEarth(View v){
        Intent intent = new Intent(this, EarthActivity.class);
        startActivity(intent);
    }

    public void toProximaB(View v){
        ImageView img = findViewById(R.id.jupiter);
        img.setImageResource(R.drawable.proximab);
    }
}