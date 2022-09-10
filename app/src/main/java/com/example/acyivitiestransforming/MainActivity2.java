package com.example.acyivitiestransforming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button A, A3;
        A = (Button) findViewById(R.id.b);
        A3 = (Button) findViewById(R.id.b4);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity.class);
                startActivity(x);
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(x);
            }
        });
    }
}