package com.appdevlab.mad;

import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Student;

import java.util.List;

import static android.view.View.GONE;

public class SQLiteActivity extends AppCompatActivity {

    TextView name, roll, rollUpdate, nameUpdate, reset, studentList;
    int found = -1;
    DatabaseManager databaseManager;
    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        ((TextView)getSupportActionBar().getCustomView().findViewById(R.id.tv_title)).setText("SQLite Database");


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
}
