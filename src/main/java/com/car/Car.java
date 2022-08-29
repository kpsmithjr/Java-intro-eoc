package com.car;

public class Car {
    private String color;
    private int year;
    private int speed;
    private int maxSpeed=0;
    private boolean isElectric;

    public  Car(String color, int year, int maxSpeed){
        this.color=color;
        this.year=year;
        this.maxSpeed= maxSpeed;
        

    }
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
    public boolean isElectric(){
        return isElectric;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public void setElectric(boolean isElectric){
        this.isElectric=isElectric;
    }

    public String toString(){
        return color + year + speed + maxSpeed + isElectric;

    }

    public void accelerateSpeed(){
    
        if((maxSpeed -5)<=speed){
             speed +=5;}

    }
    public void decelerateSpeed(){
        if((speed -5)>=0){
        speed -=5;
    }
        

    }

    public void convertToElectric(){
        if(isElectric){
            System.out.println("The Car is already electric.");
        }else{
            isElectric = true;
        }

    }
    
    


    
    
}
