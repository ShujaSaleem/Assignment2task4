package com.example.assignment2task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class time extends AppCompatActivity {

    private Button btn1, btn2;
    private ToggleButton tbtn1, tbtn2, tbtn3;
    private EditText edt1, edt2, edt3;
    private TextView txtv1, txtv2;
    private int hours,minutes;
    private Double number, result;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        btn1 = findViewById(R.id.b1);
        tbtn1 = findViewById(R.id.tb1);
        edt1 = findViewById(R.id.et1);
        txtv1 = findViewById(R.id.tv1);

        btn2 = findViewById(R.id.b2);
        tbtn2 = findViewById(R.id.tb2);
        edt2 = findViewById(R.id.et2);
        txtv2 = findViewById(R.id.tv2);

        tbtn3 = findViewById(R.id.tb3);
        edt3 = findViewById(R.id.et3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = Double.parseDouble(edt1.getText().toString());

                if (tbtn1.isChecked() == true) {
                    result = number*60;
                    txtv1.setText(result+" Min");
                } else {
                    result = number*60;
                    txtv1.setText(result+" Sec");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getValue();

                if(tbtn3.isChecked() == true)
                {
                    value = "AM";
                }
                else
                {
                    value = "PM";
                }

                if (tbtn2.isChecked() == true) {

                    if(hours >= 9 && hours <=12)
                    {
                        hours = hours+3;
                        hours = hours-12;

                        if(hours == 0)
                        {
                            hours = 12;
                        }
                    }
                    else
                    {
                        hours = hours+3;
                    }

                } else {

                    if(hours >= 1 && hours <= 3)
                    {
                        hours = hours+12;
                        hours = hours-3;
                    }
                    else
                    {
                        hours = hours-3;
                    }
                }

                txtv2.setText(hours+":"+minutes+" "+value);
            }
        });
    }

    public void getValue()
    {
        hours = Integer.parseInt(edt2.getText().toString());
        minutes = Integer.parseInt(edt3.getText().toString());
    }
}