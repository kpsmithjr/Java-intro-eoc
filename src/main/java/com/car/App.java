package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Toyota supra = new Toyota("white", 2022, 500, true);
        Honda civic = new Honda("silver", 2017, 240, true);
        Lexus rx350 = new Lexus("red", 2015, 200, true);

        System.out.println( "The Toyota is " + supra.getColor() + ".");
        System.out.println( "The Honda is " + civic.getColor() + ".");
        System.out.println( "The Lexus is " + rx350.getColor() + ".");
    }
}
