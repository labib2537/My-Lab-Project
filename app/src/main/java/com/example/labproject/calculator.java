package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    TextView PrimaryView, secondaryView;
    double n1,n2,result;
    String operator;
    boolean dot;
    String operator1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        PrimaryView = findViewById(R.id.primaryTextViewID);
        secondaryView = findViewById(R.id.secondaryTextViewID);
        dot=false;
    }


    public void btnFunction(View view) {
        if(view.getId()==R.id.ceButtonId){
            PrimaryView.setText("0");
            dot=false;
        }
        else if(view.getId()==R.id.cButtonId){
            PrimaryView.setText("0");
            secondaryView.setText("");
            n1=0;
            operator="";
            dot=false;
        }
        else if(view.getId()==R.id.eqButtonId){
            n2=Double.parseDouble(PrimaryView.getText().toString());
            if(operator.equals("+")){
                result=n1+n2;
            }
            else if(operator.equals("-")){
                result=n1-n2;
            }
            else if(operator.equals("*")){
                result=n1*n2;
            }
            else{
                result=n1/n2;
            }
            secondaryView.setText(""+n1+" "+operator+" "+n2+"=");
            PrimaryView.setText(""+result);
        }
    }

    public void NumberbtnFunction(View view) {
        String ptext = PrimaryView.getText().toString();

        if(view.getId()==R.id.oneButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("1");
            }
            else{
                PrimaryView.setText(ptext+"1");
            }
        }

        else if(view.getId()==R.id.twoButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("2");
            }
            else{
                PrimaryView.setText(ptext+"2");
            }
        }

        else if(view.getId()==R.id.threeButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("3");
            }
            else{
                PrimaryView.setText(ptext+"3");
            }
        }
        else if(view.getId()==R.id.fourButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("4");
            }
            else{
                PrimaryView.setText(ptext+"4");
            }
        }
        else if(view.getId()==R.id.fiveButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("5");
            }
            else{
                PrimaryView.setText(ptext+"5");
            }
        }
        else if(view.getId()==R.id.sixButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("6");
            }
            else{
                PrimaryView.setText(ptext+"6");
            }
        }
        else if(view.getId()==R.id.sevenButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("7");
            }
            else{
                PrimaryView.setText(ptext+"7");
            }
        }
        else if(view.getId()==R.id.eightButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("8");
            }
            else{
                PrimaryView.setText(ptext+"8");
            }
        }
        else if(view.getId()==R.id.nineButtonId){
            if(ptext.equals("0")){
                PrimaryView.setText("9");
            }
            else{
                PrimaryView.setText(ptext+"9");
            }
        }
        else{
            if(ptext.equals("0")){
                PrimaryView.setText("0");
            }
            else{
                PrimaryView.setText(ptext+"0");
            }
        }
    }

    public void operatorFunction(View view) {
        String primaryText = PrimaryView.getText().toString();
        n1=Double.parseDouble(primaryText);
        if(view.getId()==R.id.addButtonId){
            operator="+";
            dot=false;
        }
        else if(view.getId()==R.id.subButtonId){
            operator="-";
            dot=false;
        }
        else if(view.getId()==R.id.mulButtonId){
            operator="*";
            dot=false;
        }
        else{
            operator="/";
            dot=false;
        }
        secondaryView.setText(""+primaryText+" "+operator);
        PrimaryView.setText("0");
    }

    public void point(View view){
        if(!dot){
            if(PrimaryView.getText().equals("")){
                PrimaryView.setText("0.");
            }else{
                PrimaryView.setText(PrimaryView.getText() + ".");
            }
            dot=true;
        }
    }

    public void back(View view) {


        String str=PrimaryView.getText().toString();
        if (str.length() >=1 ) {
            str = str.substring(0, str.length() - 1);
            PrimaryView.setText(str);
        } else if (str.length() <=1 ) {
            PrimaryView.setText("0");
        }
    }


    public void convert(View view) {
        operator1="-"+PrimaryView.getText();
        PrimaryView.setText(operator1);
    }
}
