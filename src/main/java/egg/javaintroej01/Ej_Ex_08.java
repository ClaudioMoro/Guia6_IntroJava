/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
 * detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
 * la cantidad de números impares. Al igual que en el ejercicio anterior los números 
 * negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 * @author
 */
public class Ej_Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cant = 0, cant_p = 0, cant_i = 0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un número entero:");
            num = leer.nextInt();
            if(num % 5 == 0)
                break;
            if(num > 0){
                cant ++;
                if(num % 2 == 0)
                    cant_p ++;
                else
                    cant_i ++;
            }
        }while (1 == 1);
        System.out.println("Se ingresaron " + cant + " números en total.");
        System.out.println("Se ingresaron " + cant_p + " números pares y " + cant_i + " números impares.");
    }
}
