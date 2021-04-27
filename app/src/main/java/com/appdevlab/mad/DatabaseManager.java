package com.appdevlab.mad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


import com.appdevlab.mad.model.Student;

import java.util.ArrayList;
import java.util.List;

import static com.appdevlab.mad.StudentDatabase.KEY_STUDENT_NAME;
import static com.appdevlab.mad.StudentDatabase.KEY_STUDENT_ROLL;
import static com.appdevlab.mad.StudentDatabase.TABLE_STUDENT;


public class DatabaseManager {
    private StudentDatabase dbHelper;
    private Context context;

    private SQLiteDatabase database;

    public DatabaseManager(Context c) {
        this.context = c;
    }

    public DatabaseManager open() throws SQLException {
        dbHelper = new StudentDatabase(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }


    public boolean addStudent(Student student) {
        database.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            values.put(KEY_STUDENT_ROLL, student.roll);
            values.put(KEY_STUDENT_NAME, student.name);

            database.insertOrThrow(TABLE_STUDENT, null, values);
            database.setTransactionSuccessful();
        } catch (Exception e) {
            Log.d("MY_LOG_MESSAGE", "Error while trying to add student to database");
            return false;
        } finally {
            database.endTransaction();
        }
        return true;
    }

    public Student getStudent(String roll) {
        Student student = new Student();
        String GET_TEAM =
                String.format("SELECT * FROM %s WHERE %s=%s",
                        TABLE_STUDENT,KEY_STUDENT_ROLL,roll);

        Cursor cursor = database.rawQuery(GET_TEAM, null);
        try {
            if (cursor.moveToFirst()) {
                student.roll = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_ROLL));
                student.name = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_NAME));
                return  student;
            }
        } catch (Exception e) {
            Log.d("MY_LOG_MESSAGE", "Error while trying to get student from database");
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        String GET_ALL_STUDENTS =
                String.format("SELECT * FROM %s",
                        TABLE_STUDENT);


        Cursor cursor = database.rawQuery(GET_ALL_STUDENTS, null);
        try {
            if (cursor.moveToFirst()) {
                do {
                    Student student = new Student();
                    student.roll = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_ROLL));
                    student.name = cursor.getString(cursor.getColumnIndex(KEY_STUDENT_NAME));
                    students.add(student);
                } while(cursor.moveToNext());
            }
        } catch (Exception e) {
            Log.d("MY_LOG_MESSAGE", "Error while trying to get student from database");
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return students;
    }

    public boolean updateStudent(Student student) {
        database.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            values.put(KEY_STUDENT_ROLL, student.roll);
            values.put(KEY_STUDENT_NAME, student.name);

            database.update(TABLE_STUDENT, values,"roll = ?", new String[]{student.roll});
            database.setTransactionSuccessful();
        } catch (Exception e) {
            Log.d("MY_LOG_MESSAGE", "Error while trying to update student to database");
            return false;
        } finally {
            database.endTransaction();
        }
        return true;
    }
}