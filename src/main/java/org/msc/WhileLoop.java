package org.msc;

public class WhileLoop {
    public static void main(String[] args) {
        //Imprimir del 5 al 10 sólo los números impares
        int contador = 5;
        while(contador < 10){
            if (contador % 2 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
