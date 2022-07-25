/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
 * N, con los valores ingresados por el usuario.
 * 
 * @author
 */
public class Ej_Ex_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, num, suma = 0;

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector:");
        num = leer.nextInt();
        int[] vec = new int[num];
        for(i = 0; i < num; i ++){
            System.out.println("Ingrese elemento " + i + " del vector:");
            vec[i] = leer.nextInt();
            suma += vec[i];
        }
        System.out.println("La suma de los elementos del vector es " + suma + ".");
    }
}
