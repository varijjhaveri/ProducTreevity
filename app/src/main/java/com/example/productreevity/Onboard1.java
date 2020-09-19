package com.example.productreevity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Onboard1 extends AppCompatActivity {
    private Button button2; //student button
    private Button button3; //teacher button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard1);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openStudent();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTeacher();
            }
        });
    }
    public void openStudent() {
        Intent intent = new Intent(this, Student.class);
        startActivity(intent);
    }
    public void openTeacher() {
        Intent intent = new Intent(this, Teacher.class);
        startActivity(intent);
    }
}
