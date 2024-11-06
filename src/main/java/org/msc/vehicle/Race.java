package org.msc.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Vehicle> peloton = new ArrayList<>();

    public Race() {
        this.peloton.add(new Car("Coche"));
        this.peloton.add(new Moto("Moto"));
        this.peloton.add(new Camion("Camión"));
    }

    public void startRace(){
        for (Vehicle vehiculo : peloton){
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }

}
