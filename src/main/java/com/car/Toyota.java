package com.car;

public class Toyota
    extends Car
{

    private boolean greatGasMileage;

    protected Toyota(String color, int year, int speed, int maxSpeed, boolean isElectric )
    {
        super( color, year, speed, maxSpeed, isElectric);
    }

    public int getGreatGasMileage()
    {
        return greatGasMileage;
    }

    public void setGreatGasMileage( boolean greatGasMileage )
    {
        this.greatGasMileage = greatGasMileage;
    }
}