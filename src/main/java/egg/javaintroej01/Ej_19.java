/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
 * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
 * signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * 
 * @author
 */
public class Ej_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, c;
        boolean antisim = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la matriz cuadrada:");
        int dim = leer.nextInt();
        int[][] matriz = new int[dim][dim];
        //int[][] matriz2 = new int[dim][dim];
        System.out.println("Ingrese los elementos de la matriz:");
        for(f = 0; f < dim; f ++)
            for(c = 0; c < dim; c ++){
                System.out.println("Elemento " + f +  "," + c + ":");
                matriz[f][c] = leer.nextInt();
            }
        
        //Muestra matriz
        for(f = 0; f <dim; f ++){
            for(c = 0; c <dim; c ++){
                System.out.print("[");
                if(matriz[f][c] >= 0)
                    System.out.print(" ");
                System.out.print(matriz[f][c] + "]");
            }
            System.out.println("");
        }
        
        //Comprueba si es antisimétrica
        for(f = 0; f <dim; f ++)
            for(c = 0; c <dim; c ++)
                if(matriz[f][c] != -matriz[c][f])
                    antisim = false;
        
        if(antisim)
            System.out.println("La matriz es antisimétrica.");
        else
            System.out.println("La matriz no es antisimétrica.");
    }
}
