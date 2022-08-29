package com.car;

public class Main {
    public static void main(String[] args) {
        
        Honda civic = new Honda("green", 1995, 160, true);
        Lexus rx350 = new Lexus("red",2020, 240, true);
        Toyota supra = new Toyota("black", 2024, 205, false);
        
        
        
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());


        System.out.println(civic.decelerateSpeed());
        
        System.out.println(civic.convertToElectric());


        System.out.println(rx350.decelerateSpeed());

        System.out.println(rx350.convertToElectric());

        System.out.println(supra.decelerateSpeed());

        System.out.println(supra.convertToElectric());
        }
}
