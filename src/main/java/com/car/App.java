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

       Honda civic = new Honda(color:"blue", year: 2010, maxSpeed:120, isTurboCharged: false);
       Lexus rx350 = new Lexus(color:"black", year: 2020, maxSpeed:140, hasLeatherSeats: true);
       Tyota super = new Toyata(color:"red", year: 2015, maxSpeed:100, greatGasMileage: true);

       System.out.println(civic.getColor());
       System.out.println(rx350.getColor());
       System.out.println(supra.getColor());
    }
}
