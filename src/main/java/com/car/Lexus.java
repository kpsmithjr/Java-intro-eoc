package com.car;

public class Lexus extends Car{
    private boolean hasLeatherSeats;
    
    Lexus (boolean hasLeatherSeats) {
        hasLeatherSeats = true;
        super();
    }

    public boolean getLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setLeatherSeats(boolean ls) {
        this.hasLeatherSeats = ls;
    }
}
