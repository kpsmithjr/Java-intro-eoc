package com.car;

public class Toyota extends Car {

    private boolean greatGasMileage;

    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage) {
       
        super(color, year, maxSpeed);
        
    }
    
    //Getter

    public boolean getGreatGasMileage() {
        return greatGasMileage;
    }

    //Setter

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }





}
