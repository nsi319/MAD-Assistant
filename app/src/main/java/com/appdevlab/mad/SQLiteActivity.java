package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Code;
import com.appdevlab.mad.model.Student;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.Locale;

import static android.view.View.GONE;

public class SQLiteActivity extends AppCompatActivity {

    TextView name, roll, rollUpdate, nameUpdate, reset, studentList;
    int found = -1;
    DatabaseManager databaseManager;
    Student student;

    FloatingActionButton codeFab;
    String javaCode, xmlCode, databaseCode, studentCode, managerCode, javaLocation,xmlLocation,databaseLocation, studentLocation, managerLocation;

    TextToSpeech textToSpeech;
    int play = 0;
    String introduction = "Welcome to Android SQLite Example Tutorial. Android SQLite is the mostly preferred way to store data for android applications. Android SQLite is a very lightweight database which comes with Android OS. Android SQLite combines a clean SQL interface with a very small memory footprint and decent speed. For Android, SQLite is “baked into” the Android runtime, so every Android application can create its own SQLite databases. The basic operations on an Android SQLite database such as insert, update, fetch are given in this tutorial.";

    TextView title;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        title = ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title));
        title.setText("SQLite Database");

        textToSpeech = new TextToSpeech(SQLiteActivity.this, new TextToSpeech.OnInitListener() {
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
                    Toast.makeText(SQLiteActivity.this,"Introduction started",Toast.LENGTH_SHORT).show();
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_pause_circle_outline_black_24dp),null);
                    play=1;
                    textToSpeech.speak(introduction, TextToSpeech.QUEUE_FLUSH, null);
                    isTTSSpeaking();
                }
                else {
                    play=0;
                    title.setCompoundDrawablesWithIntrinsicBounds(null,null,getDrawable(R.drawable.ic_play_circle_outline_black_24dp),null);
                    textToSpeech.stop();
                    Toast.makeText(SQLiteActivity.this,"Introduction stopped",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Code code = new Code();
        javaCode  = code.getSqliteJava();
        xmlCode = code.getSqliteXml();
        databaseCode = code.getSqliteDatabase();
        managerCode = code.getSqliteDbManager();
        studentCode = code.getSqliteStudent();

        javaLocation = code.getMenuJavaLocation();
        xmlLocation = code.getMenuXmlLocation();
        databaseLocation = code.getSqliteDatabaseLocation();
        managerLocation = code.getSqliteDbManagerLocation();
        studentLocation = code.getSqliteStudentLocation();


        codeFab = findViewById(R.id.code);

        codeFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SQLiteActivity.this, SourceCodeActivity.class);
                intent.putExtra("count",5);
                intent.putExtra("java",javaCode);
                intent.putExtra("xml",xmlCode);
                intent.putExtra("javaLocation",javaLocation);
                intent.putExtra("xmlLocation",xmlLocation);

                String[] tabs = {"MODEL","DB","DBM"};
                String[] codes = {studentCode,databaseCode,managerCode};
                String[] locations = {studentLocation,databaseLocation,managerLocation};

                intent.putExtra("tabs",tabs);
                intent.putExtra("codes",codes);
                intent.putExtra("locations",locations);

                startActivity(intent);
            }
        });

        // Add Student
        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(roll.getText().toString().equals("") || name.getText().toString().equals(""))
                    Toast.makeText(SQLiteActivity.this,"Please enter required fields", Toast.LENGTH_SHORT).show();
                else {
                    databaseManager = new DatabaseManager(SQLiteActivity.this);
                    databaseManager.open();

                    Student student = new Student(roll.getText().toString(),name.getText().toString());

                    Boolean res = databaseManager.addStudent(student);
                    if(res) {
                        Toast.makeText(SQLiteActivity.this, "New Student: " + name.getText().toString() + " added successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(SQLiteActivity.this,"New Student addition unsuccessful",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Update

        rollUpdate = findViewById(R.id.roll_update);
        nameUpdate = findViewById(R.id.name_update);
        reset = findViewById(R.id.reset);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SQLiteActivity.this,"Reset Update Student Fields", Toast.LENGTH_SHORT).show();
                found = -1;
                rollUpdate.setEnabled(true);
                findViewById(R.id.nameLayout).setVisibility(View.GONE);
                findViewById(R.id.updateCard).setVisibility(View.GONE);
                findViewById(R.id.findCard).setVisibility(View.VISIBLE);
                nameUpdate.setText("");
                rollUpdate.setText("");
            }
        });

        if(found==-1) {
            findViewById(R.id.nameLayout).setVisibility(GONE);
        }
        else {
            findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);
        }

        findViewById(R.id.find).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseManager databaseManager = new DatabaseManager(SQLiteActivity.this);
                databaseManager.open();

                if(rollUpdate.getText().toString().equals("")) {
                    Toast.makeText(SQLiteActivity.this,"Please enter roll number", Toast.LENGTH_SHORT).show();
                }
                else {
                    student = databaseManager.getStudent(rollUpdate.getText().toString());
                    if (student == null) {
                        Toast.makeText(SQLiteActivity.this, "Student: " + rollUpdate.getText().toString() + " not found", Toast.LENGTH_SHORT).show();
                        found = -1;
                    } else {
                        Toast.makeText(SQLiteActivity.this, "Student: " + rollUpdate.getText().toString() + " found!", Toast.LENGTH_SHORT).show();
                        rollUpdate.setEnabled(false);
                        found = 1;
                        findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);
                        findViewById(R.id.updateCard).setVisibility(View.VISIBLE);
                        findViewById(R.id.findCard).setVisibility(GONE);
                        nameUpdate.setText(student.name);
                        rollUpdate.setText(student.roll);
                    }
                }
            }
        });

        findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rollUpdate.getText().equals("") || nameUpdate.getText().equals(""))
                    Toast.makeText(SQLiteActivity.this,"Please enter required fields", Toast.LENGTH_SHORT).show();
                else {
                    DatabaseManager databaseManager = new DatabaseManager(SQLiteActivity.this);
                    databaseManager.open();

                    Student student = new Student(rollUpdate.getText().toString(),nameUpdate.getText().toString());
                    Boolean res = databaseManager.updateStudent(student);

                    if(res) {
                        Toast.makeText(SQLiteActivity.this, "Student: " + rollUpdate.getText().toString() + " updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(SQLiteActivity.this,"Student updation failed",Toast.LENGTH_SHORT).show();
                }
            }
        });


        // Get all students
        studentList = findViewById(R.id.studentList);
        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseManager databaseManager = new DatabaseManager(SQLiteActivity.this);
                databaseManager.open();
                List<Student> students = databaseManager.getAllStudents();
                if(students.size()==0) {
                    studentList.setText(Html.fromHtml("<b>There are no students in database</b>"));
                    studentList.setGravity(Gravity.CENTER);
                    studentList.setTextSize(15);
                }
                else {
                    String text = "";
                    for(Student student : students)
                        text = text + "<b>Name: </b>" + student.name + "<br><b>Roll: </b>" + student.roll + "<br><br>";

                    studentList.setText(Html.fromHtml(text));
                    studentList.setGravity(Gravity.NO_GRAVITY);
                }
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
