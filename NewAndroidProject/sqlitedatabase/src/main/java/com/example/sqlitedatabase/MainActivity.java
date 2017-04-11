package com.example.sqlitedatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getCanonicalName();
    private DbHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DbHelper(this,"mydb",null,1);
        findViewById(R.id.btnInsert).setOnClickListener(this::Click);
        findViewById(R.id.btnUpdate).setOnClickListener(this::Click);
        findViewById(R.id.btnDelete).setOnClickListener(this::Click);
        findViewById(R.id.btnDisplay).setOnClickListener(this::Click);



    }

    private void Click(View view) {

        if(view.getId() == R.id.btnInsert)insert();
        if(view.getId() == R.id.btnUpdate)update();
        if(view.getId() == R.id.btnDelete)delete();
        if(view.getId() == R.id.btnDisplay)display();

    }
    private void insert() {
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        db.insert("myTable",null,values);
        values.put("myName",getName());
        values.put("myAge",getAge());

        db.close();
    }

    private String getName(){

        return  ((EditText)findViewById(R.id.edtMyName)).getText().toString();

    }
    private  Integer getAge(){

        return Integer.parseInt(((EditText)findViewById(R.id.edtMyAge))
                .getText()
                .toString());
    }
    private void update() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String table="myTable";
        ContentValues values = new ContentValues();
        values.put("myName",getName());
        String whereClause = "myAge = ?";
        String[] whereArgs = {String.valueOf(getAge())};
        db.update(table, values, whereClause, whereArgs);
                db.close();
    }
    private void delete() {
        SQLiteDatabase db = helper.getWritableDatabase();

        String table="myTable";
        String whereClause = "myAge = ?";
        String[] whereArgs = {String.valueOf(getAge())};
        db.delete(table,whereClause,whereArgs);
        db.close();

    }

    private void display() {

        SQLiteDatabase db = helper.getReadableDatabase();
        String table = "myTable";
        String[] columns = {"myName"};
        String selection = "myAge = ? ";
        String[] selectionArgs  = {""+getAge()};
        String groupBy = null;
        String having = null;
        String orderBy = null;


        Cursor cursor = db.query(table,columns,selection,selectionArgs,groupBy,having,orderBy);

            if (cursor.moveToNext()){

            String myName = cursor.getString(cursor.getColumnIndex("myName"));
//            Integer myAge = cursor.getInt(cursor.getColumnIndex("myAge"));
                Log.i("example","Name -"+myName);
            ((EditText)findViewById(R.id.edtMyName)).setText(myName);

        }


        db.close();
    }





}

