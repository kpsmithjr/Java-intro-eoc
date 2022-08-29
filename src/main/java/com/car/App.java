package com.car;


public class App 
{
    public static void main( String[] args )
    {
        Honda civic = new Honda("black", 2009, 145, true);
        Lexus rx350 = new Lexus("silver", 2018, 200, true);
        Toyota supra = new Toyota("white", 2001, 130, false);

        System.out.println("The Honda is " + civic.getColor() + ".");
        System.out.println("The Lexus is " + rx350.getColor() + ".");
        System.out.println("The Toyota is " + supra.getColor() + ".");
    }
}
