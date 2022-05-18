package com.company;

public class Character {
    private int lifeBar = 10 ;
    private String item;
    private String location;

    public Character() {
        this.lifeBar = lifeBar;
        this.item = item;
        this.location=location;
    }

    public int getLifeBar() {
        return lifeBar;
    }

    public void setLifeBar(int lifeBar) {
        this.lifeBar = lifeBar;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void pickItem(){

    }
}
