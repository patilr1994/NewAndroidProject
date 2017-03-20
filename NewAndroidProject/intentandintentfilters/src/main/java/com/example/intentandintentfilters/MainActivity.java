package com.example.intentandintentfilters;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartNew(View view) {
        concept();
    }

    private void concept() {
        Intent intent = new Intent();
        intent.setAction("com.codekul.action.COMMAN");
        intent.addCategory("com.codekul.category.ENTERTAINMENT");
        intent.setData(Uri.parse("http://codekul.com"));
        startActivity(intent);
            }


    private void dial() {
        startActivity(new Intent(Intent.ACTION_DIAL));
    }

    private void call() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel://9762548833"));
        startActivity(intent);
    }

    private void browser() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://codekul.com"));
        startActivity(intent);
    }

    private void location() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=18.6443608,73.7700475(MyHome)"));
        startActivity(intent);
    }
}
