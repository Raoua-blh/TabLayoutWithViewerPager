package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tablayout = findViewById(R.id.tabBar);
        TabItem tabVaccin = findViewById(R.id.tabvaccin);
        TabItem tabMedi = findViewById(R.id.tabMedic);
        TabItem tabAllergie = findViewById(R.id.tabAllergie);
        ViewPager viewpager =findViewById(R.id.viewpagerTab);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);

        //

        viewpager.addOnPageChangeListener(new TabLayout
                .TabLayoutOnPageChangeListener(tablayout));
        // change fragement when i click on  tab item
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}