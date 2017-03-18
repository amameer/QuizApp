package com.misk.amna.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton Q1Y;
    RadioButton Q1N;
    RadioButton Q2Y;
    RadioButton Q2N;
    RadioButton Q3Y;
    RadioButton Q3N;
    EditText Q4;
    EditText Q5;
    EditText Q6;
    Integer Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Q1Y = (RadioButton) findViewById(R.id.Q1Y);
        Q1N = (RadioButton) findViewById(R.id.Q1N);
        Q2Y = (RadioButton) findViewById(R.id.Q2Y);
        Q2N = (RadioButton) findViewById(R.id.Q2N);
        Q3Y = (RadioButton) findViewById(R.id.Q3Y);
        Q3N = (RadioButton) findViewById(R.id.Q3N);
        Q4 =(EditText) findViewById(R.id.Q4);
        Q5 =(EditText) findViewById(R.id.Q5);
        Q6 =(EditText) findViewById(R.id.Q6);
        Score=0;
    }


void CalculateScore()
{
    if (Q1N.isChecked()) Score++;
    if (Q2Y.isChecked()) Score++;
    if (Q3N.isChecked()) Score++;
    if (Q4.getText().toString().equalsIgnoreCase("London"))Score++;;
    if (Q5.getText().toString().equalsIgnoreCase("Newton"))Score++;;
    if (Q6.getText().toString().equalsIgnoreCase("4"))Score++;;

}

    void Submit(View view)
    {

        CalculateScore();

        TextView txt=new TextView(this);
        txt.setText("Thank You Your Score is :" + Score);

        setContentView(txt);
    }



}
