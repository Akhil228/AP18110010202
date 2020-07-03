package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3,b4;
    TextView t;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.bone);
        b2 = findViewById(R.id.btwo);
        b3 = findViewById(R.id.bthree);
        b4 = findViewById(R.id.four);
        t = findViewById(R.id.textview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                t.setText("" + i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                t.setText("" + i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 0;
                t.setText("" + i);

            }
        });


    }
    public void display(View view) {
        Toast.makeText(this,"The number is displayed",Toast.LENGTH_SHORT).show();
    }
}