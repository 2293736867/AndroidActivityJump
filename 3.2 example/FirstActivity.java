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
            bundle.putInt("int",1);
            bundle.putString("String","String");
            bundle.putChar("char",'a');
            bundle.putFloat("float",1.1f);
            bundle.putDoubleArray("double array",new double[]{1.2});
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11 && resultCode == 22)
        {
            System.out.println(data.getStringExtra("str"));
        }
    }
}
