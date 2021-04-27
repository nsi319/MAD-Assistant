package com.appdevlab.mad;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class PickerActivity extends AppCompatActivity {

    Button btnDatePicker, btnTimePicker;
    NumberPicker numberPicker;

    int mDay, mMonth, mYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

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
                        Toast.makeText(getApplicationContext(),"Selected date: " + date, Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(getApplicationContext(),"Selected time: " + time, Toast.LENGTH_SHORT).show();

                    }
                }, hour, minute, true);

                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
            };
        });

        //Number Picker
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(getApplicationContext(),"Selected number: " + newVal,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
