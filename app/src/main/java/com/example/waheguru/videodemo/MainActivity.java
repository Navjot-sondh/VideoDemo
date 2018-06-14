package com.example.waheguru.videodemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demovideo);
        videoView.start();
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        Log.i("OnCreate","Inside OnCreate method Line 14");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","Inside OnStart method");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","Inside OnResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","inside onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","Inside onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestyroy method","Inside OnDestroy method");
    }
}
