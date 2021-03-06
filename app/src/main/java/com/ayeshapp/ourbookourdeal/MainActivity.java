package com.ayeshapp.ourbookourdeal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper image_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment
        loadFragment(new HomeFragment());

        //Getting bottom navigation and attaching to listener
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;

                case R.id.nav_search:
                    selectedFragment = new SearchFragment();
                    break;

                case R.id.nav_profile:
                    selectedFragment = new ProfileFragment();
                    break;

                case R.id.nav_more:
                    selectedFragment = new MoreFragment();
                    break;
            }

            return loadFragment(selectedFragment);
        }
    };

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void imageFlipper(int image){
        ImageView img = new ImageView(this);
        img.setBackgroundResource(image);

        image_flipper.addView(img);
        image_flipper.setFlipInterval(4000); //4sec
        image_flipper.setAutoStart(true);

        image_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        //image_flipper.setInAnimation(this, android.R.anim.slide_out_right);

    }
}
