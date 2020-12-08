package com.example.ted;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {
    ImageButton btnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        btnButton = (ImageButton) findViewById(R.id.button_play);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tips.this, VideoTips.class);
                startActivity(intent);
            }
        });

    }
}
