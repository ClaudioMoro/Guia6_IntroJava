/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 * 
 * @author
 */
public class Ej_Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una vocal:");
        letra = leer.next();
        switch (letra.toUpperCase()){
            case "A", "E", "I", "O", "U":
                System.out.println("La letra '" + letra + "' es vocal.");
                break;
            default:
                System.out.println("La letra '" + letra + "' no es vocal.");
        }
    }
}
