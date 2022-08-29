package com.car;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    Car (String color, int year, int maxSpeed) {
        color = "red";
        year = 1990;
        maxSpeed = 120;
    }

    // Getters
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public boolean getIsElectric() {
        return isElectric;
    }

    // Setters
    public void setColor(String c) {
        this.color = c;
    }
    public void setYear(int y) {
        this.year = y;
    }
    public void setSpeed(int s) {
        this.speed = s;
    }
    public void setMaxSpeed(int m) {
        this.speed = m;
    }
    public void setIsElectric(boolean e) {
        this.isElectric = e;
    }
}
