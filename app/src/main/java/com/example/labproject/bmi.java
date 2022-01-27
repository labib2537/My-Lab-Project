package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bmi extends AppCompatActivity {

    EditText h, w;
    Button calculate;
    double ht, wt, BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        calculate = findViewById(R.id.btn);
        h = findViewById(R.id.hID);
        w = findViewById(R.id.wID);
    }

    public void cal(View view) {
        ht = Double.parseDouble(h.getText().toString());
        wt = Double.parseDouble(w.getText().toString());
        BMI = wt / (ht * ht);
        if (BMI < 18.5) {
            Toast.makeText(this, "Underweight", Toast.LENGTH_SHORT).show();
        } else if (BMI < 25) {
            Toast.makeText(this, "Normal", Toast.LENGTH_SHORT).show();
        } else if (BMI < 30) {
            Toast.makeText(this, "Overweight", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Obese", Toast.LENGTH_SHORT).show();
        }
    }
}