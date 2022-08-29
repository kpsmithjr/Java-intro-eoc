package com.car;

public class Lexus extends Car {
   
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats) {
        
        super(color, year, maxSpeed);
    
        
    }

     //Getter

     public boolean getHasLeatherSeats() {
        return hasLeatherSeats;
    }

    //Setter

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }

}