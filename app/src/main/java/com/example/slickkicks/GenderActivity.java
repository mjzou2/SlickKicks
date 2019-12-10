package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class GenderActivity extends AppCompatActivity {
    private static  boolean femaleClicked = false;
    private static boolean maleClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        Button female = findViewById(R.id.Female);
        Intent intent = new Intent(this, FOptionsActivity.class);
        female.setOnClickListener(unused -> {
                    femaleClicked =true;
                    startActivity(intent);
                }
        );



        Button male = findViewById(R.id.Male);
        Intent intent2 = new Intent(this, OptionsActivity.class);
        male.setOnClickListener(unused -> {
                    maleClicked =true;
                    startActivity(intent2);
                }
        );
    }
    public static boolean getmaleClicked() {
        return maleClicked;
    }
    public static boolean getfemaleClicked() {
        return femaleClicked;
    }
}
