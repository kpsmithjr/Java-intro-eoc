package com.car;



public class Toyota extends Car  {
    private boolean Mileage;


    public  Toyota(String color, Double year, String maxSpeed, boolean Mileage){
       
        super(color, year, maxSpeed);
        this.Mileage = Mileage;

    }
    public boolean Mileage(){
        return Mileage;
    }
    
    
}