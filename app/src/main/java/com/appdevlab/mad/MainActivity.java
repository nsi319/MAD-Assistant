package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        // Set Event
        setGridItemClickEvent(gridLayout);
    }

    private void setGridItemClickEvent(GridLayout glHome) {
        // Loop all child item of Grid Layout
        for (int i = 0; i < glHome.getChildCount(); i++) {

            CardView cvCurrentItem = (CardView) glHome.getChildAt(i);

            final int index = i;

            cvCurrentItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    switch (index) {
                        case 0:
                            Toast.makeText(getApplicationContext(), "TextView & EditText", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), TextComponentActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Toast.makeText(getApplicationContext(), "Buttons", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), ButtonComponentActivity.class);
                            startActivity(intent);
                            break;
                        case 2:
                            Toast.makeText(getApplicationContext(), "Seekbar", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), SeekbarComponentActivity.class);
                            startActivity(intent);
                            break;
                        case 3:
                            Toast.makeText(getApplicationContext(), "Pickers", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), PickerActivity.class);
                            startActivity(intent);
                            break;
                        case 4:
                            Toast.makeText(getApplicationContext(), "Spinner", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                            startActivity(intent);
                            break;
                        case 5:
                            Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), MenuActivity.class);
                            startActivity(intent);
                            break;
                        case 6:
                            Toast.makeText(getApplicationContext(), "Material Design", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), MaterialActivity.class);
                            startActivity(intent);
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
