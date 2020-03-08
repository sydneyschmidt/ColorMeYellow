package com.cmdf.colormeyellow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

import com.cmdf.colormeyellow.ColorSquare.ColorSquare;

public class MainActivity extends AppCompatActivity {
    public ColorSquare cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ProfileFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_profile:
                            selectedFragment = new ProfileFragment();
                            break;
                        case R.id.nav_question:
                            selectedFragment = new QuestionFragment();
                            break;
                        case R.id.navi_map:
                            selectedFragment = new MapFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true; //want to return clicked item
                }
            };

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        cs = new ColorSquare();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.c1:
                if (checked)
                    cs.setColor(1);
                    switchToMap();
                break;
            case R.id.c2:
                if (checked)
                    cs.setColor(2);
                    switchToMap();
                break;
            case R.id.c3:
                if (checked)
                    cs.setColor(3);
                    switchToMap();
                break;
            case R.id.c4:
                if (checked)
                    cs.setColor(4);
                    switchToMap();
                break;
            case R.id.c5:
                if (checked)
                    cs.setColor(5);
                    switchToMap();
                break;
        }
    }

    private void switchToMap() {
        MapFragment fragment = new MapFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

    public ColorSquare getColorSquare(){
        return cs;
    }


}
