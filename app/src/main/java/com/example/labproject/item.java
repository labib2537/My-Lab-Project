package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class item extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

    }


    public void btn(View view) {
        if(view.getId() == R.id.cB){
            Intent intent = new Intent(item.this, calculator.class);
            startActivity(intent);
        }else if(view.getId()  == R.id.bcB){
            Intent intent = new Intent(item.this, bmi.class);
            startActivity(intent);
        }else if(view.getId() == R.id.ccB){
            Intent intent = new Intent(item.this, converter.class);
            startActivity(intent);
        }else if(view.getId() == R.id.qtB){
            Intent intent = new Intent(item.this, quiz.class);
            startActivity(intent);
        }else if(view.getId()  == R.id.mpB){
            Intent intent = new Intent(item.this, memo.class);
            startActivity(intent);
        }
    }
}