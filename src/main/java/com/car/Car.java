package com.car;

public class Car {
    private String color;
    private int year;
    private int speed =0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public boolean getIsElectric(){
        return isElectric;
    }
    
}
