package com.example.tm.allfunctions.com.example.tm.allfunctions.widget;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tm.allfunctions.R;


public class AsyncActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwo;
    private Button bAddNumbers;
    private SeekBar skAsyncProgress;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        etNumberOne = (EditText) findViewById(R.id.editText2);
        etNumberTwo = (EditText) findViewById(R.id.editText3);
        bAddNumbers = (Button) findViewById(R.id.button4);
        skAsyncProgress = (SeekBar) findViewById(R.id.seekBar);
        tvResult = (TextView) findViewById(R.id.textView3);

        bAddNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer iFirst = Integer.parseInt(""+etNumberOne.getText());
                Integer iSecnd = Integer.parseInt(""+etNumberTwo.getText());

                //Call async class with two integers parameters
                new MyAsyncClass().execute(iFirst, iSecnd);
            }
        });


    }//end of onCreate method

    //Create an inner class for Async Task
    public class MyAsyncClass extends AsyncTask<Integer, Integer, String>{

        //Create a method called onPreExecute
        protected void onPreExecute() {
            //Pre execute code below
            //Set text to text view - eg: Started async task! Please wait...
            tvResult.setText("Started Async Task! Please wait...");
            //Set progress to async task and set it to zero
            skAsyncProgress.setProgress(0);

        }//End of onPreExecute method

        //Create a method called onProgressUpdate
        protected void onProgressUpdate(Integer... progress) {

            //Execute code below on progress update
            //Create a progress variable and set it to start an array from zero
            int iProgress = progress[0];
            //Set text to textview to show the result
            tvResult.setText(""+iProgress+" % Completed");
            //Set progress to async task using the variable created above
            skAsyncProgress.setProgress(iProgress);

        }//End of method onProgressUpdate

        //Mandatory implementation - alt + enter
        @Override
        protected String doInBackground(Integer... params) {
            //Create two variable to handle both int numbers
            int iFirst = params[0];
            int iSecnd = params[1];
            int iTotalTime = 10000; // 10 sec for Thread.sleep

            for (int i=1; i<6; i++){
                try{
                    Thread.sleep(iTotalTime/5);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                    return "Exception -- " + ie.getMessage();
                }
                this.publishProgress(20*i);
            }

            int iSum = iFirst + iSecnd;

            return ""+iSum;
        }

        //Create a method to handle pos execution
        protected void onPostExecute(String result){
            Toast.makeText(getApplicationContext(), "Result - "+ result +
                    "\nCompleted after 10 seconds", Toast.LENGTH_SHORT).show();
            tvResult.setText("Result - "+ result + "\nCompleted after 10 seconds");
            skAsyncProgress.setProgress(100);

        }

    }// end of MyAsyncClass
}
