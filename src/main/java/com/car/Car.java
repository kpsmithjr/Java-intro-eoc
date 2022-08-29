package com.car;

public class Car {

   private String color;
   private int year;
   private int speed = 0;
   private int maxSpeed;
   private boolean isElectric;
   

    // constructor
    public Car(String color, int year, int speed, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;       
    }

 //Getters and setters
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public boolean isElectric() {
        return isElectric;
    }


    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

}