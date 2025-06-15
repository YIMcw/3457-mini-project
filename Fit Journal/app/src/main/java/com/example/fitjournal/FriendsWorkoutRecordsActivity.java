package com.example.fitjournal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class FriendsWorkoutRecordsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_workout_records);

        Button btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, WorkoutOptionsActivity.class));
            finish();
        });
    }
}