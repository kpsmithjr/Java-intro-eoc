package com.car;

    public class Toyota extends Car{
    boolean greatGasMileage;
    
    public Toyota(int year, String color, int maxSpeed,  boolean greatGasMileage){
    super( year, color, maxSpeed, maxSpeed, greatGasMileage);
    this.greatGasMileage = greatGasMileage;
    } 
}


