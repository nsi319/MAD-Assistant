package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    GridLayout glHome;

    final int GRID_ITEM_TV_ET = 0;
    final int GRID_ITEM_BTN = 1;
    final int GRID_ITEM_SEEKBAR = 2;
    final int GRID_ITEM_PICKERS = 3;
    final int GRID_ITEM_SPINNER = 4;
    final int GRID_ITEM_IV = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        glHome = (GridLayout) findViewById(R.id.main_gl_home);

        // Set Event
        setGridItemClickEvent(glHome);
    }

    private void setGridItemClickEvent(GridLayout glHome) {
        // Loop all child item of Grid Layout
        for (int i = 0; i < glHome.getChildCount(); i++) {

            CardView cvCurrentItem = (CardView) glHome.getChildAt(i);

            final int index = i;

            cvCurrentItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (index) {
                        case GRID_ITEM_TV_ET:
                            Toast.makeText(getApplicationContext(), "TextView & EditText", Toast.LENGTH_SHORT).show();
                            Intent iTextComponentAct = new Intent(getApplicationContext(), TextComponentActivity.class);
                            startActivity(iTextComponentAct);
                            break;
                        case GRID_ITEM_BTN:
                            Toast.makeText(getApplicationContext(), "Buttons", Toast.LENGTH_SHORT).show();
                            Intent iButtonComponentAct = new Intent(getApplicationContext(), ButtonComponentActivity.class);
                            startActivity(iButtonComponentAct);
                            break;
                        case GRID_ITEM_SEEKBAR:
                            Toast.makeText(getApplicationContext(), "Seekbar", Toast.LENGTH_SHORT).show();
                            Intent iSeekbarComponentAct = new Intent(getApplicationContext(), SeekbarComponentActivity.class);
                            startActivity(iSeekbarComponentAct);
                            break;
                        case GRID_ITEM_PICKERS:
                            Toast.makeText(getApplicationContext(), "Pickers", Toast.LENGTH_SHORT).show();
                            Intent iPickerComponentAct = new Intent(getApplicationContext(), PickerActivity.class);
                            startActivity(iPickerComponentAct);
                            break;
                        case GRID_ITEM_SPINNER:
                            Toast.makeText(getApplicationContext(), "Spinner", Toast.LENGTH_SHORT).show();

                            break;
                        case GRID_ITEM_IV:
                            Toast.makeText(getApplicationContext(), "ImageView", Toast.LENGTH_SHORT).show();

                            break;
                        case 6:
                            Toast.makeText(getApplicationContext(), "Toast 6", Toast.LENGTH_SHORT).show();

                            break;
                        case 7:
                            Toast.makeText(getApplicationContext(), "Toast 7", Toast.LENGTH_SHORT).show();

                            break;
                        case 8:
                            Toast.makeText(getApplicationContext(), "Toast 8", Toast.LENGTH_SHORT).show();

                            break;
                        case 9:
                            Toast.makeText(getApplicationContext(), "Toast 9", Toast.LENGTH_SHORT).show();

                            break;
                        case 10:
                            Toast.makeText(getApplicationContext(), "Toast 10", Toast.LENGTH_SHORT).show();

                            break;
                        case 11:
                            Toast.makeText(getApplicationContext(), "Toast 11", Toast.LENGTH_SHORT).show();

                            break;
                    }
                }
            });

        }
    }
}
