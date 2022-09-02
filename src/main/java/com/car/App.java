package com.car;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      Car civic = new Honda("blue", 2021, 50, 100, true);

      Car rx350 = new Lexus("red", 2016, 100, 140, false );

      Car supra = new Toyota("Silver", 2019, 80, 130, false);

      
      System.out.println(supra.getColor());
      System.out.println(((Lexus) rx350).isHasLeatherSeats());
      
      System.out.println(((Honda) civic).isTurboCharged());
      
      
      
    
    }
   
}
