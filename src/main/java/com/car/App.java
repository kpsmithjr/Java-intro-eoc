package com.car;

//import java.util.ArrayList;

/**
 * Hello world!
 *
 */
class App
{
    public static void main( String[] args, String Blue, String Red, String White )
    {
        //ArrayList<Car>obj= new ArrayList<Car>();

        
       Car civic = new Honda("Blue", 1996, 118, false);

        System.out.println(civic.getColor() );

        Car rx350 = new Lexus("Red", 2003, 156, false);

        System.out.println(rx350.getColor() );

        Car supra = new Toyota("White", 2011, 206, false);

        System.out.println(supra.getColor() );
        


        
        
        
        
        
        
        
        
        
        
        
        //System.out.println( "Hello World!" );
    }
}
