package com.appdevlab.mad;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;
import java.util.Locale;

public class PickerActivity extends AppCompatActivity {

    Button btnDatePicker, btnTimePicker;
    NumberPicker numberPicker;
    int mDay, mMonth, mYear;

    FloatingActionButton codeFab;
    String javaCode, xmlCode, javaLocation,xmlLocation;

    TextToSpeech textToSpeech;
    int play = 0;
    String introduction = "In this segment, we will be exploring the different types of picker components. Android provides controls for the user to pick a date, pick a time or pick a number as ready-to-use dialogs. Each picker provides controls for selecting each part of the time (such as hour, minute, AM/PM) or date (such as month, day, year). Using these pickers helps ensure that your users can pick a time or date that is valid, formatted correctly, and adjusted to the user's locale.";
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("Pickers");

        textToSpeech = new TextToSpeech(PickerActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS) {
                    int ttsLanguage = textToSpeech.setLanguage(Locale.US);
                    if(ttsLanguage == TextToSpeech.LANG_MISSING_DATA || ttsLanguage == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.d("MY_LOG_TAG","Language not supported");
                    }
                    Log.d("MY_LOG_TAG","TTS init successful");
                }
                else
                    Log.d("MY_LOG_TAG","TTS init unsuccessful");
            }
        });



        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(play==0) {
                    Toast.makeText(PickerActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(PickerActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Code code = new Code();
        javaCode  = code.getPickerJava();
        xmlCode = code.getPickerXml();
        javaLocation = code.getPickerJavaLocation();
        xmlLocation = code.getPickerXmlLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PickerActivity.this, SourceCodeActivity.class);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);
                startActivity(intent);
            }
        });


        btnDatePicker = findViewById(R.id.btn_date_picker);
        btnTimePicker = findViewById(R.id.btn_time_picker);
        numberPicker = findViewById(R.id.numberPicker);

        numberPicker.setMaxValue(10);
        numberPicker.setMinValue(0);
        numberPicker.setValue(3);


        // Date Picker
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentDate = Calendar.getInstance();
                mDay = mcurrentDate.get(Calendar.DAY_OF_MONTH);
                mMonth = mcurrentDate.get(Calendar.MONTH);
                mYear = mcurrentDate.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(PickerActivity.this, R.style.DateDialogTheme, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = String.format("%02d",dayOfMonth) + "/" + String.format("%02d",month) + "/" + String.format("%04d",year);
                        btnDatePicker.setText(date);
                        Toast.makeText(PickerActivity.this,"Selected date: " + date, Toast.LENGTH_SHORT).show();
                    }
                }, mYear, mMonth,mDay);

                datePickerDialog.show();
            }
        });

        // Time Picker
        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(PickerActivity.this, R.style.TimeDialogTheme, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        String time = selectedHour + ":" + selectedMinute;
                        btnTimePicker.setText(time);
                        Toast.makeText(PickerActivity.this,"Selected time: " + time, Toast.LENGTH_SHORT).show();

                    }
                }, hour, minute, true);

                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
            };
        });

        // Number Picker
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(PickerActivity.this,"Selected number: " + newVal,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void isTTSSpeaking(){

        final Handler h =new Handler();
        Runnable r = new Runnable() {
            public void run() {
                if (!textToSpeech.isSpeaking()) {
                    play=0;
                    Log.d("MY_LOG_TAG","done");
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                }
                h.postDelayed(this, 500);
            }
        };
        h.postDelayed(r, 500);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(textToSpeech!=null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
