package org.msc.vehicle;

public class Moto extends Vehicle{

    public Moto(String brand) {
        super(brand);
        this.ruedas =2;
    }

    @Override
    public void acelerar() {
        this.velocity = 30;
    }

    /*@Override
    public void frenar() {
        this.velocity = 10;
    }*/

    @Override
    public String toString() {
        return "La MOTO empieza la carrera a " + this.velocity + " Km/h";
    }
}
