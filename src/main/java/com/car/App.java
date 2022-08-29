package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Car[] carList= new Car[9];

    public static void main( String[] args )
    {

        Honda civic = new Honda("silver", 2022, 165, true);
        Lexus rx350 = new Lexus("red", 2021, 180, true);
        Toyota supra = new Toyota("black", 2005, 210, false);
        Honda pilot = new Honda("white", 2020, 155, false);
        Lexus nx250 = new Lexus("yellow", 2019, 180, false);
        Toyota camry = new Toyota("beige", 2015, 130, true);
        Honda odyssey = new Honda("cream", 2018, 145, true);
        Lexus ls500 = new Lexus("red", 2023, 190, true);
        Toyota tundra = new Toyota("black", 2019, 150, false);

        carList[0]= civic;
        carList[1]=rx350;
        carList[2]=supra;
        carList[3]=pilot;
        carList[4]=nx250;
        carList[5]=camry;
        carList[6]=odyssey;
        carList[7]=ls500;
        carList[8]=tundra;

        for (Car car : carList) {
            System.out.println(car.getColor());
        }





    }
}
