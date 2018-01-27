package com.example.kamere.howtopassdatafromoneactivitytoanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username;
Button nextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        nextActivity = findViewById(R.id.btnNxtActivity);

        nextActivity.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                String name=username.getText().toString();
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("username",name);
                startActivity(intent);
            }
        });
    }
}
