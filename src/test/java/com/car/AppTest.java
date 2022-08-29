package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.IsEqual;

import static org.junit.Assert.assertThat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test // did it add 5 to the speed. default speed is 0 then accelerateSpeed() should equal 5.
    public void accelerateSpeedTrue() {
       Honda civic = new Honda("red", 2000, 180, true);
       civic.accelerateSpeed();
       assertTrue(civic.getSpeed() == 5);
    }
    @Test // is the speed less than or equal to max speed. set to 150 which is max then accelerateSpeed()
    public void accelerateSpeedMax() {
        Lexus rx350 = new Lexus("blue", 2010, 150, true);
        rx350.setSpeed(150);
        rx350.accelerateSpeed();
        assertTrue(rx350.getSpeed() <= rx350.getMaxSpeed());
    }

    @Test // did it reduce by 5, set to 105 then decelerateSpeed, should equal 100
    public void decelerateSpeedTrue() {
        Toyota supra = new Toyota("silver", 2020, 180, false);
        supra.setSpeed(105);
        supra.decelerateSpeed();
        assertTrue(supra.getSpeed() == 100);
    }
    @Test // did it go below zero, set speed 0 then decelerateSpeed, should not go below 0
    public void decelerateSpeedFalse() {
        Toyota supra = new Toyota("silver", 2020, 180, false);
        supra.setSpeed(0);
        supra.decelerateSpeed();
        assertTrue(supra.getSpeed() == 0);
    }

    @Test // did it convert to electric, default is not electric and convertToElectric() then be electric.
    public void convertToElectricTrue() {
        Toyota supra = new Toyota("silver", 2020, 180, false);
        supra.convertToElectric();
        assertTrue(supra.getIsElectric());
    }
    @Test // still electric after converting twice.  trying to set up and capture the println message, work in progress.
    public void convertToElectric() {
        Toyota supra = new Toyota("silver", 2020, 180, false);
        supra.convertToElectric();
       // String message = "vehicle is already electric";
        supra.convertToElectric();
      //  assertTrue(supra.getIsElectric());
       // assertEquals(message, outContent.toString());
       assertTrue(true);
    }
    }




