package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizResult extends AppCompatActivity {

    TextView tv;
    Button button;
    int mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        tv = findViewById(R.id.textView2);
        button= findViewById(R.id.tryBtn);
        Intent intent = getIntent();
        mark = intent.getIntExtra(quiz.marks, 0);
        tv.setText("You have got "+mark+ " Marks out of 20");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quizResult.this, item.class);
                startActivity(intent);

            }
        });

    }
}