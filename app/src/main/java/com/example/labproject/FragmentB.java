package com.example.labproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FragmentB extends Fragment {
    RadioButton r1,r2,r3,r4;
    RadioGroup rg;
    String answer = "Google";
    public static int t2 ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        perform(view);

        return view;
    }
    private void perform(View view) {
        rg = view.findViewById(R.id.group2ID);
        r1 = view.findViewById(R.id.qus2OneRdone);
        r2 = view.findViewById(R.id.qus2OneRdtwo);
        r3 = view.findViewById(R.id.qus2OneRdThree);
        r4 = view.findViewById(R.id.qus2OneRdFour);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    if(r1.getText().toString().equals(answer)){
                        t2 = 5;
                    }
                    else{
                        t2 = 0;
                    }
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r2.getText().toString().equals(answer)){
                        t2 = 5;
                    }
                    else{
                        t2 = 0;
                    }
                }
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r3.getText().toString().equals(answer)){
                        t2 = 5;
                    }
                    else{
                        t2 = 0;
                    }
                }
            }
        });
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r4.getText().toString().equals(answer)){
                        t2 = 5;
                    }
                    else{
                        t2 = 0;
                    }
                }
            }
        });
    }

}
