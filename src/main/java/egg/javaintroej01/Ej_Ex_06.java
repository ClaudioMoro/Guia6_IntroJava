/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
 * debajo de 1.60 mts. y el promedio de estaturas en general.
 * 
 * @author
 */
public class Ej_Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double alt, suma_16 = 0, suma = 0, prom_16 = 0, prom;
        int i, num, num_16 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        num = leer.nextInt();
        for(i = 1; i <= num; i ++){
            System.out.println("Ingrese la altura de la persona " + i + ":");
            alt = leer.nextDouble();
            if(alt < 1.6){
                suma_16 += alt;
                num_16 ++;
            }
            suma += alt;
        }
        if(num_16 > 0)
            prom_16 = suma_16 / num_16;
        prom = suma / num;
        if(num_16 == 0)
            System.out.println("No hay personas más bajas de 1,60 metros.");
        else{
            System.out.printf("El promedio de altura de personas menores a 1,60 es de %.2f", prom_16);
            System.out.println(" m.");
        }
        System.out.printf("El promedio general de altura de las personas es de %.2f", prom);
        System.out.println(" m.");
    }
}
