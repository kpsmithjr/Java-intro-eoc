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
    public void hondaCar()
    {
     Car honda = new Car("blue", 2020, 50);
        String expected = "blue";
        String actual = honda.getColor();

        assertEquals(expected, actual);
        assertEquals("blue", honda.getColor());
    }

    /**
     * 
     */
    @Test
    public void alreadyElectric() {
        Car audiCar = new Car("gray", 2019, 50);
        audiCar.setIsElectric(true);

        String expected = "The car is already electric";
        String actual = audiCar.isElectric();

        assertEquals(expected, actual);
        assertEquals("true", audiCar.isElectric());
    }
}
