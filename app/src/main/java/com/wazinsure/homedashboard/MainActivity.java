package com.wazinsure.homedashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCard, ideaCard, addCard, linksCard, wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining cards
        bankCard = (CardView) findViewById(R.id.bank_card);
        ideaCard = (CardView) findViewById(R.id.idea_card);
        addCard = (CardView) findViewById(R.id.add_card);
        linksCard = (CardView) findViewById(R.id.links_card);
        wifiCard = (CardView) findViewById(R.id.wifi_card);

        //Add click listener to the cards
        bankCard.setOnClickListener(this);
        ideaCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {

            case R.id.bank_card: i = new Intent(this,Bank.class);startActivity(i);break;
            case R.id.idea_card :i= new Intent(this, Ideas.class);startActivity(i);break;
            case R.id.add_card: i= new Intent(this,Add.class);startActivity(i);break;
            case R.id.wifi_card: i= new Intent(this,Wifi.class);startActivity(i);break;
            case R.id.links_card: i= new Intent(this,Links.class);startActivity(i);break;

            default:break;


        }
    }
}