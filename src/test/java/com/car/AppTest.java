package com.car;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Before 
    public void setup(){
        // Honda Accord = new Honda("black", 2007, 219, false);
        // Honda Passport = new Honda("orange", 2005, 250, true);
        // Honda Pilot = new Honda("yellow", 2021, 234,false);
        // Lexus RC = new Lexus("gray", 2003, 421, true);
        // Lexus LS = new Lexus("green", 2017, 234, false);
        // Lexus Turbo = new Lexus("white", 2016, 344, true);
        // Toyota Highlander = new Toyota("blue", 2020, 432, true);
        // Toyota Corolla = new Toyota("white", 2022, 234,false);
        // Toyota Rav4 = new Toyota("red", 2021, 234,true);
        Toyota supra = new Toyota("white", 2022, 500, true);
        Honda civic = new Honda("silver", 2017, 240, true);
        Lexus rx350 = new Lexus("red", 2015, 200, true);
    }
    /**
     * Rigorous Test :-)
     */

    @Test
    public void accelerateSpeed(){
        assertToNull(Car.accelerateSpeed(supra));
        assertToNull(Car.accelerateSpeed(civic));
    }

    @Test
    public void convertToElectricTest(){
        assertTrue(Car.convertToElectric(rx350));
    }

    @Test
    public void decelerateSpeed(){
        assertTrue(Car.decelerateSpeed())
    }

}
