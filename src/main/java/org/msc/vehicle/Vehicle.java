package org.msc.vehicle;

public abstract class Vehicle {
    private String brand;
    protected int velocity;
    protected int ruedas;

    public Vehicle(String brand) {
        this.brand = brand;
        this.velocity = 0;
    }

    public abstract void acelerar();

    /*public void frenar(){
        this.velocity -= 10;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }*/

}
