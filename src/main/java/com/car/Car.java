package com.car;

public class Car {
private String color;
private int year;
private int speed = 0;
private int maxSpeed;
private Boolean isElectric;
    

    public Car(String color, int year, int maxSpeed){

        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
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

public Boolean getIsElectric(){

    return this.isElectric;
}
public void setColor(String color){
    this.color = color;
}

public void setYear(int year){

    this.year = year;
}
public void setSpeed(int speed){

    this.speed = speed;
}
public void setMaxSpeed(int maxSpeed){

    this.maxSpeed = maxSpeed;
}


public void acceleratedSpeed(){

    this.speed +=5;
    if (this.speed > this.maxSpeed)

     this.speed = this.maxSpeed; 
}

public void deceleratedSpeed(){
    this.speed-=5;
    if (this.speed < 0)

        this.speed = 0;
}

public void converedToElectric(){
    if (Boolean.TRUE.equals(isElectric)){

            System.out.println("The car is already electric");
        
     
     
    }
    else
    {

       
   
        this.isElectric = true;
    
    }
}
}


    
