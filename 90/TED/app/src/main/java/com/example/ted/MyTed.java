package com.example.ted;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyTed extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myted);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_myted);
        bottomNavigationView.setSelectedItemId(R.id.miMyted);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.miDiscover:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.miPodcasts:
                        startActivity(new Intent(getApplicationContext(),Design.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.miTalks:
                        startActivity(new Intent(getApplicationContext(),Talks.class));
                        overridePendingTransition(0,0);
                       return true;
                }
                return false;
            }
        });
    }
}
