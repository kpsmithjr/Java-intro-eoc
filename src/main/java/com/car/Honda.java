package com.car;

public class Honda extends Car {
    //instance fields
    private boolean isTurboCharged;
    // In your Honda class, create a constructor which takes in the parameters from the parent class and boolean isTurboCharged
    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged){
        super("silver",2017,240);
        this.isTurboCharged = true;
    }
}//closing tag for Honda
