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
    private int sleekness
    public Shoe(String b, String n, int p, String g, String u, int i, int s) {
        brand = b;
        name = n;
        price = p;
        gender = g;
        url = u;
        imageID = i;
        sleekness = s;
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
    public int getImageID() {
        return imageID;
    }
    public int getSleekness(){return sleekness;}
}
