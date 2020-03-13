package com.kr.activitytest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.toSecond).setOnClickListener(v->
        {
            Intent intent = new Intent(this,SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("student",new Student());
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}

