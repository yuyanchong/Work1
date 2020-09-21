package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumptemperature(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,temperature.class);
        startActivity(intent);
    }
    public void jumpcalculator(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Calculate.class);
        startActivity(intent);
    }
}
