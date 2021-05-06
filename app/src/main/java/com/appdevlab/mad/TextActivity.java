package com.appdevlab.mad;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class TextActivity extends AppCompatActivity {

    FloatingActionButton codeFab;

    String javaCode, xmlCode, javaLocation, xmlLocation;

    TextToSpeech textToSpeech;
    int play = 0;

    String introduction = "Let us see how to create different text controls in the Android application. Also we will be able to configure, style, and manipulate the controls in lot number of ways. There are lot of attractive features present that can be used within the application so as to modify.\n" +
            "Basically, there are different types of Text Control's in Android such as\n" +
            "\n" +
            "TextView, \n" +
            "EditText etc.\n" +
            "TextView is the widget used when you want the user to View the Text (such as a label). EditText used when you want the user to be able to edit the text.";

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("TextView & EditText");


        textToSpeech = new TextToSpeech(TextActivity.this, new TextToSpeech.OnInitListener() {
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
                    Toast.makeText(TextActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(TextActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Code code = new Code();

        javaCode  = code.getTextJava();
        xmlCode = code.getTextXml();
        javaLocation = code.getTextJavaLocation();
        xmlLocation = code.getTextXmlLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextActivity.this, SourceCodeActivity.class);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(textToSpeech!=null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
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
}
