package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

     Car civic = new Car("Green", 1985, 105);
    /**
     * Rigorous Test :-)
     */

     //part 1

    @Test
    public void accelerateSpeedTest()
    {
        Car civic = new Car("Green", 1985, 105);
        assertEquals(0, civic.getMaxSpeed() );
    }

    @Test
    public void decelerateSpeedTest()
    {
        decelerateSpeed("Green", 1985, 105);
        assertEquals(0, civic.getMaxSpeed() );
    }

    private void decelerateSpeed(String string, int i, int j) {
    }
}
