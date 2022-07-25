/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
 * dos. El programa deberá después mostrar el resultado de la suma
 * 
 * @author
 */
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese un número:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número:");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
    }
}
