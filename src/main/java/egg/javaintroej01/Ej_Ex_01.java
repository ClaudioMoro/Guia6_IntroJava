/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * 
 * @author
 */
public class Ej_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo, dias, horas, minutos;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tiempo en minutos:");
        tiempo = leer.nextInt();
        dias = tiempo / (24 * 60);
        horas = (tiempo / 60) % 24;
        minutos = tiempo % 60;
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }
}
