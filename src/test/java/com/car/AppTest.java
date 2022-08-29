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
    public void sholuldReturnSpeedPlusFive()
    {
        Honda civic = new Honda("red", 2022, 250, true);
       int expected = 5;
        civic.acceleratedSpeed();
        int actual = civic.getSpeed();
        assertEquals(actual, expected);
        // assertTrue( true );
    }
@Test
 public void sholuldReturnSpeedPlusFives()
    {
        Toyota highlander = new Toyota("blue", 2022, 20, true);
       int expected = 20;
        highlander.acceleratedSpeed();
        highlander.acceleratedSpeed();
        highlander.acceleratedSpeed();
        highlander.acceleratedSpeed();
        highlander.acceleratedSpeed();
        int actual = highlander.getSpeed();
        assertEquals(actual, expected);
    
    }


    @Test
    public void shouldReturnSpeeedMinusFive(){

        Toyota rav4 = new Toyota("blue", 2023, 300, true);
        int expected = 0;
        rav4.deceleratedSpeed();
        int actual  = rav4.getSpeed();
        assertEquals(expected,actual);
    }

    @Test

    public void shouldReturnSpeeedMinusFives(){

        Toyota suv = new Toyota("red", 2022, 20, false);
        int expected = 0;
        suv.deceleratedSpeed();
         suv.deceleratedSpeed();
         suv.deceleratedSpeed();
         suv.deceleratedSpeed();
        int actual  = suv.getSpeed();
        assertEquals(expected,actual);
    }
@Test

public void shouldRetuenIsElectricTrue(){

    Lexus suv = new Lexus("light blue", 2023, 200, true);
    suv.converedToElectric();
    boolean expected = true;
    boolean actual =suv.getIsElectric();
    assertEquals(actual,expected);

}
@Test
public void shouldRetuenIsElectricTrues(){

    Lexus suv = new Lexus("light blue", 2023, 400, true);
    suv.converedToElectric();
    boolean expected = true;
    boolean actual =suv.getIsElectric();
    assertEquals(actual,expected);
   

}
    
}
