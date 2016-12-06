package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tm.allfunctions.R;

public class SplashActivity extends AppCompatActivity {

    private static final int DELAY_SEC = 10000; //10 sec for thread.sleep

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, DELAY_SEC);


    }
}
