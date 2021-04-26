package com.appdevlab.mad;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
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
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    Button btnPopupMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

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
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),btnPopupMenu);
                popupMenu.getMenuInflater().inflate(R.menu.menu_list,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getApplicationContext(),"Selected option " + item.getTitle().toString(),Toast.LENGTH_SHORT).show();
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
                Toast.makeText(getApplicationContext(),"Selected Mark for " + place,Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit:
                Toast.makeText(getApplicationContext(),"Selected Edit for " + place,Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(getApplicationContext(),"Selected Delete for " + place,Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return true;
    }


}
