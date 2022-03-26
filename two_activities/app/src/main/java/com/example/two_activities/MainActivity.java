package com.example.two_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_Message = "com.example.two_activities.message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        // create intent to connect the two views
        Intent intent =  new Intent(this,MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String string_message = editText.getText().toString();
        // send intent
        intent.putExtra(KEY_Message, string_message);
        //
        startActivity(intent);
    }
}