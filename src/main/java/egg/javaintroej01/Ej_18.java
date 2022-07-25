/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
 * cambiando sus filas por columnas (o viceversa).
 * 
 * @author
 */
public class Ej_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriz_t = new int[4][4];
        int f, c;
        for(f = 0; f <4; f ++)
            for(c = 0; c <4; c ++)
                matriz[f][c] = (int) (floor(random()*19)-9);
        System.out.println("Matriz original:");
        for(f = 0; f <4; f ++){
            for(c = 0; c <4; c ++){
                System.out.print("[");
                if(matriz[f][c] >= 0)
                    System.out.print(" ");
                System.out.print(matriz[f][c] + "]");
            }
            System.out.println("");
        }
        for(f = 0; f <4; f ++)
            for(c = 0; c <4; c ++)
                matriz_t[c][f] = matriz[f][c];
        System.out.println("Matriz transpuesta:");
        for(f = 0; f <4; f ++){
            for(c = 0; c <4; c ++){
                System.out.print("[");
                if(matriz_t[f][c] >= 0)
                    System.out.print(" ");
                System.out.print(matriz_t[f][c] + "]");
            }
            System.out.println("");
        }
    }
}

