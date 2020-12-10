package com.example.revisiui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator extends AppCompatActivity {

    private int[] numericButton = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                                    R.id.button8, R.id.button9};

    private int[] operatorButton = {R.id.buttonkali, R.id.buttontambah, R.id.buttonkurang, R.id.buttonbagi};

    private TextView display;
    private boolean lastNumeric;
    private boolean stateError;
    private boolean lastDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setTitle("Calculator");
        this.display=(TextView) findViewById(R.id.display);
        setNumericOnClickListener();
        setOperatorOnClickListener();
    }

    private void setNumericOnClickListener() {
        View.OnClickListener listener = new View.OnClickListener(){                                 // Create a common OnClickListener
            @Override
            public void onClick(View v) {                                                           // Just append/set the text of clicked button
                Button button = (Button) v;
                if(stateError){
                    display.setText(button.getText());                                              // If current state is Error, replace the error message
                    stateError = false;
                }else{
                    display.append(button.getText());                                               // If not, already there is a valid expression so append to it
                }
                lastNumeric = true;                                                                 // set the flag
            }
        };
        for(int id : numericButton){                                                                // Assign the listener to all the numeric buttons
            findViewById(id).setOnClickListener(listener);
        }

    }

    private void setOperatorOnClickListener() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the current state is Error do not append the operator
                // If the last input is number only, append the operator
                if (lastNumeric && !stateError) {
                    Button button = (Button) v;
                    display.append(button.getText());
                    lastNumeric = false;
                    lastDot = false;    // Reset the DOT flag
                }
            }
        };
        for (int id : operatorButton) {
            findViewById(id).setOnClickListener(listener);
        }

        findViewById(R.id.buttondot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lastNumeric && !stateError && !lastDot) {
                    display.append(".");
                    lastNumeric = false;
                    lastDot = true;
                }
            }
        });

        findViewById(R.id.buttondel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");  // Clear the screen
                // Reset all the states and flags
                lastNumeric = false;
                stateError = false;
                lastDot = false;
            }
        });

        findViewById(R.id.buttoncalcu).setOnClickListener(new View.OnClickListener() {              // Equal button
            @Override
            public void onClick(View v) {
                onEqual();
            }
        });
    }

    private void onEqual() {
        if (lastNumeric && !stateError){
            String txt = display.getText().toString();                                              // Read the expression
            Expression expression = new ExpressionBuilder(txt).build();                             // Create an Expression (A class from exp4j library)
            try {                                                                                   // Calculate the result and display
                double result = expression.evaluate();
                display.setText(Double.toString(result));
                lastDot = true;                                                                     // Result contains a dot
            } catch (ArithmeticException ex){                                                       // Display an error message
                display.setText("Error");
                stateError = true;
                lastNumeric = false;
            }
        }
    }
}