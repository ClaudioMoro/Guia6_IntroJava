/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
 * pantalla el siguiente menú:
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
 * y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
 * desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
 * programa, caso contrario se vuelve a mostrar el menú.
 * 
 * @author
 */
public class Ej_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opc = "";
        int num, suma = 0, limite, opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num1:");
        float num1 = leer.nextFloat();
        System.out.println("Ingrese num2:");
        float num2 = leer.nextFloat();
        
        do {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            do {
                System.out.println("Elija opcion (1-5)");
                opcion = leer.nextInt();
            } while ((opcion < 1) || (opcion > 5));
            
            switch (opcion) {
                case 1:
                    System.out.println("Suma igual a " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta igual a " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicación igual a " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("División igual a " + (num1 / num2));
                    break;
                case 5:
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        opc = leer.next();
                    } while (opc.charAt(0) != 'S' && opc.charAt(0) != 'N');
                    if (opc.charAt(0) == 'S')
                        break;
            }        
        } while (opcion != 5 || opc.charAt(0) == 'N');
    }
}
