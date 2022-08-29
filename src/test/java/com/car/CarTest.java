package com.car;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
    // private final App car = new App();
//     @Before 
//     public void setUp(){
//     Honda civic = new Honda("blue", 1990, 120, true);
//     Lexus rx350 = new Lexus("purple", 1999, 140, true);
    // Toyota supra = new Toyota("green", 1970, 130, true);
    // }

    @Test
    public void testAccelerateSpeed() {
        Honda civic = new Honda("blue", 1990, 120, true);
        //setup
        civic.accelerateSpeed();
        int actual = civic.getSpeed();
        int expected = 5;
        //test method
        assertEquals(expected, actual);
    }
    @Test
    public void testAccelerateSpeedConditional() {
        Honda civic = new Honda("blue", 1990, 120, true);
        //setup conditional test
        civic.setSpeed(120);
        civic.accelerateSpeed();
        int expected = 120;
        


        //test method should not go past 120
        assertEquals(expected, civic.getSpeed());

    }




    @Test
    public void testConvertToElectric() {
        Toyota supra = new Toyota("green", 1970, 130, true);
        supra.convertToElectric();
       boolean expected = true;
       boolean actual = supra.getisElectric();
       //test that method works
       assertEquals(expected, actual);
    }

    //RAN OUT OF TIME FOR SECOND CONDIYIONAL CHECKS
    // @Test
    // public void testConvertToElectricConditional() {
    //     Toyota supra = new Toyota("green", 1970, 130, true);
    //   supra.convertToElectric();
    //    String expected = "vehicle is already electric";
       
    // }

  
    @Test
    public void testDecelerateSpeed() {
        Lexus rx350 = new Lexus("purple", 1999, 140, true);
        rx350.setSpeed(50);
        rx350.decelerateSpeed();
        int expected = 45;
        int actual = rx350.getSpeed();
        //test that method works
        assertEquals(expected, actual);
    }
}
