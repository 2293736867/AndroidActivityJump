package com.kr.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.toFirst).setOnClickListener(v->
        {
            setResult(22,new Intent().putExtra("str","from second activity"));
            finish();
        });
    }
}
