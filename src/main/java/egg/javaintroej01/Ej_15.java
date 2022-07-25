/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
 * muestre por pantalla en orden descendente.
 * 
 * @author
 */
public class Ej_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vec = new int[100];
        for(int i = 0; i < 100; i ++)
            vec[i] = i;
        for(int i = 99; i > -1; i --)
            System.out.println("Vector[" + i + "] = " + vec[i]);
    }
}
