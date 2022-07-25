/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 * @author
 */
public class Ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
