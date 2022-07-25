/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 * 
 * @author
 */
public class Ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        if (num % 2 == 0)
            System.out.println("El número " + num + " es par.");
        else
            System.out.println("El número " + num + " es impar.");
    }
}
