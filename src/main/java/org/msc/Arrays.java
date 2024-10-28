package org.msc;

public class Arrays {
    public static void main(String[] args) {
        // Definir un array de 5 números (lleno)

        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Definir un array de 5 nombres de ciudades (lleno)

        String[] nombresDeCiudad = {"Valencia","Mahón","Alicante","Castellón","Barcelona"};
        for (String ciudad : nombresDeCiudad) {
            System.out.println(ciudad);
        }
    }
}
