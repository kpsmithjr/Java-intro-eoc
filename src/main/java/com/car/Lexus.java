package com.car;

public class Lexus extends Car {

    private boolean hasLeatherSeats;
    
    public Lexus (String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super( color, year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }
    public boolean getHasLeatherSeat(){
        return hasLeatherSeats;
    }

    public void hasLeatherSeat(boolean hasLeatherSeat){
        this.hasLeatherSeats = hasLeatherSeats;
    }

    
}

