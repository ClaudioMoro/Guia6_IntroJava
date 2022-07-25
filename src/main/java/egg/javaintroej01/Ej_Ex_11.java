/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que 
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
 * de división. Nota: recordar que las variables de tipo entero truncan los números o 
 * resultados.
 * 
 * @author
 */
public class Ej_Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, aux, cant = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        n = leer.nextInt();
        aux = n;
        while(aux > 0){
            aux = aux / 10;
            cant ++;
        }
        System.out.println("El número " + n + " tiene " + cant + " dígitos.");
    }
}
