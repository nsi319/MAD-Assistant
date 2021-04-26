package com.appdevlab.mad;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerDropdown, spinnerDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

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


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, places);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDropdown.setAdapter(dataAdapter);
        spinnerDialog.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString() + " selected",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
