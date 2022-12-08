package com.example.assignment2task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class length extends AppCompatActivity {

    private Button btn1, btn2;
    private ToggleButton tbtn1, tbtn2;
    private EditText edt1, edt2;
    private TextView txtv1, txtv2;
    private double number, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        btn1 = findViewById(R.id.b1);
        tbtn1 = findViewById(R.id.tb1);
        edt1 = findViewById(R.id.et1);
        txtv1 = findViewById(R.id.tv1);

        btn2 = findViewById(R.id.b2);
        tbtn2 = findViewById(R.id.tb2);
        edt2 = findViewById(R.id.et2);
        txtv2 = findViewById(R.id.tv2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = Double.parseDouble(edt1.getText().toString());

                if (tbtn1.isChecked() == true) {
                    result = number/0.393701;
                    txtv1.setText(result+" cm");
                } else {
                    result = number*0.393701;
                    txtv1.setText(result+" inch");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = Double.parseDouble(edt2.getText().toString());

                if (tbtn2.isChecked() == true) {
                    result = number*0.3048;
                    txtv2.setText(result+" meter");
                } else {
                    result = number/0.3048;
                    txtv2.setText(result+" foot");
                }
            }
        });
    }
}