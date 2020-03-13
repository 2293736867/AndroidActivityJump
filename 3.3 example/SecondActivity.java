package com.kr.activitytest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            Student student = (Student) bundle.getSerializable("student");
            if(student != null)
            {
                System.out.println("age:"+student.getAge());
                System.out.println("id:"+student.getId());
                System.out.println("name:"+student.getName());
            }
        }
        findViewById(R.id.toFirst).setOnClickListener(v->
        {
            finish();
        });
    }
}
