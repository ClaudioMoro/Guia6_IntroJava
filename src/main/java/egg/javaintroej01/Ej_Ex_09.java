/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. Dados dos números enteros mayores que 
 * uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
 * Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
 * resultado es el residuo, y el número de restas realizadas es el cociente. 
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37 una resta realizada 
 * 37 – 13 = 24 dos restas realizadas 
 * 24 – 13 = 11 tres restas realizadas 
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * 
 * @author
 */
public class Ej_Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, cant_r = 0, aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor que 1:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero mayor que 1:");
        num2 = leer.nextInt();
        aux = num1;
        
        while (aux >= num2){
            aux -= num2;
            cant_r ++;
        }
        System.out.println("El coeciente entre " + num1 + " y " + num2 + " es " + cant_r + " y el residuo es " + aux + ".") ;
    }
}
