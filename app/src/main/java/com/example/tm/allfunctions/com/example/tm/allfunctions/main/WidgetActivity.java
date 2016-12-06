package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.tm.allfunctions.R;
import com.example.tm.allfunctions.com.example.tm.allfunctions.widget.AlertDialogActivity;
import com.example.tm.allfunctions.com.example.tm.allfunctions.widget.FloatingButtonActivity;
import com.example.tm.allfunctions.com.example.tm.allfunctions.widget.ProgressBarActivity;
import com.example.tm.allfunctions.com.example.tm.allfunctions.widget.SeekBarActivity;
import com.example.tm.allfunctions.com.example.tm.allfunctions.widget.SpinnerActivity;

public class WidgetActivity extends AppCompatActivity {

    private Button bFloating;
    private Button bSpinner;
    private Button bSeekBar;
    private Button bProgressBar;
    private Button bAlertDialog;
    private ImageButton ibHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        bFloating = (Button) findViewById(R.id.button10);
        bFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WidgetActivity.this, FloatingButtonActivity.class);
                startActivity(i);

            }
        });

        bSpinner = (Button) findViewById(R.id.button11);
        bSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(WidgetActivity.this, SpinnerActivity.class);
                startActivity(i2);

            }
        });

        bSeekBar = (Button) findViewById(R.id.button12);
        bSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(WidgetActivity.this, SeekBarActivity.class);
                startActivity(i3);

            }
        });

        bProgressBar = (Button) findViewById(R.id.button13);
        bProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(WidgetActivity.this, ProgressBarActivity.class);
                startActivity(i4);

            }
        });

        bAlertDialog = (Button) findViewById(R.id.button14);
        bAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(WidgetActivity.this, AlertDialogActivity.class);
                startActivity(i5);

            }
        });

        ibHome = (ImageButton) findViewById(R.id.imageButton6);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(WidgetActivity.this, MainActivity.class);
                startActivity(i6);
                finish();
            }
        });



    }


}
