package com.appdevlab.mad;

import android.content.Intent;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TextActivity extends AppCompatActivity {

    FloatingActionButton codeFab;

    String javaCode, xmlCode, javaLocation, xmlLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title)).setText("TextView & EditText");

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
}
