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
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int nota = -1;
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese nota de 1 a 10:");
            nota = leer.nextInt();
        }
    }
    
}
