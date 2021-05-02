package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.appdevlab.mad.button.ButtonFragment;
import com.appdevlab.mad.button.CheckboxFragment;
import com.appdevlab.mad.button.ImageButtonFragment;
import com.appdevlab.mad.button.RadioButtonFragment;
import com.appdevlab.mad.button.ToggleSwitchButtonFragment;
import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ButtonActivity extends AppCompatActivity {

    FragmentTransaction ft;
    ButtonFragment frgButton;
    ImageButtonFragment frgImageButton;
    ToggleSwitchButtonFragment frgToggleButton;
    CheckboxFragment frgCheckbox;
    RadioButtonFragment frgRadioButton;

    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title)).setText("Buttons");

        Code code = new Code();
        javaCode  = code.getButtonJava();
        xmlCode = code.getButtonXml();
        javaLocation = code.getButtonJavaLocation();
        xmlLocation = code.getButtonXmlLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonActivity.this, SourceCodeActivity.class);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);
                startActivity(intent);
            }
        });


        frgButton = new ButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.button_frg_container, frgButton).commit();

        frgImageButton = new ImageButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.image_button_frg_container, frgImageButton).commit();

        frgToggleButton = new ToggleSwitchButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.toggle_button_frg_container, frgToggleButton).commit();

        frgCheckbox = new CheckboxFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.checkbox_frg_container, frgCheckbox).commit();

        frgRadioButton = new RadioButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.radio_button_frg_container, frgRadioButton).commit();


    }

}
