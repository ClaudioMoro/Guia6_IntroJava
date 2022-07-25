/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * 
 * @author
 */
public class Ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es " + num * 2);
        System.out.println("El triple de " + num + " es " + num * 3);
        System.out.println("El doble de " + num + " es " + Math.sqrt(num));
    }
}
