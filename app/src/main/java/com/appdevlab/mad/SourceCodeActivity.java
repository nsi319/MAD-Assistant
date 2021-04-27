package com.appdevlab.mad;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.appdevlab.mad.code.CodeFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SourceCodeActivity extends AppCompatActivity {

    String javaCode, xmlCode;
    String javaLocation, xmlLocation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        javaCode = getIntent().getStringExtra("java");
        xmlCode = getIntent().getStringExtra("xml");
        javaLocation = getIntent().getStringExtra("javaLocation");
        xmlLocation = getIntent().getStringExtra("xmlLocation");

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setBackgroundColor(Color.parseColor("#33b5e5"));

    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        CodeFragment javaCodeFragment = new CodeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("code",javaCode);
        bundle.putString("location",javaLocation);
        javaCodeFragment.setArguments(bundle);

        CodeFragment xmlCodeFragment = new CodeFragment();

        Bundle bundle2 = new Bundle();
        bundle2.clear();
        bundle2.putString("code",xmlCode);
        bundle2.putString("location",xmlLocation);
        xmlCodeFragment.setArguments(bundle2);


        adapter.addFragment(javaCodeFragment, "JAVA");
        adapter.addFragment(xmlCodeFragment, "XML");

        viewPager.setAdapter(adapter);
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

