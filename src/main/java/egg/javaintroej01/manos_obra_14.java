/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;
/**
 *
 * @author
 */
public class manos_obra_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros:");
        int num_comp = leer.nextInt();
        
        String[] Equipo = new String [num_comp];
        for (int i = 0; i < num_comp; i ++) {
            System.out.println("Ingrese nombre del compañero " + (i + 1) + ":");
            Equipo[i] = leer.next();
        }
        System.out.println("");
        System.out.println("Listado de compañeros");
        for (int i = 0; i < num_comp; i ++)
            System.out.println("Compañero " + (i + 1) + ":" + Equipo[i]);
    }
}
