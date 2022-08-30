package com.car;

public class Toyata extends Car {
    private boolean greatGasMileage;

    public Toyata(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }
    public boolean getGreatMilage(){
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage){
        this.greatGasMileage = greatGasMileage;
    }
    
}
