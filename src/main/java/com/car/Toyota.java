package com.car;

public class Toyota extends Car{
    private boolean greatGasMileage;

    Toyota (boolean greatGasMileage) {
        greatGasMileage = true;
        super();
    }
    
    public boolean getGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean gm) {
        this.greatGasMileage = gm;
    }
}
