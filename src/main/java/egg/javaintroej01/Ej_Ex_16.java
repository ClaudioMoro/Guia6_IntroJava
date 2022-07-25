/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
 * las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 * 
 * @author
 */
public class Ej_Ex_16 {
    /**
     * @param args the command line arguments
     */
    
    public static void personas(String nom[], int ed[], int n){
        Scanner leer = new Scanner(System.in);
        
        for(int i = 0; i < n; i ++){
            System.out.println("Ingrese el nombre de la Persona " + (i + 1) + ":");
            nom[i] = leer.next();
            System.out.println("Ingrese la edad de la Persona " + (i + 1) + ":");
            ed[i] = leer.nextInt();
       }
        return;
    }
    
    public static void main(String[] args) {
        int i = 0;
        char opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("Número de personas a ingresar?");
        int num = leer.nextInt();
        String[] nombres = new String [num];
        int[] edades = new int [num];
        personas(nombres, edades, num);
        System.out.println("");
        do{
            System.out.print((i + 1) + "- " + nombres[i] + ", " + edades[i] + " años. ");
            if(edades[i] >= 18)
                System.out.println("Mayor de edad.");
            else
                System.out.println("Menor de edad.");
            i ++;
            if(i == num)
                break;
            do{
                System.out.println("Desea ver la siguiente persona (Si/No)?");
                opc = leer.next().toUpperCase().charAt(0);
            } while (opc != 'S' && opc != 'N');
        } while(i < num && opc != 'N');
    }
}
