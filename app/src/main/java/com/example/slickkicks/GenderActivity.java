package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        Button femaleButton = findViewById(R.id.Female);
        Intent intent = new Intent(this, FOptionsActivity.class);
        femaleButton.setOnClickListener(unused -> startActivity(intent));
        Button maleButton = findViewById(R.id.Male);
        Intent intent2 = new Intent(this, OptionsActivity.class);
        maleButton.setOnClickListener(unused -> startActivity(intent2));
    }
}
