package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tm.allfunctions.R;

public class Explicit2Activity extends AppCompatActivity {

    private Button bHome;
    private Button bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit2);

        bHome = (Button) findViewById(R.id.button6);
        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Explicit2Activity.this, MainActivity.class);
                startActivity(i2);
                finish();
            }
        });

        bBack = (Button) findViewById(R.id.button7);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Explicit2Activity.this, ExplicitActivity.class);
                startActivity(i3);

            }
        });

    }
}
