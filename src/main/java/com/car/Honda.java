package com.car;

public class Honda extends Car {
    
    private boolean isTurboCharged;

    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged) {
        
        super(color, year, maxSpeed);
        
    }


     //Getter

    public boolean getIsTurboCharged() {
        return isTurboCharged;
    }

    //Setter

    public void setIsTurboCharged(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;
    }


}