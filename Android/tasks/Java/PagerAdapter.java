package com.cypher.tasks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm,int NumOfTabs){
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                tab1 tb1 = new tab1();
                return tb1;
            case 1:
                tab2 tb2 = new tab2();
                return tb2;
            case 2:
                tab3 tb3 = new tab3();
                return tb3;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
