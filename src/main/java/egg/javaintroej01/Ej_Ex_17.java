/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
 * primo, sino false.
 * Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
 * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 * 
 * @author
 */
public class Ej_Ex_17 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean esPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i ++){
            if(n % i == 0)
                primo = false;
        }
        if(n == 1)
            primo = false;
        return primo;
    }
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
        do{
            System.out.println("Ingrese un número entero positivo:");
            num = leer.nextInt();
        } while (num < 1);
        if(esPrimo(num))
            System.out.println("En número " + num + " es primo.");
        else
            System.out.println("En número " + num + " no es primo.");
    }
}
