package com.example.TED;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class AdamGrantSpeaker extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adam_grant);
        getSupportActionBar().setTitle("Adam Grant");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




    public void showPopupAdamGrant(View v) {
        PopupMenu popup1 = new PopupMenu(this, v);
        popup1.setOnMenuItemClickListener(this);
        popup1.inflate(R.menu.popup_menu);
        popup1.show();
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
