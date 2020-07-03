package com.example.taskthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        Intent i=new Intent(this,threetwo.class);
        startActivity(i);
    }

    public void regester(View view) {
        Intent n=new Intent(this,threeReg.class);
        startActivity(n);
    }
}