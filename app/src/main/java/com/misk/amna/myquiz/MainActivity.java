package com.misk.amna.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton Q1Y;
    RadioButton Q1N;
    RadioButton Q2Y;
    RadioButton Q2N;
    RadioButton Q3Y;
    RadioButton Q3N;
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
        Score=0;
    }



    void Submit(View view)
    {

        Q1Y.isChecked();

        TextView txt=new TextView(this);
        txt.setText("Thank You");

        setContentView(txt);
    }



}
