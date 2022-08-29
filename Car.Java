package com.car;
//car.java

class Car
{
  private static final boolean isTurboCharged = false;
private static final boolean greatGasMileage = false;
private static final boolean hasLeatherSeats = false;
int year;
  String color;
  int speed = 0;
  int maxSpeed;
  boolean isElectric;


public Car(int year, String color, int speed, int maxSpeed, boolean isElectric) {
this.year = year;
this.color = color;
this.speed = speed;
this.maxSpeed = maxSpeed;
this.isElectric = isElectric;
}

public static void main( String[] args) {}
     Lexus rx350 = new Lexus(year  , color , maxSpeed , hasLeatherSeats);

     Toyota supra = new Toyota(year , color ,  maxSpeed , greatGasMileage);
     

     Honda civic = new Honda(year , color ,  maxSpeed , isTurboCharged);
}



