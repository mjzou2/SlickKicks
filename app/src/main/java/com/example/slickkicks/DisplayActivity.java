package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.InputStream;
import java.net.URL;

public class DisplayActivity extends AppCompatActivity {

    private Shoe[] shoes = new Shoe[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        displayShoes();
    }
    public void displayShoes() {
        LinearLayout list = findViewById(R.id.list);
        for(Shoe shoe : shoes) {
            View shoeChunk = getLayoutInflater().inflate(R.layout.chunk_shoe, list, false);
            list.addView(shoeChunk);
        }
    }
}
