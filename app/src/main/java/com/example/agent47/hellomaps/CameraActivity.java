package com.example.agent47.hellomaps;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class CameraActivity extends AppCompatActivity {

    static final int VIDEO_CODE = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);


        Button feed = findViewById(R.id.feed);

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoCapture = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                if(videoCapture.resolveActivity(getPackageManager()) != null)
                    startActivityForResult(videoCapture,VIDEO_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent intent) {
        VideoView view = findViewById(R.id.simpleVideoView);
        if(requestCode == VIDEO_CODE && resultCode == RESULT_OK) {
            Uri videoUri = intent.getData();
            view.setVideoURI(videoUri);
            view.start();
        }
    }
}
