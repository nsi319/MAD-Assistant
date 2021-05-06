package com.appdevlab.mad;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
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
    int count=2;
    ArrayList<String> newTabs, newCodes, newFileLocations;

    TextView title;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("Source Code");
        title.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

        javaCode = getIntent().getStringExtra("java");
        xmlCode = getIntent().getStringExtra("xml");
        javaLocation = getIntent().getStringExtra("javaLocation");
        xmlLocation = getIntent().getStringExtra("xmlLocation");


        if(getIntent().getIntExtra("count",2)!=2) {
            count = getIntent().getIntExtra("count",2);
            newTabs =  new ArrayList<>();
            for(String s1 : getIntent().getStringArrayExtra("tabs")) {
                newTabs.add(s1);
                Log.d("MY_LOG_TAG_TAB",s1);
            }
            newCodes =  new ArrayList<>();
            for(String s2 : getIntent().getStringArrayExtra("codes")) {
                newCodes.add(s2);
                Log.d("MY_LOG_TAG_CODE",s2);
            }
            newFileLocations =  new ArrayList<>();
            for(String s3 : getIntent().getStringArrayExtra("locations")) {
                newFileLocations.add(s3);
                Log.d("MY_LOG_TAG_LOC",s3);
            }
        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(viewPager, newTabs, newCodes, newFileLocations);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

    }
    private void setupViewPager(ViewPager viewPager, ArrayList<String> newTabs,ArrayList<String> newCodes, ArrayList<String> newFileLocations) {
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

        if(count!=2) {
            for(int i=0;i<count-2;i++) {
                CodeFragment codeFragment = new CodeFragment();

                Bundle bundle3 = new Bundle();
                bundle3.clear();
                bundle3.putString("code",newCodes.get(i));
                bundle3.putString("location",newFileLocations.get(i));
                codeFragment.setArguments(bundle3);
                adapter.addFragment(codeFragment, newTabs.get(i));

                Log.d("MY_LOG_TAG",i + newTabs.get(i) + " " + newFileLocations.get(i));
            }
        }

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

