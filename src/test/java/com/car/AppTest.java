package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
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
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    
    }
    @After
public void restoreStreams() {
    System.setOut(originalOut);
   
    }
    @Test
public void checkSout() {
    Lexus rx350 = new Lexus("Red",2021, 137, true);
    rx350.convertToElectric();
    rx350.convertToElectric();
   
    assertEquals("the Car is already electric", outContent.toString());
}

    @Test
    public void shouldAnswerWithTrue()
    {
        
        assertTrue( true );
    }
    @Test
    public void accelerateSpeedTest(){
        Lexus rx350 = new Lexus("black", 2021, 127, true);
        rx350.accelerateSpeed();
        rx350.accelerateSpeed();
        int actual = rx350.getSpeed();
        assertEquals(10, actual);
    }
    @Test
    public void accelerateSpeedMaxTest(){
        Honda civic = new Honda("silver", 2015,50, true);
        civic.accelerateSpeed();//5
        civic.accelerateSpeed();//10
        civic.accelerateSpeed();//15
        civic.accelerateSpeed();//20
        civic.accelerateSpeed();//25
        civic.accelerateSpeed();//30
        civic.accelerateSpeed();//35
        civic.accelerateSpeed();//40
        civic.accelerateSpeed();//45
        civic.accelerateSpeed();//50
        civic.accelerateSpeed();//55

        assertEquals(50, civic.getSpeed());
    }
    @Test
    public void deccelerateSpeedTest(){
        Honda civic = new Honda("silver", 2015,50, true);
        civic.accelerateSpeed();//5
        civic.accelerateSpeed();//10
       civic.decelerateSpeed();//5

        assertEquals(5, civic.getSpeed());
    }
    @Test
    public void deccelerateSpeedMinTest(){
        Honda civic = new Honda("silver", 2015,50, true);
        civic.accelerateSpeed();//5
        civic.accelerateSpeed();//10
       civic.decelerateSpeed();//5
       civic.decelerateSpeed();//0
       civic.decelerateSpeed();//-5

        assertEquals(0, civic.getSpeed());
    }

    @Test
    public void convertToElectricFalseTest(){
        Lexus rx350 = new Lexus("Red",2021, 137, true);
        assertFalse(rx350.getIsElectric());
    
    }

    @Test
    public void convertToElectricSetTest(){
        Lexus rx350 = new Lexus("Red",2021, 137, true);
        rx350.convertToElectric();
        rx350.convertToElectric();
        assertTrue(rx350.getIsElectric());
    }

}
