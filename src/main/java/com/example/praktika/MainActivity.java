package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnContacts(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void btnFeedback(View view){
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
    public void btnInfo(View view){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void btnUslugi(View view){
        Intent intent = new Intent(this, UslugiActivity.class);
        startActivity(intent);
    }
}