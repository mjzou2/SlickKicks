package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity {
    SeekBar seekBar;
    SeekBar seekBar2;
    CheckBox nike, adidas, ua;
    private int size = 0;
    private int price = 0;
    private boolean n = false;
    private boolean a = false;
    private boolean u = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        seekBar=(SeekBar)findViewById(R.id.size);
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
        seekBar2=(SeekBar)findViewById(R.id.price);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                price = progress;
                Toast.makeText(getApplicationContext(),"Maximum price: $"+progress, Toast.LENGTH_SHORT).show();
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
    public void selectItem(View view) {
        nike = (CheckBox)findViewById(R.id.Nike);
        adidas = (CheckBox)findViewById(R.id.Adidas);
        ua = (CheckBox)findViewById(R.id.UnderArmour);

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
    public boolean getN() {
        return n;
    }
    public boolean getA() {
        return a;
    }
    public boolean getU() {
        return u;
    }
    public int getSize() {
        return size;
    }
    public int getPrice() {
        return price;
    }
    public int getGender() {
        return 0;
    }
}
