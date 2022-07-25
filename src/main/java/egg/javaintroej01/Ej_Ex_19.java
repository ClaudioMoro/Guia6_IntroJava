/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
 * elementos).
 * 
 * @author
 */
public class Ej_Ex_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, num, suma = 0;
        boolean distintos = false;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de los vectores:");
        num = leer.nextInt();
        int[] vec1 = new int[num];
        int[] vec2 = new int[num];
        for(i = 0; i < num; i ++){
            System.out.println("Ingrese elemento " + i + " del vector 1:");
            vec1[i] = leer.nextInt();
        }
        for(i = 0; i < num; i ++){
            System.out.println("Ingrese elemento " + i + " del vector 2:");
            vec2[i] = leer.nextInt();
        }
        for(i = 0; i < num; i ++){
            System.out.print("Comparando elemento " + i + "... ");
            if(vec1[i] != vec2[i]){
                distintos = true;
                System.out.println("X");
                break;
            }
            else
                System.out.println("Ok");
        }
        if(distintos)
            System.out.println("Los vectores son diferentes en el elemento " + i + ".");
        else
            System.out.println("Los vectores son iguales.");
    }
}
