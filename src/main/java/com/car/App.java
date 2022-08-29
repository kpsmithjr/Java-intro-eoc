package com.car;


public class App 
{
    public static void main( String[] args )
    {
        Honda civic = new Honda("Burgundy Night Pearl", 2018, 137, true);        
        System.out.println(civic.getColor());

        Lexus rx350 = new Lexus("Nori Green Pearl", 2021, 124, true);
        System.out.println(rx350.getColor());

        Toyota supra = new Toyota("Stratospheric Blue", 2023, 155, false);
        System.out.println(supra.getColor());
    }
}
