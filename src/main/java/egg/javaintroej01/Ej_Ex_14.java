/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
 * hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
 * de hijos para averiguar la media de edad de los hijos de todas las familias.
 * 
 * @author
 */
public class Ej_Ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, h, edad, fam, hijos, tot_hijos = 0, i, suma = 0;
        double prom;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias:");
        fam = leer.nextInt();
        int[] familia = new int[fam];
        
        for(f = 0; f < fam; f ++){
            System.out.println("Ingrese la cantidad de hijos de la familia " + (f + 1) + ":");
            familia[f] = leer.nextInt();
            tot_hijos += familia[f];
        }
        for(f = 0; f < fam; f ++)
            for(h = 1; h <= familia[f]; h ++){
                System.out.println("Ingrese la edad del hijo " + h + " de la familia " + (f + 1) + ":");
                edad = leer.nextInt();
                suma += edad;
            }
        prom = (double) suma / (double) tot_hijos;
        System.out.printf("El promedio de edades de todos los hijos es %.2f",prom);
    }
}
