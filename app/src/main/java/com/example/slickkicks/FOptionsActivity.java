package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foptions);

        Button next = findViewById(R.id.Next);
        next.setOnClickListener(unused -> startActivity(new Intent(this, DisplayActivity.class)));
        finish();
    }
}
