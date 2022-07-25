/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
 * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *  **** 
 *  *  *
 *  *  *
 *  ****
 * 
 * @author
 */
public class Ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fil, col;
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese número de elementos por lado:");
        int num = leer.nextInt();
        for(fil=0; fil<num; fil++){
            if(fil==0 || fil==num-1){
                for(col=0; col<num; col++)
                    System.out.print("*");
                System.out.println("");
            }
            else {
                System.out.print("*");
                for(col=0; col<num-2; col++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println("");
            }
        }
    }
}
