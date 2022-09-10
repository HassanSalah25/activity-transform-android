package com.example.acyivitiestransforming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button A, A2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        A = findViewById(R.id.b5);
        A2 = findViewById(R.id.b6);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity.class);
                startActivity(x);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(x);
            }
        });
    }
}