package com.appdevlab.mad;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appdevlab.mad.model.Student;

import java.util.List;

import static android.view.View.GONE;

public class SQLiteActivity extends AppCompatActivity {

    TextView name, roll, rollUpdate, nameUpdate, studentList;
    int found = -1;
    DatabaseManager databaseManager;
    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);


        // Add Student
        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(roll.getText().equals("") || name.getText().equals(""))
                    Toast.makeText(getApplicationContext(),"Please enter required fields", Toast.LENGTH_SHORT).show();
                else {
                    databaseManager = new DatabaseManager(getApplicationContext());
                    databaseManager.open();

                    Student student = new Student(roll.getText().toString(),name.getText().toString());

                    Boolean res = databaseManager.addStudent(student);
                    if(res) {
                        Toast.makeText(getApplicationContext(), "New Student: " + name.getText().toString() + " added successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"New Student addition unsuccessful",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Update

        rollUpdate = findViewById(R.id.roll_update);
        nameUpdate = findViewById(R.id.name_update);

        if(found==-1) {
            findViewById(R.id.nameLayout).setVisibility(GONE);
            findViewById(R.id.nameLayout).setVisibility(GONE);
        }
        else {
            findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);
            findViewById(R.id.nameLayout).setVisibility(View.VISIBLE);
        }

        findViewById(R.id.find).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());
                databaseManager.open();

                if(rollUpdate.getText().equals("")) {
                    Toast.makeText(getApplicationContext(),"Please enter roll number", Toast.LENGTH_SHORT).show();
                }
                else {
                    student = databaseManager.getStudent(rollUpdate.getText().toString());
                    if (student == null) {
                        Toast.makeText(getApplicationContext(), "Student: " + rollUpdate.getText().toString() + " not found", Toast.LENGTH_SHORT).show();
                        found = -1;
                    } else {
                        Toast.makeText(getApplicationContext(), "Student: " + rollUpdate.getText().toString() + " found!", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(),"Please enter required fields", Toast.LENGTH_SHORT).show();
                else {
                    DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());
                    databaseManager.open();

                    Student student = new Student(rollUpdate.getText().toString(),nameUpdate.getText().toString());
                    Boolean res = databaseManager.updateStudent(student);

                    if(res) {
                        Toast.makeText(getApplicationContext(), "Student: " + rollUpdate.getText().toString() + " updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Student updation failed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Get all students

        studentList = findViewById(R.id.studentList);
        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseManager databaseManager = new DatabaseManager(getApplicationContext());
                databaseManager.open();
                List<Student> students = databaseManager.getAllStudents();
                if(students.size()==0)
                    studentList.setText("There are no students in database");
                else {
                    String text = "";
                    for(Student student : students)
                        text = text + "<b>Name: </b>" + student.name + "<br><b>Roll:  </b>" + student.roll + "<br><br>";

                    studentList.setText(Html.fromHtml(text).toString());

                }
            }
        });


    }
}
