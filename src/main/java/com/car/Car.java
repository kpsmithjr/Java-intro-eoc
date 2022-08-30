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
    
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setSpeed(int speed){
        if(speed>=0){
            this.speed =speed;
        }
        else{
            System.out.println("Speed must be positive");
        }
        
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    public void accelerateSpeed(){
    speed += 5;
    if(speed > maxSpeed){
        speed = maxSpeed;
     }
    }

    public void decelerateSpeed(){
        speed -= 5;
        if(speed <0){
            speed = 0;
        }
    }

    public void convertToElectric(){
        if (isElectric){
            System.out.println("This car is electric");
        }
        else{
            System.out.println("This car is not electric");
        }
    }
}
