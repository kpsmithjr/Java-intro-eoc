package com.car;

    public class Honda extends Car{
    boolean isTurboCharged;
    
    public Honda(int year, Object object, int maxSpeed,  boolean isTurboCharged){
    super( year, color, maxSpeed, maxSpeed, isTurboCharged);
    this.isTurboCharged = isTurboCharged;
    } 
}
