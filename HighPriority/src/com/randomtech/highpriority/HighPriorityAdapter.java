package com.randomtech.highpriority;
import java.util.Random;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class HighPriorityAdapter extends PagerAdapter{

	
	public HighPriorityAdapter(){
		super();
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((View) object);
	}

	@Override
	public Object instantiateItem(View collection, int pos) {
		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View page = inflater.inflate(R.layout.dynamicview, null);

		RelativeLayout back = (RelativeLayout)page.findViewById(R.id.background);


		

		TextView tv = (TextView)page.findViewById(R.id.lblTxt);
		
		back.setBackgroundColor(Color.parseColor("#282828"));

	

		((ViewPager) collection).addView(page, 0);
		return page;
	}


	@Override
	public void destroyItem(View collection, int position, Object view) {
		//Util.Log("destroying" + position);
		((ViewPager) collection).removeView((View) view);
	}



}