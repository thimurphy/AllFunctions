package com.example.tm.allfunctions.com.example.tm.allfunctions.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tm.allfunctions.R;

public class SpinnerActivity extends AppCompatActivity {

    String[] names = {"Ciaran Byrne", "David Byrne", "Rodrigo Castilho Avelino", "Kevin Clarke",
            "Fernando Paulo Correia Morais", "Adam Goddard", "Andrei Ivanov", "Jason Kavanagh",
            "Graham Kinsella", "Ronan Lafford", "Stephen McDonnell", "David McEvoy", "Octavian Morcov",
            "Fintan Murphy", "Thiago Murphy", "Adam OCallaghan", "John O Shea", "Sena Onsho",
            "Conor Prunty", "Niall Quinn", "Ronan Ratty", "Eoin Sutton", "Stephen Tyrrell"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        final AutoCompleteTextView autoCompleteNames =
                (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        final Spinner spinnerNames = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> textAdapterForAutoComplete =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, names);

        ArrayAdapter<String> textAdapterForSpinner = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, names);

        autoCompleteNames.setAdapter(textAdapterForAutoComplete);
        spinnerNames.setAdapter(textAdapterForSpinner);

        autoCompleteNames.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Auto Complete name selected: \n"
                        + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

        spinnerNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Spinner name selected: \n" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
