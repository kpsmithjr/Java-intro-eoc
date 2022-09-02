package com.car;

public class Honda extends Car {
 boolean isTurboCharged;
 public Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged) {
  super(color, year, speed, maxSpeed);
  //TODO Auto-generated constructor stub
  this.isTurboCharged = isTurboCharged;
 }
 public boolean isTurboCharged() {
  return isTurboCharged;
 }
 public void setTurboCharged(boolean isTurboCharged) {
  this.isTurboCharged = isTurboCharged;
 }

 
 
}
