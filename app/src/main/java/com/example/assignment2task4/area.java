package com.example.assignment2task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class area extends AppCompatActivity {

    private Button btn;
    private ToggleButton tbtn;
    private EditText edt;
    private TextView txtv;
    private double number, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        btn = findViewById(R.id.b);
        tbtn = findViewById(R.id.tb);
        edt = findViewById(R.id.et);
        txtv = findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getvalues();

                if(tbtn.isChecked()==true)
                {
                    result = number/10.76391042;
                    txtv.setText(result+" SQM");
                }
                else
                {
                    result = number*10.76391042;
                    txtv.setText(result+" SQF");
                }
            }
        });
    }

    private void getvalues()
    {
        number = Double.parseDouble(edt.getText().toString());
    }
}