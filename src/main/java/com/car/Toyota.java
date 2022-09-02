package com.car;

public class Toyota extends Car{
 boolean greatGasMileage;
 public Toyota(String color, int year, int speed, int maxSpeed, boolean greatGasMileage) {
  super(color, year, speed, maxSpeed);
  //TODO Auto-generated constructor stub
  this.greatGasMileage = greatGasMileage;
 }
 public boolean isGreatGasMileage() {
  return greatGasMileage;
 }
 public void setGreatGasMileage(boolean greatGasMileage) {
  this.greatGasMileage = greatGasMileage;
 }


 
}
