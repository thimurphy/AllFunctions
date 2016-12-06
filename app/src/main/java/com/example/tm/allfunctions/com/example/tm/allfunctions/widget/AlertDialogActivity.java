package com.example.tm.allfunctions.com.example.tm.allfunctions.widget;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tm.allfunctions.R;

public class AlertDialogActivity extends AppCompatActivity {

    private Button alertOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        alertOne = (Button) findViewById(R.id.button17);

        alertOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);

                builder.setTitle("Alert Dialog One");
                builder.setMessage("This is alert dialog example one.");
                builder.setIcon(R.drawable.decision);

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),
                                "OK confirmed by the user",
                                Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),
                                "CANCEL selected by the user",
                                Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();


            }
        }); //Alert One end


    }
}
