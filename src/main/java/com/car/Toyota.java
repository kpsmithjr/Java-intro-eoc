package com.car;

public class Toyota extends Car{
    boolean greatGasMileage;

    Toyota(String color, int year, int maxSpeed, boolean isElectric,  boolean greatGasMileage){
        super(color, year, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;
    }

    public boolean getGasMileage(){
        return greatGasMileage;
    }

    public void setGasMileage(boolean greatGasMileage){
        this.greatGasMileage = greatGasMileage;
    }

    public static void main(String[] args){


    }
}