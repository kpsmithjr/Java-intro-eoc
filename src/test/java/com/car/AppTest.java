package com.car;

import static org.junit.Assert.assertEquals;
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
        Car compare = new Car(color:"blue", year: 2010, maxSpeed:120);
        compare.accelerateSpeed();

        int expectedSpeed =5;
        int actualSpeed = compare.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}
