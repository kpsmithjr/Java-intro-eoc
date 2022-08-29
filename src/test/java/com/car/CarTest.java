package com.car;
 

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    Car car = new Car("white", 2006, 180);
    Honda civic = new Honda("blue", 2018, 105, false);
    Lexus rx350 = new Lexus("silver", 2017, 100, true);
    Toyota supra = new Toyota("red", 1994, 165, true);

    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(5,car.accelerateSpeed());
    }

    @Test
    public void testDecelerateSpeed(){
        Assert.assertEquals(0,car.decelerateSpeed());
    }


    @Test
    public void testGetSpeed(){Assert.assertEquals(0, car.getSpeed());}

    @Test
    public void testIsElectric(){Assert.assertFalse(car.isElectric());}

    @Test
    public void testSetColor(){
        car.setColor("black");
        Assert.assertEquals("black", car.getColor());}

    @Test
    public void testSetYear(){
        car.setYear(2005);
        Assert.assertEquals(2005, car.getYear());}

    @Test
    public void testSetMaxSpeed(){
        car.setMaxSpeed(135);
        Assert.assertEquals(135, car.getMaxSpeed());}

    @Test
    public void testSetSpeed(){
        car.setSpeed(100);
        Assert.assertEquals(100, car.getSpeed());}

    @Test
    public void testSetElectric(){Assert.assertFalse(car.isElectric());}

    @Test
    public void testIsTurbocharged(){Assert.assertFalse(civic.isTurboCharged());}

    

    @Test
    public void testHasLeatherSeats(){Assert.assertTrue(rx350.HasLeatherSeats());}

  
    

    
}