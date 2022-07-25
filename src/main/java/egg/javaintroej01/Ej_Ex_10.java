/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
 * dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
 * si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
 * al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
 * utilizar la función Math.random() de Java.
 * 
 * @author
 */
public class Ej_Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, num;
        Scanner leer = new Scanner(System.in);
        n = (int) floor(random() * 11) * (int) floor(random() * 11);
        do{
            System.out.println("Adivine el producto de dos números aleatorios entre 0 y 10:" + " " + n);
            num = leer.nextInt();
            if(n != num)
                System.out.println("Incorrecto!");
        } while(n != num);
        System.out.println("Correcto!");
    }
}
