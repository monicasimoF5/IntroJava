package org.msc.vehicle;

public class Camion extends Vehicle{

    public Camion (String brand) {
        super(brand);
        this.ruedas =6;
    }

    @Override
    public void acelerar() {
        this.velocity = 10;
    }

    @Override
    public String toString() {
        return "El CAMIÓN empieza la carrera a " + this.velocity + " Km/h";
    }
}
