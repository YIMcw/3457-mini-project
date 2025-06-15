package com.example.fitjournal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView tvWelcome = findViewById(R.id.tvWelcome);
        Button btnNext = findViewById(R.id.btnNext);

        String userName = getIntent().getStringExtra("userName");
        tvWelcome.setText("Welcome, " + userName + "!");

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, RecommendedContentActivity.class));
            finish();
        });
    }
}