package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerDropdown, spinnerDialog;
    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;

    TextToSpeech textToSpeech;
    int play = 0;
    String introduction = "Android Spinner is a view similar to the dropdown list which is used to select one option from the list of options. It provides an easy way to select one item from the list of items and it shows a dropdown list of all values when we click on it. The default value of the android spinner will be the currently selected value and by using Adapter we can easily bind the items to the spinner objects. Generally, we populate our Spinner control with a list of items by using an ArrayAdapter. This example demonstrates the different places at N I T Trichy, you need to select a place from the given list.";
    TextView title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("Spinner");

        textToSpeech = new TextToSpeech(SpinnerActivity.this, new TextToSpeech.OnInitListener() {
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
                    Toast.makeText(SpinnerActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(SpinnerActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Code code = new Code();
        javaCode  = code.getSpinnerJava();
        xmlCode = code.getSpinnerXml();
        javaLocation = code.getSpinnerJavaLocation();
        xmlLocation = code.getSpinnerXmlLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SpinnerActivity.this, SourceCodeActivity.class);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);
                startActivity(intent);
            }
        });


        spinnerDropdown = (Spinner) findViewById(R.id.spinner_dropdown);
        spinnerDialog = (Spinner) findViewById(R.id.spinner_dialog);

        spinnerDropdown.setOnItemSelectedListener(this);
        spinnerDialog.setOnItemSelectedListener(this);

        List<String> places = new ArrayList<String>();
        places.add("BARN Hall");
        places.add("Octagon Computer Center");
        places.add("Lecture Hall Complex (LHC)");
        places.add("Shopping Center");
        places.add("CSE Department");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, places);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDropdown.setAdapter(arrayAdapter);
        spinnerDialog.setAdapter(arrayAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,parent.getItemAtPosition(position).toString() + " selected",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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
