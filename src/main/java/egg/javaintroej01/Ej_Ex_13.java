/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de números 
 * comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
 * usuario al comenzar. Ejemplo: si se ingresa el número 3: 
 * 1
 * 12
 * 123

 * @author
 */
public class Ej_Ex_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura, i, fila;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese la altura de la escalera (1 a 9):");
            altura = leer.nextInt();
        } while(altura < 1 || altura > 9);
        for(fila = 1; fila <= altura; fila ++){
            for(i = 1; i <= fila; i ++)
                System.out.print(i);
            System.out.println("");
        }
    }
}
