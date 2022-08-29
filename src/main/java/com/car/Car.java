package com.car;


public class Car {
    String color;
    int year;
    int speed = 0;
    int maxSpeed;
    boolean isElectric;

    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void accelerateSpeed(Car car, int speed, int maxSpeed){
        if (this.speed <= this.maxSpeed){
           speed += 5;}
    }

    public void decelerateSpeed(Car car, int speed){
        if (this.speed >= 0){
            speed -= 5;
        }
    }

    public void convertToElectric(Car car, boolean isElectric){
        if (isElectric == true){
            System.out.println("This car is already electric.");
        } else { 
            isElectric = true;
        }
    }
}
