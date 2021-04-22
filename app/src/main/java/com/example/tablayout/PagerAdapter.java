package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {
private  int numOfTabs ;
    ArrayList<String> tabTitles = new ArrayList<>();
    public PagerAdapter(FragmentManager fm , int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs ;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        { case 0: return new VaccinFragmennt();
            case 1: return  new MedFrag();
            case 2 : return new AllergieFrag();
            default:
                return null ;
        }




    }

    @Override
    public int getCount() {
        return numOfTabs ;
    }

}
