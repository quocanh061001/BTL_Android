package com.example.appthiblxa1;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class pageth extends FragmentStateAdapter {

//private Activity hn;
    public pageth(@NonNull FragmentActivity fragmentActivity) {
       // hn=fragmentActivity;
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new thuchanhFragment();
            case 1:
                return new thuchanh2Fragment();
            default:
                return new thuchanhFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
