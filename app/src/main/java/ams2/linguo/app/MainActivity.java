package ams2.linguo.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;

import ams2.linguo.app.fragments.CourseFragment;
import ams2.linguo.app.fragments.LeagueFragment;
import ams2.linguo.app.fragments.ProfileFragment;
import ams2.linguo.app.fragments.ShopFragment;
import ams2.linguo.app.util.LipeRMIClient;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO Test RMI Client
        System.out.println("Alla vamos...");
        LipeRMIClient lpc = new LipeRMIClient();
        System.out.println(lpc.execute());
        System.out.println("Cosa terminada");

        // Starts on the Course Fragment
        showSelectedFragment(new CourseFragment());

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