package com.example.rahulpatil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.Date;

import static java.util.Date.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button banky = (Button) findViewById(R.id.btnok);
        banky.setOnClickListener(this::date);
        /*{
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txtdate);
                txt.setText(new Date().toString());

            }
        });*/




    }

    private void date(View view) {

        TextView txt = (TextView) findViewById(R.id.txtdate);
        txt.setText(new Date().toString());

    }


}
