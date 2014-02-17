package com.dacer.cirpageindicator;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager)findViewById(R.id.view_pager);
        pager.setAdapter(new IntroPagerAdapter(getSupportFragmentManager()));
        CirPageIndicator indicator = (CirPageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(pager);
		
	}

	public class IntroPagerAdapter extends FragmentPagerAdapter {

        public IntroPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new MyFragment();
        }

        @Override
        public int getCount() { return 4; }

        @Override
        public CharSequence getPageTitle(int position) { return ""; }
    }
}
