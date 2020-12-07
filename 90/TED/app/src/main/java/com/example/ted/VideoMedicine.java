package com.example.ted;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoMedicine extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_medicine);
        VideoView videoview = findViewById(R.id.video_view);
        String url = "https://www.youtube.com/watch?v=utTw_g4jkDw&list=RDMMpLDC27L-OeI&index=6&ab_channel=POPSMUSIC";

        videoview.setVideoURI(Uri.parse(url));
        videoview.start();

    }
}
