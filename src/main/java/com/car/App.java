package com.car;


public class App 
{
    public static void main( String[] args )
    {
        Honda civic = new Honda("White", 2018, 120, true);
        Lexus rx350 = new Lexus("Black", 2013, 100, true);
        Toyota supra = new Toyota("Grey", 2010, 100, false);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
    }
}
