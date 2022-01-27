package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class converter extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText editText;
    RadioGroup radioGroup;
    TextView textView;
    double result;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        editText = findViewById(R.id.input);
        radioGroup = findViewById(R.id.group);
        textView = findViewById(R.id.outputId);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String value = editText.getText().toString();
        Double double_value = Double.parseDouble(value);
        if (i == R.id.UsdBtn) {
            result = double_value / 85;
            s = String.format("%.2f", result);
            textView.setText(s);
        }

        if (i == R.id.euroBtn) {
            result = double_value / 97;
            s = String.format("%.2f", result);
            textView.setText(s);
        }

        if (i == R.id.rupeeBtn) {
            result = double_value / 1.15;
            s = String.format("%.2f", result);
            textView.setText(s);
        }

        if (i == R.id.kdBtn) {
            result = double_value / 283.34;
            s = String.format("%.2f", result);
            textView.setText(s);
        }

        if (i == R.id.tlBtn) {
            result = double_value / 6.15;
            s = String.format("%.2f", result);
            textView.setText(s);
        }


    }
}