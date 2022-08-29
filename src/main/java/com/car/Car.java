package com.car;

public class Car {
     private String color;
     private int year;
     private int speed = 0;
     private int maxSpeed;
     private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.year = year;
    }
   
    public void accelerateSpeed() {
        if (speed + 5 <= getMaxSpeed()) {
            speed += 5;
        } else {
            System.out.println("Going too fast!");
        }
    }
    public void decelerateSpeed() {
        if (speed - 5 >= 0) {
            speed -= 5;
        } else {
            System.out.println("Going too slow!");
        }
    }
    public void convertToElectric(){
        if (!isElectric) {
            isElectric = true;
        } else {
            System.out.println("vehicle is already electric");
        }
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public boolean getIsElectric() {
        return isElectric;
    }
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    
    
}
