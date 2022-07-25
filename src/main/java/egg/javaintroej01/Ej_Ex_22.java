/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
 * muestre la suma de sus elementos.
 * 
 * @author
 */
public class Ej_Ex_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas, columnas, f, c, aux, suma = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las filas de la matriz;");
        filas = leer.nextInt();
        System.out.println("Ingrese las columnas de la matriz;");
        columnas = leer.nextInt();
        int[][] matriz = new int [filas][columnas];
        for(f = 0; f < filas; f ++)
            for(c = 0; c < columnas; c ++){
                aux = (int)(Math.random() * 10);
                matriz[f][c] = aux;
            }
        for(f = 0; f < filas; f ++){
            for(c = 0; c < columnas; c ++){
                System.out.print("[" + matriz[f][c] + "]");
                suma += matriz[f][c];
            }
            System.out.println("");    
        }
        System.out.println("La suma de los elementos de la metriz es " + suma + ".");
    }
}
