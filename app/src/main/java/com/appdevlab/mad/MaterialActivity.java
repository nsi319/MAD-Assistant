package com.appdevlab.mad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.appdevlab.mad.model.Code;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MaterialActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;

    MaterialButton openBottomSheet,closeBottomSheet;
    BottomSheetBehavior bottomSheetBehavior;

    CoordinatorLayout coordinatorLayout;
    MaterialButton btnDefaultSnackbar, btnActionSnackbar;
    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title)).setText("Material Design");

        Code code = new Code();
        javaCode  = code.getMaterialJava();
        xmlCode = code.getMaterialXml();
        javaLocation = code.getMaterialJavaLocation();
        xmlLocation = code.getMaterialXmlLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaterialActivity.this, SourceCodeActivity.class);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);
                startActivity(intent);
            }
        });

        // FAB
        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked on Floating Action Button",Toast.LENGTH_SHORT).show();
            }
        });

        //Bottom Sheet
        openBottomSheet = findViewById(R.id.open_bottom_sheet);
        closeBottomSheet = findViewById(R.id.close_bottom_sheet);

        View bottomSheet = findViewById(R.id.bottom_sheet);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        openBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    Toast.makeText(getApplicationContext(),"Opening Bottom Sheet",Toast.LENGTH_SHORT).show();
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
                else
                    Toast.makeText(getApplicationContext(),"Bottom Sheet is already open",Toast.LENGTH_SHORT).show();
            }
        });

        closeBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Closing Bottom Sheet",Toast.LENGTH_SHORT).show();
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            }
        });


        // Snackbar
        coordinatorLayout = findViewById(R.id.coordinator);
        btnDefaultSnackbar = findViewById(R.id.btn_default_snackbar);
        btnActionSnackbar = findViewById(R.id.btn_action_snackbar);

        btnDefaultSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinatorLayout,"This is a default snackbar", Snackbar.LENGTH_LONG).show();
            }
        });

        btnActionSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(coordinatorLayout,"Message Deleted",Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar.make(coordinatorLayout,"Message Restored",Snackbar.LENGTH_SHORT).show();
                            }
                        });
                snackbar.show();
            }
        });
    }
}
