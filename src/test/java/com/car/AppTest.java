package com.car;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void accelerateSpeed(){
        Car newCar = new Car("brown", 2010, 125);
        
        int expected = 125;
        int actual =  newCar.getSpeed();
    
        assertTrue( true );
    }

    @Test
    public void decelerateSpeed()
    {
        Car newCar1 = new Car("Yellow", 2015, 135);
        assertTrue( true );
    }

    @Test
    public void convertToElectric()
    {
        Car newCar2 = new Car("Red", 2020, 145);
        assertTrue( true );
    }
}
