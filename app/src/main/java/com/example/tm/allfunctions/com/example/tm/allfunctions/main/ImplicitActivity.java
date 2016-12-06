package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tm.allfunctions.R;

public class ImplicitActivity extends AppCompatActivity {

    private EditText etURL;
    private Button bBrowser; //Button8

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        etURL = (EditText) findViewById(R.id.editText);
        bBrowser = (Button) findViewById(R.id.button8);
        bBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sURL = ""+etURL.getText();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(sURL));
                startActivity(i);
            }
        });

    }

}
