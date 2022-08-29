package com.car;

import java.time.Year;

public class Car {
    private String color;
    private int year;
    private int speed;
    private int maxSpeed; 
    boolean isElectric; 

    public Car( String color, int year, int speed, int maxSpeed, boolean isElectric )
    {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric
    }

    public String getColor()
    {
        return color;
    }

    public int getYear()
    {
        return year;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int maxSpeed() 
    {
        return maxSpeed;
    }

    public boolean isElectric()
    {
        return isElectric;
    }

    public class Car{
        static void accelerateSpeed() {
          
        }
      }
      
