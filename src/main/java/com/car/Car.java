package com.car;


public class Car {
    private String color = " ";
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean isElectric;


public Car(String color, int year, int maxSpeed)
{
    //Moved setter methods outside of Constructor
}

//Getters

public String getColor() {
    return color;
}

public int getYear() {
    return year;
}

public int getSpeed() {
    return speed;
}

public int getMaxSpeed() {
    return maxSpeed;
}

public boolean getIsElectric() {
    return isElectric;
}

//Setters

public void setColor(String color) {
    this.color = color;
}

public void setYear(int year) {
    this.year = year;
}

public void setSpeed(int speed) {
    this.speed = speed;
}

public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
}

public boolean setIsElectric() {
    return isElectric;
}

// AccelerateSpeed method

public void accelerateSpeed(String string, int i, int j) {
 if(speed <= maxSpeed - 5)
    speed += 5;
}

// DecelerateSpeed method

public void decelerateSpeed() {
    if(speed == 0)
    {} else if(
    speed >= 5) {
        speed -= 5;
   } 
}
public void convertToElectric() {
    if (isElectric = true) {
        System.out.println("The car is already electric");
    } else {
        isElectric = true;
    }
}


}
