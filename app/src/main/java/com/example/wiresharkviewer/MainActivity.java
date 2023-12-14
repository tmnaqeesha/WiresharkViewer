package com.example.wiresharkviewer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2, card3, card4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.card_tous);
        card2 = (CardView) findViewById(R.id.card_tcp);
        card3 = (CardView) findViewById(R.id.card_ipv4);
        card4 = (CardView) findViewById(R.id.card_arp);

        card1.setOnClickListener((View.OnClickListener) this);
        card2.setOnClickListener((View.OnClickListener) this);
        card3.setOnClickListener((View.OnClickListener) this);
        card4.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.card_tous) {
            intent = new Intent(this, Tous.class);
            startActivity(intent);
        } else if (v.getId() == R.id.card_tcp) {
            // Handle card_tcp click
        } else if (v.getId() == R.id.card_ipv4) {
            // Handle card_ipv4 click
        } else if (v.getId() == R.id.card_arp) {
            // Handle card_arp click
        }
    }
}

