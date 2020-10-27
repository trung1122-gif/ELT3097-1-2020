package com.example.ted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;

import com.example.ted.adapter.postersAdapter;
import com.example.ted.object.posters;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView listPosters;
postersAdapter adapter;
ArrayList<posters> postersArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        Setup();
        SetClick();
    }

    private void init(){
        postersArrayList = new ArrayList<>();
        postersArrayList.add(new posters("WorkLife with Adam","May 12, 2020","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/007/479/original/Worklife_Podcast.png?1552318499?w=320"));
        postersArrayList.add(new posters("TED Radio Hour","Friday","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/008/342/original/TRH_Podcast_Tile.png?w=320"));
        postersArrayList.add(new posters("The Talks Daily","21:50","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/007/473/original/TED_Talks_Daily_Podcasts.png?1552317800?w=320"));
        postersArrayList.add(new posters("TED en Espanol","Thursday","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/007/470/original/TED_en_Espanol_Podcast.png?1552317694?w=320"));
        postersArrayList.add(new posters("The TED Interview","Oct 9,2020","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/007/472/original/The_TED_Interview_Podcasts.png?1552317773?w=320"));
        postersArrayList.add(new posters("Sincerely, X: Season","Apr 6, 2020","https://pi.tedcdn.com/r/pb-assets.tedcdn.com/system/baubles/files/000/007/477/original/SincerelyX_Podcast.png?1552318090?w=320"));

        adapter= new postersAdapter(this, 0, postersArrayList);

    }

    private void anhXa(){
        listPosters = findViewById(R.id.listPosters);
    }
    private void Setup(){
        listPosters.setAdapter(adapter);
    }
    private void SetClick(){

    }

}
