package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
    public void accelerateSpeedTest()
    {
        // test accelerateSpeed from zero, 0 + 5
        Toyota supra = new Toyota("Stratospheric Blue", 2023, 155, false);
        supra.accelerateSpeed();
        assertEquals(5, supra.getSpeed()); 

        // test accelerateSpeed near max, from 135 goes to max 137
        Honda civic = new Honda("Burgundy Night Pearl", 2018, 137, true);
        civic.setSpeed(135); // set speed at 135
        civic.accelerateSpeed(); // call accerateSpeed()
        assertEquals(137, civic.getSpeed()); // since 135 + 5 is > max, speed should equal max 137

        // test accelerateSpeed at max 124
        Lexus rx350 = new Lexus("Nori Green Pearl", 2021, 124, true);
        rx350.setSpeed(124); // set speed to max 124
        rx350.accelerateSpeed(); // call accerateSpeed()
        assertEquals(124, rx350.getSpeed()); // should stay at max speed 124
    }
    
    @Test 
    public void decelerateSpeedTest()
    {
        // test decelerateSpeed from 35 
        Toyota supra = new Toyota("Stratospheric Blue", 2023, 155, false);
        supra.setSpeed(35); // set speed at 35
        supra.decelerateSpeed(); // call decelerateSpeed()
        assertEquals(30, supra.getSpeed()); // 35 - 5 = 30

        // test decelerateSpeed near 0, should not go below 0 
        Honda civic = new Honda("Burgundy Night Pearl", 2018, 137, true);
        civic.setSpeed(3); // set speed at 3
        civic.decelerateSpeed(); // call decelerateSpeed()
        assertEquals(0, civic.getSpeed()); // since 3 - 5 is < 0, speed should equal 0

        // test decelerateSpeed at 0
        Lexus rx350 = new Lexus("Nori Green Pearl", 2021, 124, true);
        assertEquals(0, rx350.getSpeed()); // check that initial speed is 0 
        rx350.decelerateSpeed(); // since initial speed is already set to 0 call decelerateSpeed()
        assertEquals(0, rx350.getSpeed()); // speed should stay at 0
    } 

    @Test
    public void convertToElectricTest()
    {
        // test convertToElectric from false 
        Lexus rx350 = new Lexus("Nori Green Pearl", 2021, 124, true);
        assertFalse(rx350.getIsElectric());  // make sure isElectric is false
        rx350.convertToElectric(); // convert to electric so it will be true
        assertTrue(rx350.getIsElectric());  // check isElectric has changed to true

        // test convertToElectric from true to make sure it stays true
        Honda civic = new Honda("Burgundy Night Pearl", 2018, 137, true);
        civic.setIsElectric(true);  // set isElectric to true
        civic.convertToElectric(); // call convertToElectric
        assertTrue(civic.getIsElectric()); // check isElectric is true
    }
}
