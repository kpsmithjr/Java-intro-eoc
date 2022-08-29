package com.car;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric = false;


    public Car (String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor () {
        return color;
    }

    public int getYear () {
        return year;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public int getSpeed () {
        return speed;
    }

    public boolean getEngineType () {
        return isElectric;
    }

    public void accelerateSpeed (int addMph) {
        if (speed + addMph <= maxSpeed) {
            speed += addMph;
        }
        else {
            System.out.println("Woah, this car can't go that fast!");
        }
    }

    public void decelerateSpeed (int minusMph) {
        if (speed - minusMph  >= 0) {
            speed -= minusMph;
        }
        else {
            System.out.println("Hey this car can't go less than zero MPH!");
        }
    }

    public void convertToElectric(){
        if (isElectric == true){
            System.out.println("Vehicle is already electric");
        }
        else {
            isElectric = true;
        }
    }



    

}
