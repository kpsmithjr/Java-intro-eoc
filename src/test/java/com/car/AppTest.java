package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
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
    public void testAccelerateSpeed()
    {
        Honda civic = new Honda("blue", 2000, 8, true);
                                // current speed = 0               
        civic.accelerateSpeed(); // +5 -> speed = 5 and 5 < maxSpeed so getSpeed() should return 5;
        assertEquals(5, civic.getSpeed()); 

                                // current speed = 5
        civic.accelerateSpeed(); // + 5 -> speed = 10 and 10 > maxSpeed so can't accelerate, speed remains 5
        assertEquals(5, civic.getSpeed()); 
    }

    @Test
    public void testDecelerateSpeed(){
        Toyota camry = new Toyota("white", 2020, 120, true);
        
        camry.setSpeed(70); // set current speed = 70
        camry.decelerateSpeed();  // speed - 5 = 65
        assertEquals(65, camry.getSpeed());

        camry.setSpeed(3);  // set current speed = 3
        camry.decelerateSpeed();   // speed - 5 < 0 so speed remains 3
        assertEquals(3, camry.getSpeed());
    }

    @Test
    public void testConvertToElectric(){
        Lexus rx350 = new Lexus("green", 2015, 130, true);

        assertEquals(false, rx350.getIsElectric()); // before calling convertToElectric, isElectric should be false
        
        rx350.convertToElectric();  // after calling converToElectric, isElectric should be true
        assertEquals(true, rx350.getIsElectric()); 
    }
}
