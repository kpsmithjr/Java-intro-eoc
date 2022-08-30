package com.car;

public class Toyota extends Car {
    private boolean greatGasMileage;
    // In your Toyota class, create a constructor which takes in the parameters from the parent class and boolean greatGasMileage
    public Toyota (String color, int year, int maxSpeed, boolean greatGasMileage){
        super("white",2022,500);
        this.greatGasMileage = true; 
    }
}//closing tag for Toyota
