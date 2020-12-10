package com.example.revisiui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private CardView ProfileCard, AddCard, CalenderCard, CalculatorCard, GalleryCard, MapsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProfileCard = (CardView) findViewById(R.id.ProfileCard);
        ProfileCard.setOnClickListener(this);
        AddCard = (CardView) findViewById(R.id.AddCard);
        AddCard.setOnClickListener(this);
        CalenderCard = (CardView) findViewById(R.id.CalenderCard);
        CalenderCard.setOnClickListener(this);
        CalculatorCard = (CardView) findViewById(R.id.CalculatorCard);
        CalculatorCard.setOnClickListener(this);
        GalleryCard = (CardView) findViewById(R.id.ImageCard);
        GalleryCard.setOnClickListener(this);
        MapsCard = (CardView) findViewById(R.id.MapsCard);
        MapsCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.ProfileCard : i = new Intent(this, profile.class); startActivity(i); break;
            case R.id.AddCard : i = new Intent(this, Add.class); startActivity(i); break;
            case R.id.CalenderCard : i = new Intent(this, calender.class); startActivity(i); break;
            case R.id.CalculatorCard : i = new Intent(this, Calculator.class); startActivity(i); break;
            case R.id.ImageCard : i = new Intent(this, Gallery.class); startActivity(i); break;
            case R.id.MapsCard : i = new Intent(this, Maps.class); startActivity(i); break;
            default: break;
        }

    }
}