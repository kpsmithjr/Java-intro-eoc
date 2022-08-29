package com.car;

public class Car extends App {
    private String color;
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean isElectric;
    Car(String color,int year,int maxSpead){
        this.color=color;
        this.year=year;
        this.maxSpeed=maxSpead;
        this.speed=0;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public boolean getIsElectric(){
        return this.isElectric;
    }
    public void accelerateSpeed(){
        if((this.speed + 5) <= maxSpeed){
            this.speed+=5;
        }
        // }else{
        //     System.out.println("This is your max speed");
        // }
    }
    public void decelerateSpeed(){
        if(this.speed >= 5){
            this.speed -=5;
        }else{
            System.out.println("Your cant reduce the speed further.");
        }
    }
    public void convertToElectric(){
        if(this.isElectric){
            System.out.print("the Car is already electric");
        }else{
            this.isElectric=true;
        }
    }
}
