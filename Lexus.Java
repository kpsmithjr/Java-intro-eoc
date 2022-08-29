package com.car;

public class Lexus extends Car{
boolean hasLeatherSeats;

public Lexus(int year, String color, int maxSpeed, boolean hasLeatherSeats){
super( year, color, maxSpeed, maxSpeed, hasLeatherSeats);
this.hasLeatherSeats = hasLeatherSeats;
}
}
