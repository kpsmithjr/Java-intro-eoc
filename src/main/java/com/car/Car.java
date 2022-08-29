package com.car;

public class Car {
private int year;
private int  speed = 0;
private int maxSpeed;
private boolean isElectric;
private String color;

    public Car(String color, int year, int maxSpeed){
    this.color = color;
    this.year = year;
    this.maxSpeed = maxSpeed;

        
    }
public void accelerateSpeed(){
    try {
        if(speed + 5<maxSpeed){
                speed += 5; 
            }
    } catch (Exception e) {
     
        throw new ArithmeticException("cannot accelerate past max speed");
    }
        
        }
public void decelerateSpeed(){
            if(speed - 5<0){
                System.out.println("cannot decelerate any further");
            }else {
              speed -= 5;  
            }
            
        }
        public void convertToElectric(){
            if(isElectric){
                // System.out.println("vehicle is already electric");
                throw new ArithmeticException("cannot accelerate past max speed");
            }else{
                isElectric = true;
                System.out.println("vehicle is electric");
            }
        }

    public int getYear() {return year;}
    public void setYear(int year) {
        this.year = year;
    }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public boolean getisElectric() { return isElectric; }
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
