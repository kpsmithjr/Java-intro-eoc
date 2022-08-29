package com.car;

public class Lexus extends Car{
    boolean hasLeatherSeats;

    public Lexus (String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super(color, year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }
    public boolean getHasLeatherSeats(){
        return hasLeatherSeats;
    }
    public void setHasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
