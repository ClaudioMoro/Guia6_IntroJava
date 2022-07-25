/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
 * de n números (n>0). El valor de n se solicitará al principio del programa y los números 
 * serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
 * bucle “while” y otra con el bucle “do - while”.
 * 
 * @author
 */
public class Ej_Ex_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, valor, max = 0, min = 0, suma = 0;
        double prom;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("* * * VERSION CON WHILE * * *");
        System.out.println("Ingrese un número entero mayor que cero:");
        num = leer.nextInt();
        i = 1;
        
        while(i <= num){
            System.out.println("Ingrese valor " + i + ":");
            valor = leer.nextInt();
            if(i == 1){
                min = valor;
                max = valor;
            }
            if(valor < min)
                min = valor;
            if(valor > max)
                max = valor;
            suma += valor;
            i ++;
        }
        
        prom = (double)suma / (double)num;
        System.out.println("El máximo valor introducido es " + max + ".");
        System.out.println("El mínimo valor introducido es " + min + ".");
        System.out.printf("El promedio de los valores introducidos es %.4f", prom); 
        System.out.println(".");
        
//---------------------------------------------------------------
        
        System.out.println("");
        System.out.println("* * * VERSION CON DO-WHILE * * *");
        max = 0;
        min =0;
        suma = 0;
        System.out.println("Ingrese un número entero mayor que cero:");
        num = leer.nextInt();
        i = 1;

       do{
            System.out.println("Ingrese valor " + i + ":");
            valor = leer.nextInt();
            if(i == 1){
                min = valor;
                max = valor;
            }
            if(valor < min)
                min = valor;
            if(valor > max)
                max = valor;
            suma += valor;
            i ++;
        } while(i <= num);
       
        prom = (double)suma / (double)num;
        System.out.println("El máximo valor introducido es " + max + ".");
        System.out.println("El mínimo valor introducido es " + min + ".");
        System.out.printf("El promedio de los valores introducidos es %.4f", prom); 
        System.out.println(".");
    }
}
