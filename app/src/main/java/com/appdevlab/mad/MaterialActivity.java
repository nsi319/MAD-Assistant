package com.appdevlab.mad;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

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
