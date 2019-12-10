package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class FOptionsActivity extends AppCompatActivity {
    SeekBar seekBar;
    SeekBar seekBar2;
    CheckBox nike, adidas, ua;
    private static boolean n = false;
    private static boolean a = false;
    private static boolean u = false;
    private static int size;
    private static int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foptions);
        selectItem();
        seekBar=(SeekBar)findViewById(R.id.femalesize);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                size = progress;
                Toast.makeText(getApplicationContext(),"Shoe Size: "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Shoe Size: "+size, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Shoe Size: "+size, Toast.LENGTH_SHORT).show();
            }
        });
        seekBar2=(SeekBar)findViewById(R.id.femaleprice);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                price = progress;
                Toast.makeText(getApplicationContext()," Maximum price: $"+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Maximum price: $"+ price, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Maximum price: $"+ price, Toast.LENGTH_SHORT).show();
            }
        });
        Button next = (Button)findViewById(R.id.Next);
        Intent intent = new Intent(this, DisplayActivity.class);
        next.setOnClickListener(unused -> startActivity(intent));
    }
    public void selectItem() {
        LinearLayout brands = findViewById(R.id.linearLayout);
        nike = brands.findViewById(R.id.Nike);
        adidas = brands.findViewById(R.id.Adidas);
        ua = brands.findViewById(R.id.UnderArmour);

        if (nike.isChecked()) {
            n = true;

        }
        if (adidas.isChecked()) {
            a = true;
        }
        if (ua.isChecked()) {
            u = true;
        }
    }
    public static boolean getN() {
        return n;
    }
    public static boolean getA() {
        return a;
    }
    public static boolean getU() {
        return u;
    }
    public static int getSize() {
        return size;
    }
    public static int getGender() {return 1;}
    public static int getPrice() {
        return price;
    }
}
