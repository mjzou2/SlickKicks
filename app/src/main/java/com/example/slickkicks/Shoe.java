package com.example.slickkicks;

public class Shoe {
    private String brand;
    private String name;
    private int price;
    private int size;
    private String gender;
    public Shoe(String b, String n, int p, int s, String g) {
        brand = b;
        name = n;
        price = p;
        size = s;
        gender = g;
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
    public int getSize() {
        return size;
    }
    public String getGender() {
        return gender;
    }
}
