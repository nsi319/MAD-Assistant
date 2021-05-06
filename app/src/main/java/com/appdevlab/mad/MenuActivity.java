package com.appdevlab.mad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MenuActivity extends AppCompatActivity {

    Button btnPopupMenu;
    FloatingActionButton codeFab;
    String javaCode, xmlCode,xml2Code, javaLocation,xmlLocation,xml2Location;

    TextToSpeech textToSpeech;
    int play = 0;
    String introduction = "In android, Menu is an important part of UI component which is used to provide some common functionality around the application. With the help of menu, users can experience smooth and consistent experience throughout the application.\n" +
            "\n" +
            "In order to use menu, we should define it in separate XML file and use that file in our application based on our requirements. Also, we can use menu APIs to represent user actions and other options in our android application activities. There are three types of menus in Android: Popup, Contextual and Options.\n" +
            "\n" +
            "Each one has a specific use case and code that goes along with it. Go through this section to explore the different types of menus in android.";

    TextView title;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("Menu");

        textToSpeech = new TextToSpeech(MenuActivity.this, new TextToSpeech.OnInitListener() {
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
                    Toast.makeText(MenuActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(MenuActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Code code = new Code();
        javaCode  = code.getMenuJava();
        xmlCode = code.getMenuXml();
        xml2Code = code.getMenuXml2();
        javaLocation = code.getMenuJavaLocation();
        xmlLocation = code.getMenuXmlLocation();
        xml2Location = code.getMenuXml2Location();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SourceCodeActivity.class);
                intent.putExtra("count",3);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);

                String[] tabs = {"XML-Menu"};
                String[] codes = {xml2Code};
                String[] locations = {xml2Location};

                intent.putExtra("tabs",tabs);
                intent.putExtra("codes",codes);
                intent.putExtra("locations",locations);

                startActivity(intent);
            }
        });

        // Context Menu
        List<String> places = new ArrayList<String>();
        places.add("BARN Hall");
        places.add("Octagon Computer Center");
        places.add("Lecture Hall Complex (LHC)");
        places.add("Shopping Center");
        places.add("CSE Department");

        ListView contextList = findViewById(R.id.contextList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,places);
        contextList.setAdapter(arrayAdapter);
        registerForContextMenu(contextList);


        // Popup Menu
        btnPopupMenu = (Button) findViewById(R.id.btn_popup_menu);

        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this,btnPopupMenu);
                popupMenu.getMenuInflater().inflate(R.menu.menu_list,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MenuActivity.this,"Selected option " + item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popupMenu.show();
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list,menu);
        menu.setHeaderTitle("Select an option");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        String place = ((TextView)menuInfo.targetView.findViewById(android.R.id.text1)).getText().toString();

        switch (item.getItemId()) {
            case R.id.add:
                Toast.makeText(MenuActivity.this,"Selected Add for " + place,Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit:
                Toast.makeText(MenuActivity.this,"Selected Edit for " + place,Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(MenuActivity.this,"Selected Delete for " + place,Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return true;
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
