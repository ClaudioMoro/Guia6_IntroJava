/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
 * matemática y deben devolver sus resultados para imprimirlos en el main.
 * 
 * @author
 */
public class Ej_Ex_15 {

    public static double sumar(double n1, double n2){
        double sum = n1 + n2;
        return sum;
    }
    
    public static double restar(double n1, double n2){
        double res = n1 - n2;
        return res;
    }
    
    public static double multiplicar(double n1, double n2){
        double mul = n1 * n2;
        return mul;
    }
    
    public static double dividir(double n1, double n2){
        double div = n1 / n2;
        return div;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        String opc;
        char op;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num1 = leer.nextDouble();
        System.out.println("Ingrese otro número:");
        num2 = leer.nextDouble();
        
        do{
            System.out.println("");
            System.out.println("* * * MENU * * *");
            System.out.println("S) Sumar");
            System.out.println("R) Restar");
            System.out.println("M) Multiplicar");
            System.out.println("D) Dividir");
            System.out.println("X) SALIR");
            System.out.println("");
            do{
                System.out.println("Ingrese una opción:");
                opc = leer.next();
                opc.toUpperCase();
                op = opc.toUpperCase().charAt(0);
            } while (op != 'S' && op != 'R' && op != 'M' && op != 'D' && op != 'X');
            switch (op){
                case 'S':
                    System.out.println("La suma es " + sumar(num1, num2));
                    break;
                case 'R':
                    System.out.println("La resta es " + restar(num1, num2));
                    break;
                case 'M':
                    System.out.println("El producto es " + multiplicar(num1, num2));
                    break;
                case 'D':
                    System.out.println("El cociente es " + dividir(num1, num2));
                    break;
            }
        } while (op != 'X');
    }
}
