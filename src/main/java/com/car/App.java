package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        Honda civic = new Honda("blue", 2000, 130, true);
        System.out.println(civic.getColor());

        Lexus rx350 = new Lexus("silver", 2010, 120, false);
        System.out.println(rx350.getColor());

        Toyota supra = new Toyota("red", 2012, 150, true);
        System.out.println(supra.getColor());
        
    }
}
