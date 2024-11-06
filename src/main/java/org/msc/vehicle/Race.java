package org.msc.vehicle;

import java.util.List;

public class Race {

    List<Vehicle> peloton = List.of(new Car("Coche"), new Moto("Moto"),new Camion("Camión"));

    public void startRace(List<Vehicle> peloton){
        for (Vehicle vehiculo : peloton){
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }

}
