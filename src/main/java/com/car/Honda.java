package com.car;

public class Honda  extends Car{
    
    private Boolean isTurboCharged;

    Honda(String color, int year, int maxSpeed,Boolean isTurboCharged ){

        super(color, year,  maxSpeed);

        this.isTurboCharged = isTurboCharged;
    }

    public Boolean getIsTurboCharged(){
        
        return this.isTurboCharged;
    }

    public void setIsturboCharged(Boolean isTurboCharged){

        this.isTurboCharged = isTurboCharged;
    }
}
