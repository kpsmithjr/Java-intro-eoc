package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Car myCar = new Car ("Yellow", 1999, 150);
        //System.out.println(myCar.getColor());

        Car civic = new Honda ("Red", 1999, 140, false);
        System.out.println(civic.getColor());

        Car rx350 = new Lexus ("Beige", 2009, 150, false);
        System.out.println(rx350.getColor());

        Car supra = new Toyota ("Silver", 2021, 130, true);
        System.out.println(supra.getColor());


        myCar.accelerateSpeed(35);
        System.out.println(myCar.getSpeed());

        myCar.decelerateSpeed(10);
        System.out.println(myCar.getSpeed());

        civic.accelerateSpeed(75);
        System.out.println(civic.getSpeed());

        civic.convertToElectric();
        System.out.println(civic.getEngineType());

    }

    
}
