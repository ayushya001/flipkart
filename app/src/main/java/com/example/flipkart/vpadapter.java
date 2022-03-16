package com.example.flipkart;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class vpadapter extends FragmentStateAdapter {
    private String[]titles = new String[]{"login","signup"};

    public vpadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new login();
            case 1:
                return new Signup();
        }
        return new login();

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
