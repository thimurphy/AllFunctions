package com.example.tm.allfunctions.com.example.tm.allfunctions.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tm.allfunctions.R;

public class CameraActivity extends AppCompatActivity {

    //Request image capture static final int variable set to 1
    static final int REQUEST_IMAGE_CAPTURE = 1;
    //request image get static final int variable set to 2
    static final int REQUEST_IMAGE_GET = 2;
    //my permissions request camera static final int variable set to 3
    static final int PERMISSIONS_REQUEST_CAMERA = 3;

    private ImageView ivImage;//imageview 2
    private Button bGallery;//button 18
    private Button bCamera;//button 21
    private TextView tvImageText; //textview 14


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        ivImage = (ImageView) findViewById(R.id.imageView2);
        tvImageText = (TextView) findViewById(R.id.textView14);
        bGallery = (Button) findViewById(R.id.button18);
        bCamera = (Button) findViewById(R.id.button21);

        bGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                galleryIntentCode();
            }
        });

        bCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePicture();
            }
        });


    }


    private void takePicture() {

    }

    private void galleryIntentCode() {

    }
}
