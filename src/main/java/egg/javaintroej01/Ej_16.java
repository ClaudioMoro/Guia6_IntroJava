/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
 * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
 * numero y si se encuentra repetido
 * 
 * @author
 */
public class Ej_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleat;
        int i, num;
        boolean aparece = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector:");
        int dim = leer.nextInt();
        int[] vector = new int[dim];
        
        for(i = 0; i < dim; i ++){
            aleat = 10 * random();
            int aleat_int = (int) floor(aleat);
            vector[i] = aleat_int;
        }
        System.out.println("Vector:");
        for(i = 0; i < dim; i ++)
            System.out.print("[" + vector[i] + "] ");
        System.out.println("");
        System.out.println("Ingrese valor a buscar:");
        num = leer.nextInt();
        for(i = 0; i < dim; i ++)
            if(vector[i] == num){
                System.out.println("El valor " + num + " aparece en la posición " + i + ".");
                aparece = true;
            }
        if(!aparece)
            System.out.println("El valor " + num + " no está en el vector.");
    }
}
