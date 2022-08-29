package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car civic =new Honda("Black",2022,80,true);
        Car rx350 = new Lexus("White",2021,120,true);
        Car supra = new Toyota ("Silver",2020,120,true);
        System.out.println("The color of my Honda civic is " + civic.getColor() + ".");
        System.out.println("The color of my Lexus rx350 is " + rx350.getColor() + ".");
        System.out.println("The color of my Toyota supra is " + supra.getColor()+ ".");
    }
}
