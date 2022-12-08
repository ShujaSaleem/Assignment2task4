package com.example.assignment2task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_1);

        Button b1 = findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(page_1.this, friendship.class);
                startActivity(i1);
            }
        });

        Button b2 = findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(page_1.this, currency.class);
                startActivity(i2);
            }
        });

        Button b3 = findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(page_1.this, temperature.class);
                startActivity(i3);
            }
        });

        Button b4 = findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(page_1.this, bmi.class);
                startActivity(i4);
            }
        });
        Button b5 = findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(page_1.this, length.class);
                startActivity(i5);
            }
        });

        Button b6 = findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(page_1.this, area.class);
                startActivity(i6);
            }
        });
        Button b7 = findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(page_1.this, volume.class);
                startActivity(i7);
            }
        });

        Button b8 = findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(page_1.this, wam.class);
                startActivity(i8);
            }
        });
        Button b9 = findViewById(R.id.btn9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(page_1.this, time.class);
                startActivity(i9);
            }
        });

        Button b10 = findViewById(R.id.btn10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10 = new Intent(page_1.this, age.class);
                startActivity(i10);
            }
        });
    }
}