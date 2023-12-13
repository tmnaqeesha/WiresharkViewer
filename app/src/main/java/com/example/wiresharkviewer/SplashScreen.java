package com.example.wiresharkviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mHandler = new Handler();

        mHandler.postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();

        }, 3000);
        }
    }