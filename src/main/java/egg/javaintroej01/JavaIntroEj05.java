/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

/**
 *
 * @author
 */

import java.util.Scanner;

public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un datro tipo Booleano:");
        boolean band = leer.nextBoolean();
        System.out.println("Ingrese un dato tipo Double:");
        double num = leer.nextDouble();
        System.out.println("Ingrese un dato tipo Char:");
        char letra = leer.next().charAt(0);
        System.out.println("El dato Booleano es: " + band);
        System.out.println("El dato Double es: " + num);
        System.out.println("El dato Char es: " + letra);

    }
}
