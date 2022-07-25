/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
 * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
* 
 * @author
 */
public class Ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 caracteres de largo:");
        String frase = leer.next();
        if (frase.length() == 8)
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
    }
}
