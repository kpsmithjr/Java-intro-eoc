package com.car;

public class Lexus extends Car {
    private boolean LeatherSeats;


    public  Lexus(String color, Double year,String maxSpeed, boolean LeatherSeats){
       
        super(color, year, maxSpeed); 
        this.LeatherSeats=LeatherSeats;

    }
    public boolean getLeatherSeats(){
        return LeatherSeats;
    }
    
    
}