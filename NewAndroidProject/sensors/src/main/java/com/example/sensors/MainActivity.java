package com.example.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;

import android.widget.TextView;

import java.util.List;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {


    private SensorManager manager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        manager = (SensorManager) getSystemService(SENSOR_SERVICE);


        //info();
        //  light();
         gravity();
    }


    private void info() {

        List<Sensor> sensors = manager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : sensors) {

            Log.i("@example", "" + sensor.getName());
            ((TextView) findViewById(R.id.TextInfo)).append("\n  -" + sensor.getName());
        }


    }

    private void light() {

        Sensor sensor = manager.getDefaultSensor(Sensor.TYPE_LIGHT);
        manager.registerListener(new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                ((TextView) findViewById(R.id.TextInfo)).setText("" + event.values[0]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {


            }
        }, sensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    private void gravity() {

        Sensor sensor = manager.getDefaultSensor(Sensor.TYPE_GRAVITY);

        manager.registerListener(new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                ((TextView) findViewById(R.id.TextInfo)).setText("X " + event.values[0] + "Y " + event.values[0] + "Z " + event.values[0]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {


            }
        }, sensor, SensorManager.SENSOR_DELAY_NORMAL);

    }




    }




