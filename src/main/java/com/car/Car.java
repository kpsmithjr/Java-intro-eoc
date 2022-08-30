package com.car;

public class Car {
    // instance field
    private String color; 
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric; 

    //constructor 
    public Car(String color, int year, int maxSpeed){
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
    public void setColor(String newColor){
        color = newColor;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        maxSpeed = newMaxSpeed;
    }

    public void setIsElectric(boolean newIsElectric){
        isElectric = newIsElectric; 
    }

    //create a method and name it accelerateSpeed. This method should not return anything and should increase the car speed by five MPH. Make sure the speed doesn’t go above the vehicle's maxSpeed value.
    public void accelerateSpeed(){
        if (this.speed <= this.maxSpeed){
            this.speed+=5; 
        }
    }
    // create a method and name it decelerateSpeed. This method should not return anything and should decrease the car speed by five MPH. Make sure the speed doesn’t go below 0 MPH.
    public void decelerateSpeed(){
        if (this.speed >= 0){
            this.speed-= 5;
        }
    }
    // create a method and name it convertToElectric. This method should not return anything and should change the value of isElectric to true. If the value of this field is already set to true the method should display a message to the user stating that the Car is already electric.
    public void convertToElectric(){
        if (isElectric == true){
            System.out.println("Car is already electric");
        } else {
            isElectric = true;
        }
    }

}//closing tag for the class 
