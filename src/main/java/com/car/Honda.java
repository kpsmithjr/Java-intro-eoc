package com.car;

public class Honda extends Car{
    boolean isTurboCharged;

    Honda(String color, int year, int maxSpeed, boolean isElectric, boolean isTurboCharged){
        super(color, year, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean getTurboStatus(){
        return isTurboCharged;
    }

    public void setTurboStatus(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }
    public static void main(String[] args){

    }
}