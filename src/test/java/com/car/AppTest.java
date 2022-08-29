package com.car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Car civic;
    private Car rx350;
    private Car supra;

    @Before // setup()
    public void before() throws Exception {
         civic =new Honda("Black",2022,120,true);
         rx350 = new Lexus("White",2022,120,true);
         supra = new Toyota ("Silver",2022,120,false);
    }

    @Test
    public void accelerateSpeedTest()

    {
        civic.setSpeed(115);
        rx350.setSpeed(50);
        supra.setSpeed(10);

        civic.accelerateSpeed();
        rx350.accelerateSpeed();
        supra.accelerateSpeed();
        assertEquals( civic.getSpeed(), 120 );
        assertEquals( rx350.getSpeed(), 50 );
        assertEquals( supra.getSpeed(), 10 );
        civic.accelerateSpeed();
        rx350.accelerateSpeed();
        supra.accelerateSpeed();
        assertEquals( civic.getSpeed(), 125 );
        assertEquals( rx350.getSpeed(), 50 );
        assertEquals( supra.getSpeed(), 10 );

    }
    @Test
    public void decelerateSpeedTest()
    {

        civic.setSpeed(115);
        rx350.setSpeed(50);
        supra.setSpeed(10);

        civic.decelerateSpeed();
        rx350.decelerateSpeed();
        supra.decelerateSpeed();
        assertEquals( civic.getSpeed(), 110 );
        assertEquals( rx350.getSpeed(), 45 );
        assertEquals( supra.getSpeed(), 5 );
        civic.decelerateSpeed();
        rx350.decelerateSpeed();
        supra.decelerateSpeed();
        assertEquals( civic.getSpeed(), 105 );
        assertEquals( rx350.getSpeed(), 40 );
        assertEquals( supra.getSpeed(), 0 );
        supra.decelerateSpeed();
        assertEquals( supra.getSpeed(), 0 );
    }
    @Test
    public void convertToElectricTest()
    {
        assertEquals( civic.isElectric(), false );
        assertEquals( rx350.isElectric(), false );
        assertEquals( supra.isElectric(), false );
        civic.convertToElectric();
        rx350.convertToElectric();
        supra.convertToElectric();
        assertEquals( civic.isElectric(), true );
        assertEquals( rx350.isElectric(), true );
        assertEquals( supra.isElectric(), true );

    }


}
