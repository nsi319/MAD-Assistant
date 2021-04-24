package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TextComponentActivity extends AppCompatActivity {

    FloatingActionButton code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_component);
        code = findViewById(R.id.code);

        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextComponentActivity.this,SourceCodeActivity.class);
                startActivity(intent);
            }
        });
    }
}
