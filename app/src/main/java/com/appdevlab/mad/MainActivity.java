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

        setGridItemClickEvent(gridLayout);
    }

    private void setGridItemClickEvent(GridLayout gridLayout) {

        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            CardView cardView = (CardView) gridLayout.getChildAt(i);

            final int index = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    switch (index) {
                        case 0:
                            Toast.makeText(getApplicationContext(), "TextView & EditText", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), TextActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Toast.makeText(getApplicationContext(), "Buttons", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), ButtonActivity.class);
                            startActivity(intent);
                            break;
                        case 2:
                            Toast.makeText(getApplicationContext(), "Seekbar", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), SeekbarActivity.class);
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
                            Toast.makeText(getApplicationContext(), "SQLite Database", Toast.LENGTH_SHORT).show();
                            intent = new Intent(getApplicationContext(), SQLiteActivity.class);
                            startActivity(intent);
                            break;

                    }
                }
            });

        }
    }
}
