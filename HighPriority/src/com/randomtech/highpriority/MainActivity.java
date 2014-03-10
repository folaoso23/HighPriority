package com.randomtech.highpriority;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        
        ViewPager mPager = (ViewPager)findViewById(R.id.pager);
        
        HighPriorityAdapter mAdapter = new HighPriorityAdapter();//Creates adapter that will load data
        
        mPager.setAdapter(mAdapter);
        
    }



    
}