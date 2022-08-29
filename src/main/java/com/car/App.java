package com.car;


public class App {

    public static void main(String[] args) {
    Honda civic = new Honda("red", 2000, 180, true);
    Lexus rx350 = new Lexus("blue", 2010, 150, true);
    Toyota supra = new Toyota("silver", 2020, 180, false);

    System.out.println(civic.getColor());
    System.out.println(rx350.getColor());
    System.out.println(supra.getColor());
    // System.out.println("is electric " + supra.getIsElectric());
    // supra.convertToElectric();
    // System.out.println("is electric " + supra.getIsElectric());
    // rx350.setSpeed(150);
    // rx350.accelerateSpeed();
    // System.out.println(rx350.getSpeed());
    }
}
