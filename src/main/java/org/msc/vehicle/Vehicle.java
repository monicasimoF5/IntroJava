package org.msc.vehicle;

public class Vehicle {
    private String brand;
    protected int velocity;
    protected int ruedas;

    public Vehicle(String brand) {
        this.brand = brand;
        this.velocity = 0;
    }

    public void acelerar(){
        this.velocity += 10;
    }

    public void frenar(){
        this.velocity -= 10;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }

}
