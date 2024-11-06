package org.msc.vehicle;

public class Car extends Vehicle{


    public Car(String brand) {
        super(brand);
        this.ruedas = 4;
    }

    @Override
    public void acelerar() {
        this.velocity = 20;
    }

    /*@Override
    public void frenar() {
        this.velocity = 20;
    }*/

    @Override
    public String toString() {
        return "El COCHE empieza la carrera a " + this.velocity + " Km/h";
    }
}
