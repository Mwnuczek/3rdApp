package com.example.packard.a2ndapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Obrazek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrazek);
    }
    public void onClickButtonChange(View view){
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android2);
    }

    public void onClickButtonPrevious(View view){
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android);
    }



    public void onClickButtonGoBack(View view){
        finish();
    }
}
