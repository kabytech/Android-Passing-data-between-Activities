package com.example.kamere.howtopassdatafromoneactivitytoanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secondActivity = findViewById(R.id.secondActivity);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        secondActivity.setText("Hello"+" "+username);


    }
}
