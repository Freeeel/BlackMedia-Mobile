package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void btnMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void btnContacts(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void send_otziv(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/topic-167459083_39124797"));
        startActivity(browserIntent);
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