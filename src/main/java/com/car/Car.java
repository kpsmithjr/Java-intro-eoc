package com.car;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    // Getters
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

    // Setters
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

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void accelerateSpeed() {
        if (speed <= maxSpeed - 5) {
            speed +=5;
        } else {
            speed = maxSpeed;
        }
    }

    public void decelerateSpeed() {
        if (speed >= 5) {
            speed -= 5;
        } else {
            speed = 0;
        }
    }

    public void convertToElectric() {
        if (isElectric) {
            System.out.println("car is already electric");
        } else {
            isElectric = true;
        }
    }

}
