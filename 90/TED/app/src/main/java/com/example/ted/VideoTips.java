package com.example.ted;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoTips extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_medicine);
        VideoView videoview = findViewById(R.id.video_view);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.videotedtalk_1;
        Uri uri = Uri.parse(videopath);
        videoview.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
}

