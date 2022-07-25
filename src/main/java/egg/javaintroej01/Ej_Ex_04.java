/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
 * equivalente en romano.
 * 
 * @author
 */
public class Ej_Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String rom = "";
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese un número entero entre 1 y 10:");
            num = leer.nextInt();
        } while (num < 1 || num > 10);
        switch (num){
            case 1:
                rom = "I";
                break;
            case 2:
                rom = "II";
                break;
            case 3:
                rom = "III";
                break;
            case 4:
                rom = "IV";
                break;
            case 5:
                rom = "V";
                break;
            case 6:
                rom = "VI";
                break;
            case 7:
                rom = "VII";
                break;
            case 8:
                rom = "VIII";
                break;
            case 9:
                rom = "IX";
                break;
            case 10:
                rom = "X";
                break;
        }
        System.out.print("El número " + num + " en romano es " + rom + ".");
    }
}
