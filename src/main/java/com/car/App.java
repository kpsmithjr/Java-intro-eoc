package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Honda civic = new Honda("blue", 1990, 120, true);
      Lexus rx350 = new Lexus("purple", 1999, 140, true);
      Toyota supra = new Toyota("green", 1970, 130, true);

      System.out.println(civic.getColor());
      System.out.println(rx350.getColor());
      System.out.println(supra.getColor());

    }
}
