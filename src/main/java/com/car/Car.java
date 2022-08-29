package com.car;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void accelerateSpeed(){
        if(speed <= maxSpeed-5){
            speed += 5;
        }
    }

    public void decelerateSpeed(){
        if(speed >= 5){
            speed -= 5;
        }
    }

    public void convertToElectric(){
        if(this.isElectric){
            System.out.println("The Car is already electric");
        } else{
            this.isElectric = true;
        }
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        if(speed > this.maxSpeed){
            System.out.println("Failed to set new speed!");
        } else{
            this.speed = speed;
        }
        
    }

    public int getMaxSpeed(){
        return this.maxSpeed; 
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public boolean getIsElectric(){
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }
}
