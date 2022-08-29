package com.car;

public class Lexus extends Car{
    boolean hasLeatherSeats;

    Lexus(String color, int year, int maxSpeed, boolean isElectric, boolean hasLeatherSeats){
        super(color, year, maxSpeed, isElectric);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public boolean getSeatStatus(){
        return hasLeatherSeats;
    }

    public void setSeatStatus(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }
    public static void main(String[] args){

    }
}