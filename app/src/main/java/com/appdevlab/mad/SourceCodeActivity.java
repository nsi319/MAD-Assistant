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

        javaCode = "package com.appdevlab.mad.code;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.annotation.Nullable;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "import com.appdevlab.mad.R;\n" +
                "\n" +
                "public class JavaCodeFragment extends Fragment {\n" +
                "    String code;\n" +
                "\n" +
                "    public  JavaCodeFragment () {\n" +
                "    }\n" +
                "\n" +
                "    @Nullable\n" +
                "    @Override\n" +
                "    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
                "        View view =  inflater.inflate(R.layout.fragment_code,container,false);\n" +
                "\n" +
                "        if(this.getArguments() != null)\n" +
                "            code = this.getArguments().getString(\"java\");\n" +
                "        else\n" +
                "            code = \"NO CODE SNIPPET AVAILABLE\";\n" +
                "\n" +
                "\n" +
                "        ((TextView)view.findViewById(R.id.tv_java_code)).setText(code);\n" +
                "\n" +
                "        return  view;\n" +
                "    }\n" +
                "}\n";

        xmlCode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:backgroundTint=\"@android:color/white\"\n" +
                "    android:padding=\"10dp\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/tv_file_location\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"File Location: \"\n" +
                "        android:textColor=\"@android:color/black\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:paddingVertical=\"5dp\" \n" +
                "        />\n" +
                "\n" +
                "    <io.github.kbiakov.codeview.CodeView\n" +
                "        android:id=\"@+id/tv_code\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        />\n" +
                "    \n" +
                "</LinearLayout>";

        javaLocation = "java/MainActivity.java";
        xmlLocation = "res/layout/activity_main.xml";

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
