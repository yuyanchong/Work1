package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
    }
    public void addpoints(View view) {
        TextView tv =findViewById(R.id.textView4);
        tv.setText(String.valueOf(Integer.parseInt(tv.getText().toString())+Integer.parseInt(view.getTag().toString())));
    }
    //add something
    public void reset(View view) {
        TextView tv = findViewById(R.id.textView4);
        tv.setText("0");
    }
}
