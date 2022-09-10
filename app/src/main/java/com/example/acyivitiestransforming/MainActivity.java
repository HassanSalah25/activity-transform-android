package com.example.acyivitiestransforming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button A1, A2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A1 = findViewById(R.id.b2);
        A2 = findViewById(R.id.b1);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(x);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(x);
            }
        });
    }
}