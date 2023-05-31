package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    home homes = new home();
    payment payment = new payment();
    profile profile = new profile();
    academic academic = new academic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.navigation_bar);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, homes).commit();
                        return true;
                    case R.id.payment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, payment).commit();
                        return true;
                    case R.id.academic:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, academic).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, profile).commit();
                        return true;
                }
                return false;
            }
        });
    }
}