package com.car;

public class Car {
        private String color;
     private int year;
     private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

         public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

        public void accelerateSpeed(){
        if(this.speed + 5 < this.maxSpeed){
            this.speed += 5;
        }
    }


            public void decelerateSpeed(){
         if(this.speed >= 5){
             this.speed -= 5;
         }else if(this.speed < 5){
             this.speed = 0;
             System.out.println("You are not moving speed is 0MPH.");
            }
         }

         
        
        public boolean convertToElectric(){
            if(this.isElectric)
            {
                System.out.println("This vehicle is electrically powered.");
                return true;
            }
            else{
                this.isElectric = true;
                System.out.println("This vehicle is now electrically powered.");
                return false;
            }}

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

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}

