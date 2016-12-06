package com.example.tm.allfunctions.com.example.tm.allfunctions.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.tm.allfunctions.R;

import static android.R.attr.id;

public class ProgressBarActivity extends AppCompatActivity {

    private Button bShow;
    private Button bHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        bShow = (Button) findViewById(R.id.button16);
        bHide = (Button) findViewById(R.id.button15);

        bShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        bHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

    }
}
