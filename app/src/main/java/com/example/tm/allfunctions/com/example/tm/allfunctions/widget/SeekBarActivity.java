package com.example.tm.allfunctions.com.example.tm.allfunctions.widget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import com.example.tm.allfunctions.R;

public class SeekBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        final SeekBar sbRed = (SeekBar) findViewById(R.id.seekBar2);
        final SeekBar sbGreen = (SeekBar) findViewById(R.id.seekBar3);
        final SeekBar sbBlue = (SeekBar) findViewById(R.id.seekBar4);
        final RelativeLayout rlColor = (RelativeLayout) findViewById(R.id.relativeLayout);

        sbRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int iRed = progress;
                int iGreen = sbGreen.getProgress();
                int iBlue = sbBlue.getProgress();
                int color = Color.rgb(iRed,iGreen,iBlue);
                rlColor.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int iRed = sbRed.getProgress();
                int iGreen = progress;
                int iBlue = sbBlue.getProgress();
                int color = Color.rgb(iRed, iGreen,iBlue);
                rlColor.setBackgroundColor(color);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int iRed = sbRed.getProgress();
                int iGreen = sbGreen.getProgress();
                int iBlue = progress;
                int color = Color.rgb(iRed,iGreen,iBlue);
                rlColor.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
