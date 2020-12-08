package com.example.ted;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ImageButton btnSecond;
    ImageButton btnAdamGrant;
    ImageButton btnMedicine;
    ImageButton btnTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_discover);
        bottomNavigationView.setSelectedItemId(R.id.miDiscover);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.miMyted:
                        startActivity(new Intent(getApplicationContext(), MyTed.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.miPodcasts:
                        startActivity(new Intent(getApplicationContext(), Podcasts.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.miTalks:
                        startActivity(new Intent(getApplicationContext(), Talks.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        btnTips = (ImageButton) findViewById(R.id.btnThird);
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tips.class);
                startActivity(intent);
            }
        });

        btnMedicine = (ImageButton) findViewById(R.id.medicine);
        btnMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Medicine.class);
                startActivity(intent);
            }
        });

        btnSecond = (ImageButton) findViewById(R.id.imageButton_des);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Design.class);
                startActivity(intent);
            }
        });

        btnAdamGrant = (ImageButton) findViewById(R.id.imageButton_adamGrant);
        btnAdamGrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdamGrantSpeaker.class);
                startActivity(intent);
            }
        });
    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.watch:
                Toast.makeText(this, "watch clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.listen:
                Toast.makeText(this, "listen clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.addToMyList:
                Toast.makeText(this, "addToMyList clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }


}




