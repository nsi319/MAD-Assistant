package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

import java.util.Locale;


public class ButtonActivity extends AppCompatActivity {

    FragmentTransaction ft;
    ButtonFragment frgButton;
    ImageButtonFragment frgImageButton;
    ToggleSwitchButtonFragment frgToggleButton;
    CheckboxFragment frgCheckbox;
    RadioButtonFragment frgRadioButton;

    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;

    TextToSpeech textToSpeech;
    int play = 0;

    String introduction = "Let us explore the different Buttons and their functionalities in this module. Android Button represents a push-button. The Button class is subclass of TextView class and CompoundButton is the subclass of Button class.\n" +
            "There are different types of buttons in android such as ImageButtons, ToggleButton, RadioButton, CompoundButton etc. We will also be exploring Checkboxes and Radio Buttons. Checkbox is used when you have to show multiple options to the user and the user is allowed to choose as many options as they want, by tapping on them. You can set its default check status as true or false and other properties are same as TextView. RadioButton is used when you have to allow selection of only one option among the list of multiple options. It is used under its parent view (RadioGroup) so that we can get one selected value out of all the listed radio buttons" ;

    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("Buttons");

        textToSpeech = new TextToSpeech(ButtonActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS) {
                    int ttsLanguage = textToSpeech.setLanguage(Locale.US);
                    if(ttsLanguage == TextToSpeech.LANG_MISSING_DATA || ttsLanguage == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.d("MY_LOG_TAG","Language not supported");
                    }
                    Log.d("MY_LOG_TAG","TTS init successful");
                }
                else
                    Log.d("MY_LOG_TAG","TTS init unsuccessful");
            }
        });



        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(play==0) {
                    Toast.makeText(ButtonActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(ButtonActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });


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
    public void isTTSSpeaking(){

        final Handler h =new Handler();
        Runnable r = new Runnable() {
            public void run() {
                if (!textToSpeech.isSpeaking()) {
                    play=0;
                    Log.d("MY_LOG_TAG","done");
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                }
                h.postDelayed(this, 500);
            }
        };
        h.postDelayed(r, 500);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(textToSpeech!=null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }

}
