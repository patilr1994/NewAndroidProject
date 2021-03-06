package com.example.provideresourceown;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            ( (ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_boy);

        }
        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            ( (ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_girl);

        }

        else{
            ( (ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_kids_couple);
        }
    }
}