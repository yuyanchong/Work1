package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
    }
    public void convert(View view) {
        TextView tv=findViewById(R.id.textView2);
        TextView tv1=findViewById(R.id.editText);
        tv.setText(String.valueOf(Float.parseFloat(tv1.getText().toString())*1.8+32));
    }
}
