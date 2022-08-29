package com.car;

public class Lexus extends Car{
    
    private Boolean hasLeatherSeat;

     Lexus(String color, int year, int maxSpeed, Boolean hasLeatherSeat){

         super( color, year,  maxSpeed);
         this.hasLeatherSeat = hasLeatherSeat;

     }
     
     public Boolean getHasLeatherSeat() {
         return this.hasLeatherSeat;
     
     }
     public void hasLeatherSeat(boolean hasLeatherSeat){

        this.hasLeatherSeat = hasLeatherSeat;
     }

   
}
