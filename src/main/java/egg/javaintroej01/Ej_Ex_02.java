/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
 * una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
 * tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
 * iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * 
 * @author
 */
public class Ej_Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 2, B = 5, C =7, D =3, aux;
        System.out.println("A original = " + A);
        System.out.println("B original = " + B);
        System.out.println("C original = " + C);
        System.out.println("D original = " + D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("A modificada = " + A);
        System.out.println("B modificada = " + B);
        System.out.println("C modificada = " + C);
        System.out.println("D modificada = " + D);
    }
}
