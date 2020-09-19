package com.example.productreevity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHomeActivity extends AppCompatActivity {
    private Button button4; //timer button
    private Button button6; //student stats button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        button4 = (Button) findViewById(R.id.featured_assignment_btn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTimer();
            }
        });
        button6 = (Button) findViewById(R.id.stats_btn);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openStats();
            }
        });
    }
    public void openTimer() {
        Intent intent = new Intent(this, TimerMainActivity.class);
        startActivity(intent);
    }
    public void openStats() {
        Intent intent = new Intent(this, StudentStatsActivity.class);
        startActivity(intent);
    }

}

