package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class FOptionsActivity extends AppCompatActivity {
    SeekBar seekBar;
    SeekBar seekBar2;
    private static boolean n = false;
    private static boolean a = false;
    private static boolean u = false;
    private static boolean b = false;
    private static int size;
    private static int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foptions);
        LinearLayout brands = findViewById(R.id.linearLayout);
        CheckBox nike = brands.findViewById(R.id.Nike);
        CheckBox adidas = brands.findViewById(R.id.Adidas);
        CheckBox ua = brands.findViewById(R.id.UnderArmour);
        CheckBox nb = brands.findViewById(R.id.NewBalance);

        seekBar=(SeekBar)findViewById(R.id.sleekbar);
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
        seekBar2=(SeekBar)findViewById(R.id.pricebar);
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
        Button next = (Button)findViewById(R.id.next);
        Intent intent = new Intent(this, DisplayActivity.class);
        next.setOnClickListener(unused -> {
            if (nike.isChecked()) {
                n = true;
            }
            if (adidas.isChecked()) {
                a = true;
            }
            if (ua.isChecked()) {
                u = true;
            }
            if (nb.isChecked()) {
                b = true;
            }
            startActivity(intent);
        });
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
    public static boolean getB() {
        return b;
    }
    public static int getSize() {
        return size;
    }
    public static int getGender() {return 1;}
    public static int getPrice() {
        return price;
    }
    public static void setN(boolean newN) {
        n = newN;
    }
    public static void setA(boolean newA) {
        a = newA;
    }
    public static void setU(boolean newU) {
        u = newU;
    }
    public static void setB(boolean newB) {
        b = newB;
    }
}
