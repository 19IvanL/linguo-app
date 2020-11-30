package com.example.linguo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.linguo.fragments.CourseFragment;
import com.example.linguo.fragments.LeagueFragment;
import com.example.linguo.fragments.ProfileFragment;
import com.example.linguo.fragments.ShopFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        //Start in the Course Fragment
        showSelectedFragment(new Course_Fragment());
=======
        //Starts on the Course Fragment
        showSelectedFragment(new CourseFragment());
>>>>>>> dev

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            //Fragment Selector
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.course_menu){
                    showSelectedFragment(new CourseFragment());
                }

                if (item.getItemId() == R.id.profile_menu){
                    showSelectedFragment(new ProfileFragment());
                }

                if (item.getItemId() == R.id.league_menu){
                    showSelectedFragment(new LeagueFragment());
                }

                if (item.getItemId() == R.id.shop_menu){
                    showSelectedFragment(new ShopFragment());
                }

                return true;
            }
        });
    }

    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}