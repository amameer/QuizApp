package com.misk.amna.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {


    RadioButton q1Y;
    RadioButton q1N;
    EditText q3;
    EditText q4;
    Integer Score;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    String resultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1Y = (RadioButton) findViewById(R.id.Q1Y);
        q1N = (RadioButton) findViewById(R.id.Q1N);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        q3 = (EditText) findViewById(R.id.Q3);
        q4 = (EditText) findViewById(R.id.Q4);

        Score = 0;

        // setOnCheckedChangeListener for enabling only 2 checkbox
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton bv, boolean isChckd) {
                if (isChckd) {
                    if (checkBox2.isChecked())
                        checkBox3.setEnabled(false);
                    else if (checkBox3.isChecked())
                        checkBox2.setEnabled(false);
                } else {
                    checkBox2.setEnabled(true);
                    checkBox3.setEnabled(true);
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton bv, boolean isChckd) {
                if (isChckd) {
                    if (checkBox1.isChecked())
                        checkBox3.setEnabled(false);
                    else if (checkBox3.isChecked())
                        checkBox1.setEnabled(false);
                } else {
                    checkBox1.setEnabled(true);
                    checkBox3.setEnabled(true);
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton bv, boolean isChckd) {
                if (isChckd) {
                    if (checkBox1.isChecked())
                        checkBox2.setEnabled(false);
                    else if (checkBox2.isChecked())
                        checkBox1.setEnabled(false);
                } else {
                    checkBox1.setEnabled(true);
                    checkBox2.setEnabled(true);
                }
            }
        });
    }

    void CalculateScore() {
        if (q1N.isChecked()) Score += 2;
        if (checkBox1.isChecked() && checkBox3.isChecked()) Score += 2;
        if (q3.getText().toString().equalsIgnoreCase("4") || q3.getText().toString().equalsIgnoreCase("four"))
            Score += 2;
        if (q4.getText().toString().equalsIgnoreCase("London") )
            Score += 2;
    }

    public void Submit(View view) {

        CalculateScore();
        resultString = new String();
        if (Score == 8)
            resultString = "Exellent !! You are the best,, \n Your Score is   :" + Score;
        else if (Score > 5)
            resultString = "Good ,, Your Score is   :" + Score;
        else resultString = "Your Score is   :" + Score;
        Toast.makeText(this, resultString, Toast.LENGTH_SHORT).show();
        // reset score
        Score = 0;
    }


}
