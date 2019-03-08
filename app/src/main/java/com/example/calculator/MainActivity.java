package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button fullClear;
    private Button toNegativePossitive;
    private Button divide;
    private Button multiply;
    private Button plus;
    private Button minus;
    private Button equils;
    private Button zero;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        one = (Button) findViewById (R.id.B1);
        two = (Button) findViewById (R.id.B2);
        three = (Button) findViewById (R.id.B3);
        four = (Button) findViewById (R.id.B4);
        five = (Button) findViewById (R.id.B5);
        six = (Button) findViewById (R.id.B6);
        seven = (Button) findViewById (R.id.B7);
        eight = (Button) findViewById (R.id.B8);
        nine = (Button) findViewById (R.id.B9);
        clear = (Button) findViewById (R.id.Bclear);
        fullClear = (Button) findViewById (R.id.BfullClear);
        toNegativePossitive = (Button) findViewById (R.id.BplussMinus);
        multiply = (Button) findViewById (R.id.times);
        divide = (Button) findViewById (R.id.Bdevide);
        plus = (Button) findViewById (R.id.BPluss);
        minus = (Button) findViewById (R.id.BMinus);
        equils = (Button) findViewById (R.id.BEquals);
        zero = (Button) findViewById (R.id.B0);
        output = (TextView) findViewById (R.id.output);


    }



}
