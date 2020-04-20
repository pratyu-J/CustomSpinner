package com.example.coronatime;

public class FruitItem {
    String name = "";
    int image = R.drawable.image1;

    public FruitItem(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public FruitItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
