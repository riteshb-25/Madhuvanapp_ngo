package net.smallacademy.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ini_PagerAdapter extends FragmentPagerAdapter {

    public ini_PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull

    @Override

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ini_First();
            case 1:
                return new ini_Second();
            case 2 :
                return new ini_Third();
            case 3 :
                return new ini_Fourth();
            case 4 :
                return new ini_Fifth();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return 0;
    }

}