package com.car;

public class Lexus extends Car {
    boolean hasLeatherSeats;

    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super(color, year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    // Getters
    public boolean getHasLeatherSeats() {
        return hasLeatherSeats;
    }

    // Setters
    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }

}
