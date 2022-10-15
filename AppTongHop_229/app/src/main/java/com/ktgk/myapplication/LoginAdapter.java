package com.ktgk.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public  class LoginAdapter extends FragmentStateAdapter {

    private  String[] titles= new String[]{"Login","Signup"};
    public LoginAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return  new LoginTabFragment();
            case 1:
                return new SignupTabFragment();
        }
        return  new LoginTabFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}