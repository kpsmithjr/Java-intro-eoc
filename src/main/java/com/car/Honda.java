package com.car;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda (String color, int year, int maxSpeed, boolean isTurboCharged){
        super(color, year, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }

    //gette
    public boolean getIsTurboCharged(){
        return isTurboCharged;
    }

    //setter
    public boolean isTurboCharged(boolean isCharged){
        return isTurboCharged = isCharged;
    }
}
