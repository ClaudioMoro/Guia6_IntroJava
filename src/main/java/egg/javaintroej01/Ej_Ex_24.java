/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un programa que complete un vector con los N primeros números de la sucesión 
 * de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
 * números:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * 
 * @author
 */
public class Ej_Ex_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Cuántos números de la serie de Fibonacci quiere ver (1 a 46):");
            n = leer.nextInt();
        } while (n < 1 || n > 46);
        int[] vec = new int[n];
        for(i = 0; i < n; i ++)
            switch(i){
                case 0, 1:
                    vec[i] = 1;
                    break;
                default:
                    vec[i] = vec[i - 2] + vec[i - 1];
                    break;
            }
        for(i = 0; i < n; i ++)
            System.out.print("[" + vec[i] + "]");
    }
}
