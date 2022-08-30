package com.car;

public class Toyata extends Car {
    private boolean greatGasMileage;

    public Toyata(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }
    private boolean getGreatGasMileage(){
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean getGreatGasMileage){
        this.greatGasMileage = greatGasMileage;
    }
    
}
