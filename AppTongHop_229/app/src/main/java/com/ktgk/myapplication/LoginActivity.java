package com.ktgk.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LoginActivity extends AppCompatActivity {

    LoginAdapter loginAdapter;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private  String[] titles= new String[]{"Login","Signup"};

    //int v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        loginAdapter =new LoginAdapter(this);


        viewPager2.setAdapter(loginAdapter);

        new TabLayoutMediator(tabLayout,viewPager2,((tab, position)->tab.setText(titles[position]))).attach();

        //tabLayout.setTranslationY(300);
       // tabLayout.setAlpha(v);
        //tabLayout.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();



    }
}