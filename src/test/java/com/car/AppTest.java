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
    Car testCar = new Car("red", 2000, 100, false);
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void accelerationTest(){
        int testSpeed = testCar.speed;
        testCar.accelerateSpeed();
        assertTrue( testSpeed+5 == testCar.speed );
    }

    @Test
    public void nextAccelTest(){
        testCar.speed = testCar.maxSpeed;
        testCar.accelerateSpeed();
        assertTrue(testCar.speed == testCar.maxSpeed);
        testCar.speed = 0;
    }

    @Test
    public void firstDecel(){
        testCar.speed = testCar.maxSpeed;
        testCar.decelerateSpeed();
        assertTrue(testCar.speed == testCar.maxSpeed-5);
    }

    @Test
    public void secondDecel(){
        testCar.speed = 4;
        testCar.decelerateSpeed();
        assertTrue(testCar.speed == 0);
    }

    @Test
    public void firstElectric(){
        boolean first = testCar.isElectric;
        testCar.convertToElectric();
        assertTrue(testCar.isElectric != first);
    }

    @Test 
    public void secondElectric(){
        testCar.isElectric = true;
        testCar.convertToElectric();
        assertTrue(testCar.isElectric == true);
    }
}
