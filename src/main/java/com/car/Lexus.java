package com.car;

public class Lexus extends Car{
    private boolean hasLeatherSeats;
    Lexus(String color, int year, int maxSpead,boolean hasLeatherSeats) {
        super(color, year, maxSpead);
        this.hasLeatherSeats = hasLeatherSeats;
        
        
    }
    public boolean getHasLeatherSeats(){
        return this.hasLeatherSeats;
    }

    
    
}
