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
public class manos_obra_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();
        EsMultiplo (num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0)
            System.out.println(num1 + " es múltiplo de " + num2 + ".");
        else
            System.out.println(num1 + " no es múltiplo de " + num2 + ".");
        }
}
