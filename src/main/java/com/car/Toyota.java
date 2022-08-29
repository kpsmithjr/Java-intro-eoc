package com.car;

public class Toyota extends Car {
    private Boolean greatGasMileage;

    Toyota(String color, int year, int maxSpeed, Boolean greatGasMileage){

        super( color,  year,  maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }
    
    public Boolean getGreatGasMileage(){
        return this.greatGasMileage;
    }
    public void setGreatGasMileage(Boolean greatGasMileage){

        this.greatGasMileage = greatGasMileage;
    }
}
