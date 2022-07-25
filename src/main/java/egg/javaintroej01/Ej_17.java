/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 * @author
 */
public class Ej_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        long suma_1=0, suma_2=0, suma_3=0, suma_4=0, suma_5=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector:");
        int dim = leer.nextInt();
        int[] vector = new int[dim];
        
        for(i = 0; i < dim; i ++){
            int num = (int) floor(100000 * random());
            vector[i] = num;
            if(num>=0 && num<10)
                suma_1 ++;
            if(num>=10 && num<100)
                suma_2 ++;
            if(num>=100 && num<1000)
                suma_3 ++;
            if(num>=1000 && num<10000)
                suma_4 ++;
            if(num>=10000)
                suma_5 ++;
        }
        System.out.println("Vector:");
        for(i = 0; i < dim; i ++)
            System.out.print("[" + vector[i] + "] ");
        System.out.println("");
        System.out.println("Hay " + suma_1 + " números de un dígito.");
        System.out.println("Hay " + suma_2 + " números de dos dígitos.");
        System.out.println("Hay " + suma_3 + " números de tres dígitos.");
        System.out.println("Hay " + suma_4 + " números de cuatro dígitos.");
        System.out.println("Hay " + suma_5 + " números de cinco dígitos.");
    }
}
