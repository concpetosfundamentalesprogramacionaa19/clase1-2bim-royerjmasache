/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración del arreglo e inicialización de posiciones
        int[] c = new int[5];
        c[3] = 20;
        c[1+1] = 5 + 6;
        c[2] = 11;
        c[4] = 10;
        /*
        Valor incorrecto:
        c[5] = 100;
        */
        // Presentación de resultados
        System.out.printf("%d + %d = %d\n", c[1], c[4], c[1] + c[4]);
        // Presentación del tamaño del arreglo
        System.out.printf("El tamaño del arreglo es: %d\n", c.length);
    }
}












