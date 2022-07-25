/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
 * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
 * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
 * la matriz M en la cual empieza el primer elemento de la submatriz P.
 * 
 * @author
 */
public class Ej_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, c, f3, c3, f_cont = -1, c_cont = -1, aux = 0;
        boolean contenida = false;
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[][] matriz3 = new int[3][3];
        
        for(f = 0; f <10; f ++)
            for(c = 0; c <10; c ++)
                matriz[f][c] = (int) (floor(random()*100));
        System.out.println("Matriz original:");
        for(f = 0; f < 10; f ++){
            for(c = 0; c < 10; c ++){
                System.out.print("[");
                if(matriz[f][c] < 10)
                    System.out.print(" ");
                System.out.print(matriz[f][c] + "]");
            }
            System.out.println("");
        }
        
        
        System.out.println("Ingrese los elementos de la matriz 3x3 (0 a 99):");
        for(f = 0; f < 3; f ++)
            for(c = 0; c < 3; c ++){
                do{
                    System.out.println("Elemento " + f +  "," + c + ":");
                    aux = leer.nextInt();
                } while (aux < 0 || aux > 99);
                matriz3[f][c] = aux;
            }
        
        //Verifica si está contenida
        aux = matriz3[0][0];
        for(f = 0; f < 8; f ++)
            for(c = 0; c < 8; c ++){
                contenida = true;
                if(matriz[f][c] == aux && f_cont == -1){
                    for(f3 = 0; f3 < 3; f3 ++)
                        for(c3 = 0; c3 < 3; c3 ++)
                            if(matriz3[f3][c3] != matriz[f + f3][c + c3])
                                contenida = false;
                    if(contenida){
                        f_cont = f;
                        c_cont = c;
                    }
                }
            }
        
        //Muestra matriz 10x10
        for(f = 0; f < 10; f ++){
            for(c = 0; c < 10; c ++){
                System.out.print("[");
                if(matriz[f][c] < 10)
                    System.out.print(" ");
                System.out.print(matriz[f][c] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        //Muestra matriz 3x3
        for(f = 0; f <3; f ++){
            for(c = 0; c <3; c ++){
                System.out.print("[");
                if(matriz3[f][c] < 10)
                    System.out.print(" ");
                System.out.print(matriz3[f][c] + "]");
            }
            System.out.println("");
        }

        if(f_cont != -1)          //(contenida)
            System.out.println("La matriz 3x3 está contenida desde la fila " + f_cont + ", columna " + c_cont + ".");
        else
            System.out.println("La matriz 3x3 no está contenida en la matriz 10x10.");
    }
}
