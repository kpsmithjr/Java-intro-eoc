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


    //test accelarateSpeed
    @Test
    public void testAccelerateSpeed1()
    {
        Car newCar = new Car("Red", 2000, 120);
        newCar.accelerateSpeed(100);
        assertEquals(100, newCar.getSpeed());
        
    }

    @Test
    public void testAccelerateSpeed2()
    {
        Car oldCar = new Car("Brown", 2022, 200);
        oldCar.accelerateSpeed(200);
        assertEquals(200, oldCar.getSpeed());
        
    }

    //test decelerateSpeed
    @Test
    public void testDecelerateSpeed1()
    {
        Car newCar = new Car("Red", 2000, 120);
        newCar.accelerateSpeed(100);
        newCar.decelerateSpeed(70);
        assertEquals(30, newCar.getSpeed());
    }


    @Test
    public void testDecelerateSpeed2()
    {
        Car oldCar = new Car("Brown", 2022, 200);
        oldCar.accelerateSpeed(200);
        oldCar.decelerateSpeed(100);
        assertEquals(100, oldCar.getSpeed());
        
    }









    //test convertToElectric
    @Test
    public void testConvertToElectric1()
    {
        Car newCar = new Car("Red", 2000, 120);
        newCar.convertToElectric();
        assertEquals(true, newCar.getEngineType());
    }

    @Test
    public void testConvertToElectric2()
    {
        Car oldCar = new Car("Brown", 2022, 200);
        oldCar.convertToElectric();
        assertEquals(true, oldCar.getEngineType());
    }


    


}
