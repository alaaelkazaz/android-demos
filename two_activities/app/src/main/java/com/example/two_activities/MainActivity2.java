package com.example.two_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent(); // receive intent
        // accept the incoming string
        String message = intent.getStringExtra(MainActivity.KEY_Message);
        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(message);
    }
}