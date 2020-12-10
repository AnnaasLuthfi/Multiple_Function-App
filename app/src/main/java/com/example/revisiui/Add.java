package com.example.revisiui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    int qty = 0;
    int qty2 = 0;
    int qty3 = 0;
    int qty4 = 0;
    int qty5 = 0;
    int qty6 = 0;
    int qty7 = 0;
    int qty8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        getSupportActionBar().setTitle("Add Order");
    }

//  qty  Rp .6000
    public void pressIncrement(View view){
        qty += 1;
        display(qty);
    }

    public void pressDecrements(View view){
        qty -= 1;
        display(qty);
    }

    private void display(int qty) {
        TextView jmls = (TextView) findViewById(R.id.totalqty1);
        jmls.setText("" + qty);
    }

//  qty2  Rp. 3500

    public void pressIncrement2(View view){
        qty2 += 1;
        display2(qty2);
    }

    public void pressDecrements2(View view){
        qty2 -= 1;
        display2(qty2);
    }

    private void display2(int qty2) {
        TextView jmls2 = (TextView) findViewById(R.id.totalqty2);
        jmls2.setText("" + qty2);
    }

//    qty3

    public void pressIncrement3(View view){
        qty3 += 1;
        display3(qty3);
    }

    public void pressDecrements3(View view){
        qty3 -= 1;
        display3(qty3);
    }

    private void display3(int qty3) {
        TextView jmls3 = (TextView) findViewById(R.id.totalqty3);
        jmls3.setText("" + qty3);
    }


//    qty4

    public void pressIncrement4(View view){
        qty4 += 1;
        display4(qty4);
    }

    public void pressDecrements4(View view){
        qty4 -= 1;
        display4(qty4);
    }

    private void display4(int qty4) {
        TextView jmls4 = (TextView) findViewById(R.id.totalqty4);
        jmls4.setText("" + qty4);
    }


//    qty5

    public void pressIncrement5(View view){
        qty5 += 1;
        display5(qty5);
    }

    public void pressDecrements5(View view){
        qty5 -= 1;
        display5(qty5);
    }

    private void display5(int qty5) {
        TextView jmls5 = (TextView) findViewById(R.id.totalqty5);
        jmls5.setText("" + qty5);
    }


//    qty6

    public void pressIncrement6(View view){
        qty6 += 1;
        display6(qty6);
    }

    public void pressDecrements6(View view){
        qty6 -= 1;
        display6(qty6);
    }

    private void display6(int qty6) {
        TextView jmls6 = (TextView) findViewById(R.id.totalqty6);
        jmls6.setText("" + qty6);
    }


//    qty7

    public void pressIncrement7(View view){
        qty7 += 1;
        display7(qty7);
    }

    public void pressDecrements7(View view){
        qty7 -= 1;
        display7(qty7);
    }

    private void display7(int qty7) {
        TextView jmls7 = (TextView) findViewById(R.id.totalqty7);
        jmls7.setText("" + qty7);
    }


//    qty8

    public void pressIncrement8(View view){
        qty8 += 1;
        display8(qty8);
    }

    public void pressDecrements8(View view){
        qty8 -= 1;
        display8(qty8);
    }

    private void display8(int qty8) {
        TextView jmls8 = (TextView) findViewById(R.id.totalqty8);
        jmls8.setText("" + qty8);
    }

//    Total Price

    public void sumPrice(View view) {
        displayPrice(qty, qty2, qty3, qty4, qty5, qty6, qty7, qty8);
    }

    public void displayPrice(int qty, int qty2, int qty3, int qty4, int qty5, int qty6, int qty7, int qty8){
        int PriceTotal = 0;
        PriceTotal = (qty * 6000) + (qty2 * 3500) + (qty3 * 12500) + (qty4 * 5500) + (qty5 * 20000) + (qty6 * 16000) + (qty7 * 11500 ) + (qty8 * 10000);
        TextView total = (TextView) findViewById(R.id.TotalHarga);
        total.setText("Rp. " + PriceTotal);
    }
}