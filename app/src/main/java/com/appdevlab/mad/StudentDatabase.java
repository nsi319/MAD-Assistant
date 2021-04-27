package com.appdevlab.mad;

import android.content.Context;
import android.database.sqlite.*;


public class StudentDatabase extends SQLiteOpenHelper {
    // Database Info
    public static final String DATABASE_NAME = "studentDB";
    public static final int DATABASE_VERSION = 1;

    // Table Names
    public static final String TABLE_STUDENT = "student";

    // Student Table Columns
    public static final String KEY_STUDENT_ROLL = "roll";
    public static final String KEY_STUDENT_NAME = "name";

    public StudentDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_STUDENT_TABLE = "CREATE TABLE " + TABLE_STUDENT +
                "(" +
                KEY_STUDENT_ROLL + " TEXT PRIMARY KEY," + // Define a primary key
                KEY_STUDENT_NAME + " TEXT" +
                ")";

        db.execSQL(CREATE_STUDENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT);
            onCreate(db);
        }
    }

}