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
        int[] n = new int[5];
        String[] rangos = {"0 y 8", "8.1 y 12", "12.1 y 16", "16.1 y 19",
        "19.1 y 20", "20.1 en adelante"};
        // Declaración de variablea
        float nota;
        boolean bandera = true;
        String option;
        // Ciclo while para almacenamiento de datos
        while (bandera == true){
        // Ingreso de datos
        System.out.println("Ingrese la nota del estudiante");
        nota = entrada.nextFloat();
        // Estructuras condicionales para evaluar la condición
        if(nota >= 0 && nota <= 8){
            n[0] = n[0] + 1;
        } else {
            if(nota >= 8.1 && nota <= 12){
                n[1] = n[1] + 1;
            } else {
                if(nota >= 12.1 && nota <= 16){
                    n[2] = n[2] + 1;
                } else {
                    if(nota >= 16.1 && nota <= 19){
                        n[3] = n[3] = 1;
                    } else {
                        if(nota >= 19.1 && nota >= 20){
                            n[4] = n[4] + 1;
                        } else {
                            if(nota > 20.1){
                                n[5] = n[1] + 1;
                            }
                        }
                    }
                }
            }
        }
        // Limpieza del buffer
        entrada.nextLine();
        // Mensaje para salir del ciclo repetitivo
        System.out.println("¿Desa ingresar más datos?\nSí\nNo");
        option = entrada.nextLine();
        // Condición para salir del ciclo repetitivo
        if(option.equals("No") || option.equals("no")){
            bandera = false;
        }
    }
    // Presentación de resultados
    System.out.println("Resultados");
    // Recorrido del arreglo para presentar resultados
        for(int i = 0; i < n.length; i++){
            System.out.printf("Notas en %s: %d\n", rangos[i], n[i]);
        }
    }
}
