package com.example.fitjournal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class WorkoutOptionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_options);

        Button btnStartWorkout = findViewById(R.id.btnStartWorkout);
        Button btnViewRecords = findViewById(R.id.btnViewRecords);
        Button btnNext = findViewById(R.id.btnNext);

        btnStartWorkout.setOnClickListener(v -> {
            // 這裡可以加開始鍛鍊嘅邏輯，日後再教
        });

        btnViewRecords.setOnClickListener(v -> {
            // 這裡可以加睇記錄嘅邏輯，日後再教
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, MapViewActivity.class));
            finish();
        });
    }
}