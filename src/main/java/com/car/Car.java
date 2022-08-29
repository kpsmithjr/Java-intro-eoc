package com.car;

public class Car {
    
    private String color;
    private int year;
    private int speed=0;
    private int maxSpeed;
    private boolean isElectric;


    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }


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
        if(this.year <2023 && this.year>1886){
            this.year = year;
        }else {
            System.out.println("Not a valid entry.");
        }
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        if(speed< this.maxSpeed){
            this.speed = speed;
        }else {
            this.speed=this.maxSpeed;
        }
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

    public void accelerateSpeed() {
        int a = speed+5;
        if(a <= maxSpeed){
           speed+=5;
        }else {
           speed = maxSpeed;
        }
    }
    public void decelerateSpeed() {
        int a = speed-5;
        if (a >= 0){
            speed-=5;
        }else {
            speed=0;
        }
    }

    public void convertToElectric() {
        if (isElectric){
            System.out.println("The car is already electric.");
        }else {
            isElectric=true;
        }
    }

}
