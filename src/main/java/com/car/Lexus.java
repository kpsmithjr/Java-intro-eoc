package com.car;

public class Lexus extends Car {
 boolean hasLeatherSeats;



 public Lexus(String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats) {
  super(color, year, speed, maxSpeed );
  this.hasLeatherSeats = hasLeatherSeats;
 }

 public boolean isHasLeatherSeats() {
  return hasLeatherSeats;
 }

 public void setHasLeatherSeats(boolean hasLeatherSeats) {
  this.hasLeatherSeats = hasLeatherSeats;
 }

}
