package com.fabianpinzon.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View v){
        Log.i("info", "Button pressed");
        EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPassword = findViewById(R.id.editTextTextPassword);
        Log.i("values", editTextTextPersonName.getText().toString());
        Log.i("password", editTextTextPassword.getText().toString());
        //Toast.makeText(this, editTextTextPersonName.getText().toString() + " to Hangar 18", Toast.LENGTH_SHORT).show();
       Snackbar.make(v, "Welcome " + editTextTextPersonName.getText().toString() + " to Hangar 18", Snackbar.LENGTH_INDEFINITE)
                .setAction("Take me to Jupiter", view -> {
                  Intent intent = new Intent(this, MainActivity2.class);
                  startActivity(intent);
                }).show();


    }
}