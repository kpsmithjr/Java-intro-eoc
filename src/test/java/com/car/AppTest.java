package com.car;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AppTest 
{

        Honda civic = new Honda("silver", 2022, 165, true);
            
        Random random= new Random();
        

    @Test
    public void accelerateSpeedTest() //test if it increments from 0-5
    {
        civic.accelerateSpeed();
        int actual = civic.getSpeed();
        assertEquals(5, actual);
    }
    @Test
    public void accelerateSpeedTest2() //test if it increments +5 from a random number between 0 and 6less than maxspeed
    {
        int int_random = random.nextInt(civic.getMaxSpeed()-6);

        civic.setSpeed(int_random);
        int expected= civic.getSpeed() + 5;
        civic.accelerateSpeed();
        int actual = civic.getSpeed();
        assertEquals(expected, actual);
    }
    @Test
    public void accelerateSpeedTest3() //test if it will increments to max speed
    {
        civic.setSpeed(160);
        civic.accelerateSpeed();
        assertEquals(165, civic.getSpeed());
    }
   
    @Test
    public void accelerateSpeedTest4() //test if it will not increment past max speed
    {
        civic.setSpeed(164);
        civic.accelerateSpeed();
        assertEquals(165, civic.getSpeed());
    }
   
    @Test
    public void decelerateSpeedTest() //test if it decrements from 10-5
    {
        civic.setSpeed(10);
        civic.decelerateSpeed();
        int actual = civic.getSpeed();
        assertEquals(5, actual);
    }
    @Test
    public void decelerateSpeedTest2() //test if it decrements -5 from a random number
    {
        int int_random = random.nextInt(civic.getMaxSpeed());

        civic.setSpeed(int_random);
        int expected= civic.getSpeed() -5;
        if (civic.getSpeed() <5){
            expected=0;
        }
        civic.decelerateSpeed();
        int actual = civic.getSpeed();
        assertEquals(expected, actual);
    }
    @Test
    public void decelerateSpeedTest3() //test if it will decrement to 0
    {
        civic.setSpeed(5);
        civic.decelerateSpeed();
        assertEquals(0, civic.getSpeed());
    }
   
    @Test
    public void decelerateSpeedTest4() //test if it will not decrement past 0
    {
        civic.setSpeed(4);
        civic.decelerateSpeed();
        assertEquals(0, civic.getSpeed());
    }

    @Test
    public void convertToElectricTest() { //test if convertToElectric will turn true
        civic.convertToElectric();
        boolean actual = civic.isElectric();
        assertEquals(true, actual);
    }

    @Test
    public void convertToElectricTest2() { //test if convertToElectric will leave true as true
        civic.setElectric(true);
        civic.convertToElectric();
        boolean actual = civic.isElectric();
        assertEquals(true, actual);
    }
   
}
