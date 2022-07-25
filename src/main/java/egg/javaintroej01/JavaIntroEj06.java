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

public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        if ((num1 > 25)||(num2 > 25)) {
            if (num1 > 25 && num2 > 25)
                System.out.println("Ambos números son mayores a 25.");
            
            
            else
                System.out.println("Algún número es mayor a 25.");
        }
        else
                System.out.println("Ningún número es mayor a 25.");
    }
    
}
