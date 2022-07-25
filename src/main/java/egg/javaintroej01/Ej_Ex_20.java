/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
 * parámetro. Después haremos otra función o procedimiento que imprima el vector.
 * 
 * @author
 */
public class Ej_Ex_20 {

    /**
     * @param args the command line arguments
     */
    
    public static void llenar(int[] v, int n) {
        int i, aux;
        System.out.println("Generando vector...");
        for(i = 0; i < n; i ++){
            aux = (int) (Math.random() * 10);
            v[i] = aux;
        }
    }
    
    public static void mostrar(int[] v, int n) {
        int i;
        System.out.println("Mostrando vector...");
        for(i = 0; i < n; i ++)
            System.out.print("[" + v[i] + "] ");
    }
    
    public static void main(String[] args) {
        int i, num = 0;

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector:");
        num = leer.nextInt();
        int[] vec = new int[num];
        llenar(vec, num);
        mostrar(vec, num);
    }
}
