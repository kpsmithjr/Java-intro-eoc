package com.car;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus (String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super(color, year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    //getter
    public boolean getHasLeatherSeats(){
        return hasLeatherSeats;
    }

    //setter
    public boolean hasLeatherSeats(boolean leatherSeats){
        return hasLeatherSeats = leatherSeats;
    }
}
