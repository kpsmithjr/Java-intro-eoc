package com.car;

public class Car {
 private String color;
 private double year;
 private String speed;
 private String maxSpeed;
 private boolean isElectric;

 public car(String color, Double year, String speed, String maxSpeed, Boolean isElectric){ 
 {

    this.color = color;
    this.double = year;
    this.speed = speed;
    this.maxSpeed = maxSpeed;
    this.boolean = isElectric;

    
 }
 
 public String getColor()
 {
     return color;
 }

 public double getYear()
 {
     return year;
 }

 public String getSpeed()
 {
     return speed;
 }

 public String getmaxSpeed()
 {
     return maxSpeed;
 }

 public boolean isElectric(){
    return isElectric;
}
public void setColor(String color){
    this.color=color;
}
public void setYear(double year){
    this.year=year;
}
public void setSpeed(String speed){
    this.speed=speed;
}
public void setMaxSpeed(String maxSpeed){
    this.maxSpeed=maxSpeed;
}
public void setElectric(boolean isElectric){
    this.isElectric=isElectric;
}

public String toString(){
    return color + year + speed + maxSpeed + isElectric;

}


public void isElectric(){
    if(isElectric){
        System.out.println("The Car is electric.");
    }else{
        isElectric = true;
    }

}




 }

}


