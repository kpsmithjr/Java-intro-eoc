package com.car;

public class Honda
    extends Car
{

    private boolean isTurboCharged;

    protected Honda(String color, int year, int speed, int maxSpeed, boolean isElectric )
    {
        super( color, year, speed, maxSpeed, isElectric);
    }

    public int getIsTurboCharged()
    {
        return isTurboCharged;
    }

    public void setIsTurboCharged( int isTurboCharged )
    {
        this.isTurboCharged = isTurboCharged;
    }
}

