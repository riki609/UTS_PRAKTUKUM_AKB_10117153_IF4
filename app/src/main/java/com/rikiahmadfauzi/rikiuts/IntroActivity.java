package com.rikiahmadfauzi.rikiuts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    introViewPagerAdapter introViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //fill list screen
        List<ScreenItem> mList = new ArrayList<> ();
        mList.add(new ScreenItem("","",R.drawable.riki_1));
        mList.add(new ScreenItem("","",R.drawable.riki_2));
        mList.add(new ScreenItem("","",R.drawable.riki_3));


        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new introViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);
    }
}
