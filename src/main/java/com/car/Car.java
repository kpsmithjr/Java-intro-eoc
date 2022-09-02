package com.car;

public class Car extends App {
 String color;
 int year;
 int speed ;
 int maxSpeed;
 boolean isElectric;
 public Car(String color, int year, int speed, int maxSpeed) {
  this.color = color;
  this.year = year;
  this.speed = speed;
  this.maxSpeed = maxSpeed;
  
 }
 public Car(String color, int year, int maxSpeed, boolean hasLeatherSeats) {
 }
 public String getColor() {
  return color;
 }
 public void setColor(String color) {
  this.color = color;
 }
 public int getYear() {
  return year;
 }
 public void setYear(int year) {
  this.year = year;
 }
 public int getSpeed() {
  return speed;
 }
 public void setSpeed(int speed) {
  this.speed = speed;
 }
 public int getMaxSpeed() {
  return maxSpeed;
 }
 public void setMaxSpeed(int maxSpeed) {
  this.maxSpeed = maxSpeed;
 }
 public boolean isElectric() {
  return isElectric;
 }
 public void setElectric(boolean isElectric) {
  this.isElectric = isElectric;
 }

 public void accelerateSpeed(){
  speed += 5;

 }

 public void deccelerateSpeed(){
  speed-= 5;
  if(speed < 0){
   System.out.println("Speed cannot go less than 0 MPH");

  }
 }

 public void convertToElectric(){
 if(isElectric == true){
  System.out.println("The car is already electric");
 }

 }
 

 
 
}
