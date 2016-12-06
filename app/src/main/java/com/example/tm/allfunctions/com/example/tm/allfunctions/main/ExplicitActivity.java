package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tm.allfunctions.R;

public class ExplicitActivity extends AppCompatActivity {

    private Button bGoTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        bGoTo = (Button) findViewById(R.id.button5);
        bGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ExplicitActivity.this, Explicit2Activity.class);
                startActivity(i);
            }
        });

    }


}
