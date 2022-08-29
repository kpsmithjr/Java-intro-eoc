package com.car;

public class Toyota extends Car{
    private boolean greatGasMileage;
    Toyota(String color, int year, int maxSpead,boolean greatGasMileage) {
        super(color, year, maxSpead);
        this.greatGasMileage = greatGasMileage;
    }
    public boolean getGreatMileage(){
        return this.greatGasMileage;
    }

    
}
