package com.car;

public class Car{
    String color;
    int year;
    int speed = 0;
    int maxSpeed;
    boolean isElectric;


    public Car(String color, int year, int maxSpeed, boolean isElectric){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
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

    public int getmaxSpeed(){
        return maxSpeed;
    }

    public boolean getElectricStatus(){
        return isElectric;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void accelerateSpeed(){
        if (this.maxSpeed-this.speed >= 5){
            this.speed += 5;
        } else {
            this.speed = this.maxSpeed;
        }
    }

    public void decelerateSpeed(){
        if (this.speed > 5){
            this.speed -= 5 ;
        } else {
            this.speed = 0;
        }
    }

    public void convertToElectric(){
        if (this.isElectric == false){
            this.isElectric = true;
        } else {
            System.out.println("The car is already electric!");
        }
    }
    public static void main(String[] args){
        Honda civic = new Honda("blue", 2003, 137, false, false);
        Lexus rx350 = new Lexus("red", 2017, 142, false, true);
        Toyota supra = new Toyota("green", 2010, 121, true, false);
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
    }
}