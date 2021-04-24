package com.appdevlab.mad;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.appdevlab.mad.component.button.ButtonFragment;
import com.appdevlab.mad.component.button.CheckboxFragment;
import com.appdevlab.mad.component.button.ImageButtonFragment;
import com.appdevlab.mad.component.button.RadioButtonFragment;
import com.appdevlab.mad.component.button.ToggleSwitchButtonFragment;


public class ButtonComponentActivity extends AppCompatActivity {

    FragmentTransaction ft;
    ButtonFragment frgButton;
    ImageButtonFragment frgImageButton;
    ToggleSwitchButtonFragment frgToggleButton;
    CheckboxFragment frgCheckbox;
    RadioButtonFragment frgRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_component);

        Log.i("ButtonComponentActivity", "onCreate: [x]");



        // Attach Button Fragment
        frgButton = new ButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.button_frg_container, frgButton).commit();

        // Attach ImageButton Fragment
        frgImageButton = new ImageButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.image_button_frg_container, frgImageButton).commit();

        // Attach ToggleButton Fragment
        frgToggleButton = new ToggleSwitchButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.toggle_button_frg_container, frgToggleButton).commit();

        // Attach Checkbox Fragment
        frgCheckbox = new CheckboxFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.checkbox_frg_container, frgCheckbox).commit();

        // Attach Checkbox Fragment
        frgRadioButton = new RadioButtonFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.radio_button_frg_container, frgRadioButton).commit();

        // Attach more fragment

    }

}
