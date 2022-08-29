package com.car;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;

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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void accelerateSpeedTest()
    {
        assertNotNull( getSpeed() );
        assertThat(getSpeed() < getMaxSpeed());
    }

    @Test
    public void decelerateSpeedTest()
    {
        assertNotNull( getSpeed() );
        assertThat(getSpeed() >= 0);
    }

    @Test
    public void converToElectricTest()
    {
        assertNotNull( getIsElectric() );
        assertTrue( getIsElectric() );
        
    }
}
