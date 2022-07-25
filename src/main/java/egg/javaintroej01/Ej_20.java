/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
 * El programa deberá comprobar que los números introducidos son correctos, es decir, 
 * están entre el 1 y el 9.
 * 
 * @author
 */
public class Ej_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, c, num_magico, aux = 0;
        boolean es_magica = true;
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingrese los elementos de la matriz (1 a 9):");
        for(f = 0; f < 3; f ++)
            for(c = 0; c < 3; c ++){
                do{
                    System.out.println("Elemento " + f +  "," + c + ":");
                    aux = leer.nextInt();
                } while (aux < 1 || aux > 9);
                matriz[f][c] = aux;
            }
        //Muestra matriz
        for(f = 0; f <3; f ++){
            for(c = 0; c <3; c ++){
                System.out.print("[");
                if(matriz[f][c] >= 0)
                    System.out.print(" ");
                System.out.print(matriz[f][c] + "]");
            }
            System.out.println("");
        }
        
        //Comprueba si es mágica
        num_magico = matriz[0][0] + matriz[0][1] + matriz[0][2];
        aux = 0;
        //Compruebo filas;
        for(f = 1; f <3; f ++){
            for(c = 0; c <3; c ++)
                aux += matriz[f][c];
            if(aux != num_magico)
                es_magica = false;
            aux = 0;
        }
        aux = 0;
        //Compruebo columnas;
        for(c = 0; c <3; c ++){
            for(f = 0; f <3; f ++)
                aux += matriz[f][c];
                if(aux != num_magico)
                    es_magica = false;
                aux = 0;
            }
        aux = 0;
        //Compruebo diagonal principal
        for(f = 0; f <3; f ++)
            aux += matriz[f][f];
            if(aux != num_magico)
                es_magica = false;
        aux = 0;
        //Compruebo diagonal secundaria
        for(f = 0; f <3; f ++)
            aux += matriz[2-f][f];
            if(aux != num_magico)
                es_magica = false;
            
        if(es_magica)
            System.out.println("La matriz es mágica.");
        else
            System.out.println("La matriz no es mágica.");
    }
}
