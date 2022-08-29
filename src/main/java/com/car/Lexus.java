package com.car;

public class Lexus
    extends Car
{

    private boolean hasLeatherSeats;

    protected Lexus(String color, int year, int speed, int maxSpeed, boolean isElectric )
    {
        super( color, year, speed, maxSpeed, isElectric);
    }

    public int getHasLeatherSeats()
    {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats( int hasLeatherSeats )
    {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}