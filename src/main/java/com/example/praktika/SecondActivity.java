package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void btnMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
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
    public void btnFeedback(View view){
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
    public void wapp(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send/?phone=79005340611&text&type=phone_number&app_absent=0"));
        startActivity(browserIntent);
    }
    public void vk(View view){
        Intent browsersIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/blackmedia_max"));
        startActivity(browsersIntent);
    }
}