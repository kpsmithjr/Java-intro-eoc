package com.car;

public class Honda extends Car {
    private boolean isTurboCharged;
    Honda(String color, int year, int maxSpead,boolean isTurboCharged) {
        super(color, year, maxSpead);
        this.isTurboCharged = isTurboCharged;
        
    }
    public boolean getIsTurboCharged(){
        return this.isTurboCharged;
    }
    
}
