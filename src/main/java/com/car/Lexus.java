package com.car;

public class Lexus extends Car {
    //instance fields 
    private boolean hasLeatherSeats;
    //create a constructor which takes in the  parameters from the parent class and boolean hasLeatherSeats 
    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super("red", 2015,200);
        this.hasLeatherSeats = true; 
    }
}//closing tag for Lexus
