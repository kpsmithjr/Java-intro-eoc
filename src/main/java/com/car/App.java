package com.car;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Honda civic = new Honda ("Black", 2021, 85, false);
        Lexus rx350 = new Lexus("White", 2022, 120, true); 
        Toyota supra = new Toyota("Blue", 2013, 110, true);
        
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
    }
}
 