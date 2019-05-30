/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Declaración de arreglos
        int[] n = new int[6];
        String[] rangos = {"0 y 8", "8.1 y 12", "12.1 y 16", "16.1 y 19",
        "19.1 y 20", "20.1 en adelante"};
        // Declaración de variables
        float nota;
        boolean bandera = true;
        String option;
        // Ciclo while para almacenamiento de datos
        while (bandera == true){
            System.out.println("Ingrese la nota del estudiante");
            nota = entrada.nextFloat();
            // Ciclo if anidado para evaluación de condiciones
            if(nota >= 0 && nota <= 8){
                n[0] = n[0] + 1;
            } else {
                if(nota >= 8.1 && nota <= 12){
                    n[1] = n[1] + 1;
                } else {
                    if(nota >= 12.1 && nota <= 16){
                        n[2] = n[2] + 1;
                    } else {
                        if(nota >= 16.1 && nota <= 20){
                            n[4] = n[4] +1;
                        } else {
                            if(nota >= 20.1){
                                n[5] = n[5] + 1;
                            }
                        }
                    }
                }
            }
            // Limpieza del buffer
            entrada.nextLine();
            // Mensaje para salir del ciclo repetitivo
            System.out.println("¿Desea ingresar más datos?\nSí\nNo");
            option = entrada.nextLine();
            // Condición para salir del ciclo repetitivo
            if(option.equals("No") || option.equals("no")){
                bandera = false;
            }
        }
        // Prsentación de resultados
        System.out.println("Reporte");
        // Ciclo for para recorrer el arrelo y presentar resultados
        for(int i = 0; i < n.length; i ++){
            System.out.printf("Notas en %s: %d\n", rangos[i], n[i]);
        }
    }
}
