/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 *
 * @author
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el primer número entre 1 y 20:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entre 1 y 20:");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número entre 1 y 20:");
        int num3 = leer.nextInt();
        System.out.println("Ingrese el cuarto número entre 1 y 20:");
        int num4 = leer.nextInt();
        System.out.println("");    
        
        System.out.print(num1 + " ");
        for  (int j = 1; j <= num1; j ++)
            System.out.print("*");
        System.out.println("");

        System.out.print(num2 + " ");
        for  (int j = 1; j <= num2; j ++)
            System.out.print("*");
        System.out.println("");

        System.out.print(num3 + " ");
        for  (int j = 1; j <= num3; j ++)
            System.out.print("*");
        System.out.println("");

        System.out.print(num4 + " ");
        for  (int j = 1; j <= num4; j ++)
            System.out.print("*");
        System.out.println("");
    }
}
