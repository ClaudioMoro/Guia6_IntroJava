/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 * 
 * @author
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma = 0, limite;
        Scanner leer = new Scanner(System.in);
        
        do {
        System.out.println("Ingrese el límite (positivo) de la suma:");
        limite = leer.nextInt();
        }
        while(limite <= 0);
            
        while(suma <= limite) {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma += num;
          //  System.out.println("Suma parcial igual a " + suma);
        }
        System.out.println("La suma total es igual a " + suma);
    }
    
}
