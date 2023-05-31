package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), login.class));
                finish();
            }
        }, 3000L);

//        VideoView videoView = findViewById(R.id.videoView);
//        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tes;
//        videoView.setVideoPath(videoPath);
//        videoView.start();
    }
}