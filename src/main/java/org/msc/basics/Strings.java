package org.msc.basics;

public class Strings {
    public static void main(String[] args) {

        String name = "Mònica";

        String surname = new String("Simó");

        String fullname = name+ " " + surname;

        // Imprimir por consola una comparación de dos streams con el método equals
        if (name.equals(name)){
            System.out.println("Name is Mònica");
        }

        System.out.println(fullname);

    }
}
