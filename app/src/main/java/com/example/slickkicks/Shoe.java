package com.example.slickkicks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.net.URL;

public class Shoe {
    private String brand;
    private String name;
    private int price;
    private String gender;
    private String url;
    private int imageID;
    public Shoe(String b, String n, int p, String g, String u) {
        brand = b;
        name = n;
        price = p;
        gender = g;
        url = u;
        imageID = R.drawable.male_stan_smith;
    }
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getGender() {
        return gender;
    }
    public String getUrl() {
        return url;
    }

}
