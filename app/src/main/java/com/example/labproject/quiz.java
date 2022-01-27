package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz extends AppCompatActivity {

    Fragment fragment;
    Button next;
    int c=1;
    public static int mark=0;
    final static String marks="Marks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        next = findViewById(R.id.nextBtn);
        fragment = new FragmentA();
        shift(fragment);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                if(c==2){
                    fragment = new FragmentB();
                    shift(fragment);
                    mark = mark+FragmentA.t;
                }else if(c==3){
                    fragment = new FragmentC();
                    shift(fragment);
                    mark = mark + FragmentB.t2;
                }else if(c==4){
                    fragment = new FragmentD();
                    shift(fragment);
                    mark = mark + FragmentC.t3;
                    next.setText("submit");
                }else if(c==5){
                    mark = mark + FragmentD.t4;
                    Intent intent = new Intent(quiz.this, quizResult.class);
                    intent.putExtra(marks,mark);
                    startActivity(intent);
                }

            }

        });







    }
    void shift(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentID, fragment);
        transaction.commit();
    }
}