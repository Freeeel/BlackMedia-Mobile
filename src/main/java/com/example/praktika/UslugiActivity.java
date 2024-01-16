package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class UslugiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uslugi);
    }
    public void btnMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
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


    public void forma_smm(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1CiuqIYSI7HAxPUeiGjcagZy8mIF1W6OKERMBepHm9vo/viewform?edit_requested=true"));
        startActivity(browserIntent);
    }
    public void forma_site(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1nCYVbmd6xsYzIRTRLmep5ywKTD_sxU3d3vjI1OHQjYA/edit"));
        startActivity(browserIntent);
    }


    public void first(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/ведение-социальных-сетей/"));
        startActivity(browserIntent);
    }
    public void second(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/оформление-социальных-сетей/"));
        startActivity(browserIntent);
    }
    public void third(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/продвижение-insta/"));
        startActivity(browserIntent);
    }
    public void fourth(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/продвижение-вконтакте/"));
        startActivity(browserIntent);
    }
    public void fifth(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/таргетированная-реклама/"));
        startActivity(browserIntent);
    }


    public void first_1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/интернет-магазин/"));
        startActivity(browserIntent);
    }
    public void second_1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/многостраничный-сайт/"));
        startActivity(browserIntent);
    }
    public void third_1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/одностраничный-сайт/"));
        startActivity(browserIntent);
    }
    public void fourth_1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/промо-сайт/"));
        startActivity(browserIntent);
    }
    public void fifth_1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blackmedia.digital/subservices/сайт-каталог/"));
        startActivity(browserIntent);
    }
}