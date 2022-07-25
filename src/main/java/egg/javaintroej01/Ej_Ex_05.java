/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: 
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
 * todos los tipos de tratamientos. 
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
 * los mismos tratamientos que los socios del tipo A. 
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
 * tratamientos. 
 * o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
 * real que represente el costo del tratamiento (previo al descuento) y determine el 
 * importe en efectivo a pagar por dicho socio.
 * 
 * @author
 */
public class Ej_Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        double costo;
        Scanner leer = new Scanner(System.in);
        System.out.println("A) Socio tipo A, 50% de descuento");
        System.out.println("B) Socio tipo B, 35% de descuento");
        System.out.println("C) Socio tipo C, sin descuento");
        do{
            System.out.println("Ingrese tipo de socio (A, B, C):");
            letra = leer.next().toUpperCase();
        } while (!letra.equals("A") && !letra.equals("B") && !letra.equals("C"));
        System.out.println("Ingrese costo del tratamiento:");    
        costo = leer.nextDouble();
        switch (letra){
            case "A":
                costo = costo - costo * 0.5;
                break;
            case "B":
                costo = costo - costo * 0.35;
                break;
        }
        System.out.println("El socio tipo " + letra + " deberá abonar $" + costo + ".");
    }
}
