/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
 * la función equals() en Java.
 * 
 * @author
 */
public class Ej_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        if (frase.equals("eureka"))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
    }
}