package org.msc;

public class ForLoop {
    public static void main(String[] args) {
        //Imprimir por consola los numeros del 5 al 10

        //for(byte numero = 5; numero <= 10; numero++){
        //    System.out.println(numero);
        //}

        // Imprimir los números pares del 5 al 10
        for (byte numero = 5; numero <= 10; numero++){
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        }

    }
}
