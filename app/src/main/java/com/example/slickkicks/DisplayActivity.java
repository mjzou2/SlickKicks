package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class DisplayActivity extends AppCompatActivity {

    private Shoe[] shoes = new Shoe[0];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ImageView image = findViewById(R.id.image);
        image.setImageDrawable(LoadImageFromWebOperations("https://assets.adidas.com/images/w_840,h_840,f_auto,q_auto:sensitive,fl_lossy/e3a7db18925d4728809baafc0106b761_9366/Ultraboost_20_Shoes_Black_EF1043_01_standard.jpg"));
    }
    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
    }
}
