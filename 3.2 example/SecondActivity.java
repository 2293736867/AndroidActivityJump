package com.kr.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            System.out.println(bundle.getChar("char"));
            System.out.println(Arrays.toString(bundle.getDoubleArray("double array")));
        }
        findViewById(R.id.toFirst).setOnClickListener(v->
        {
            finish();
        });
    }
}
