package com.car;

public class Car {
   private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.isElectric = true;
    }

    
    public String getColor() {
        return color;
    }

    public int year() {
        return year;
    }

    public int speed() {
        return speed;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setColor(String color) {
        this.color = color; 
    }

    public void setYear(int year) {
        this.year = year; 
    }

    public void setSpeed(int speed) {
        this.speed = speed; 
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed; 
    }

    public void setIsElectric(boolean setIsElectric) {
        this.isElectric = true; 
    }

    public void accelerateSpeed() {
        for(speed = 0; speed <= maxSpeed; speed++) {
            speed = speed + 5;
        }
    }

    public void decelerateSpeed() {
        for(speed =1; speed <= maxSpeed; speed-- ){
            speed = speed - 5;
        }
    }

    public void convertToElectric() {
        if (isElectric == true) {
            System.out.println("The car is already electric");
        } else {
            isElectric = true;
        }
    }


}
