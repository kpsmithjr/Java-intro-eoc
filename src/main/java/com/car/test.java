package com.car;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertToNull;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class test {

    @Before
    public void setup(){
        Honda Oddysey = new Honda("purple", 2016, 100, false);
        Honda Accord = new Honda("red", 2019, 175, true);
        Lexus RX = new Lexus("blue", 2022, 185, true);
        Lexus LS = new Lexus("gray", 2018, 190, true);
        Toyota PriusPrime = new Toyota ("blue", 2022, 180, true);
        Toyota Camry = new Toyota ("white", 2015, 190, false);/
    }

    @Test
    public void accelerateSpeedTest(){
        assertToNull(Car.accelerateSpeed());
    }

    @Test 
    public void 
}
