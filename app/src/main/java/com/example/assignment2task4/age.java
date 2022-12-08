package com.example.assignment2task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class age extends AppCompatActivity {

    private DatePicker dpkr;
    private Button btn;
    private TextView txtv;
    private Calendar cal;
    private int year, cyear;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        btn = findViewById(R.id.b1);
        txtv = findViewById(R.id.tv2);
        dpkr = findViewById(R.id.dp);
        dpkr.setCalendarViewShown(false);
        cal = Calendar.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getValues();
                calculation();
                output();
            }
        });
    }

    public void getValues()
    {
        year = dpkr.getYear();
        cyear = cal.get(Calendar.YEAR);
    }

    public void calculation()
    {
        result = "You age is: " + (cyear-year) + " Years";
    }

    public void output()
    {
        txtv.setText(result);
    }
}