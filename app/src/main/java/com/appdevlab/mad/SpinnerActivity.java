package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
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

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerDropdown, spinnerDialog;
    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title)).setText("Spinner");

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
        Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString() + " selected",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
