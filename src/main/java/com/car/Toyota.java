package com.car;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota (String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }

    //getter
    public boolean getGreatGasMileage(){
        return greatGasMileage;
    }

    // setter
    public boolean greatGasMileage(boolean gasMileage){
        return greatGasMileage = gasMileage;
    }
}
