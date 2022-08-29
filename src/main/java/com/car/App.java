package com.car;

import javax.swing.text.ComponentView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println("Hello");
       Honda civic = new Honda("silver", 2015,50, true);
        Toyota supra = new Toyota("Red", 2020, 120, false);
        Lexus rx350 = new Lexus("black", 2021, 127, true);
        civic.accelerateSpeed();
        System.out.println(civic.getColor());
        System.out.println("The speed is"+civic.getSpeed());
        System.out.println(supra.getColor());
        System.out.println(rx350.getColor());
        //civic.convertToElectric();
        System.out.println(civic.getIsElectric());
        //civic.convertToElectric();
        

    }
}
