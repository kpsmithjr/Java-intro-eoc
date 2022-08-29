package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Honda civic = new Honda("blue", 2020, 200, true);
        Lexus rx350 = new Lexus("gray", 2022, 250, true);
        Toyota supra = new Toyota("white", 2023, 230, true);
        System.out.println(civic.getColor() );
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

    }
}
