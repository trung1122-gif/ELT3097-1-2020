package com.example.ted;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Talks extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talks);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_talks);
        bottomNavigationView.setSelectedItemId(R.id.miTalks);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.miMyted:
                        startActivity(new Intent(getApplicationContext(),MyTed.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.miPodcasts:
                        startActivity(new Intent(getApplicationContext(),Design.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.miDiscover:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
    public void showPopupTalks(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_talks);
        popup.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this, "watch clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.privacy_policy:
                Toast.makeText(this, "listen clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.login:
                Toast.makeText(this, "addToMyList clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }

}
