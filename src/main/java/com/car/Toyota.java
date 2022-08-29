package com.car;

public class Toyota extends Car {
    boolean greatGasMileage;

    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }

    // Getters
    public boolean getGreatGasMileage() {
        return greatGasMileage;
    }

    //Setters
    public void setGreatGasMileage (boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }

}
