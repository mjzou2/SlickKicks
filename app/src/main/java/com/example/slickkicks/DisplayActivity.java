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

    private Shoe[] shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initShoeDatabase();
        displayShoes();
    }
    public void displayShoes() {
        LinearLayout list = findViewById(R.id.list);
        for(Shoe shoe : shoes) {
            View shoeChunk = getLayoutInflater().inflate(R.layout.chunk_shoe, list, false);
            list.addView(shoeChunk);
        }
    }
    public void initShoeDatabase() {
        shoes = new Shoe[]{
                new Shoe("Adidas", "Stan Smith", 80, "Male", "https://www.adidas.com/us/stan-smith-shoes/M20324.html"),
                new Shoe("Adidas", "Ultraboost 20", 180, "Male", "https://www.adidas.com/us/ultraboost-20-shoes/EF1043.html"),
                new Shoe("Adidas", "NMD_R1", 130, "Male", "https://www.adidas.com/us/nmd_r1-shoes/B42200.html"),
                new Shoe("Adidas", "Superstar", 80, "Male", "https://www.adidas.com/us/superstar-shoes/C77124.html"),
                new Shoe("Adidas", "Nite Jogger", 130, "Male", "https://www.adidas.com/us/nite-jogger-shoes/F34124.html"),
                new Shoe("Adidas", "AlphaEdge 4D", 300, "Male", "https://www.adidas.com/us/alphaedge-4dshoes/EF3453.html"),
                new Shoe("Adidas", "Ozweego", 110, "Male", "https://www.adidas.com/us/ozweego-shoes/EE6465.html"),
                new Shoe("Adidas", "ZX 4000 4D", 350, "Male", "https://www.adidas.com/us/zx-4000-4d-shoes/BD7927.html"),
                new Shoe("Adidas", "Samba Classic", 70, "Male", "https://www.adidas.com/us/samba-classic/034563.html"),
                new Shoe("Adidas", "Continental 80", 80, "Male", "https://www.adidas.com/us/continental-80-shoes/G27706.html"),
                new Shoe("Adidas", "Gazelle", 80, "Male", "https://www.adidas.com/us/gazelle-shoes/B41645.html"),
                new Shoe("Adidas", "Alphaboost", 120, "Male", "https://www.adidas.com/us/alphaboost-shoes/G54128.html"),
                new Shoe("Adidas", "Grand Court", 65, "Male", "https://www.adidas.com/us/grand-court-shoes/EE7891.html"),

                new Shoe("Adidas", "Stan Smith", 80, "Female", "https://www.adidas.com/us/stan-smith-shoes/B24105.html"),
        };
    }
}
