package com.car;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car (String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    //getters
    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public boolean getIsElectric(){
        return isElectric;
    }

    //setters
    public String color(String setColor){
        return color = setColor;
    }

    public int year(int setYear){
        return year = setYear;
    }

    public int speed(int setSpeed){
        return speed = setSpeed;
    }

    public int maxSpeed(int setMaxSpeed){
        return maxSpeed = setMaxSpeed;
    }

    public boolean isElectric(boolean setIsElectric){
        return isElectric = setIsElectric;
    }

    public void accelerateSpeed(){
        if(speed < maxSpeed){
            speed += 5;
        }
    }

    public void decelerateSpeed(){
        if(speed >= 5){
            speed -= 5;
        }
    }

    public void converToElectric(){
        if(isElectric == true){
            System.out.println("Car is Electric");
        }
        else{
            isElectric = true;
        }
    }
}
