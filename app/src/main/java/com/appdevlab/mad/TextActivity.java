package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
