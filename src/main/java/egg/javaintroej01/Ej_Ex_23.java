/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
 * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
 * por pantalla la sopa de letras creada. 
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
 * de Java substring(), Length() y Math.random().
 * 
 * @author
 */
public class Ej_Ex_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, c, fila, columna, i, pal_len, aux;
        char carac;
        String palabra;
        
        Scanner leer = new Scanner(System.in);
        char[][] matriz = new char[20][20];
        boolean[] vec = new boolean[20];
        
        for(f = 0; f < 20; f ++)
            for(c = 0; c < 20; c ++)
                matriz[f][c] = ' ';
        for(i = 0; i < 20; i ++)
            vec[i] = false;
        for(i = 0; i < 5; i ++){
            do{
                System.out.println("Ingrese palabra " + (i + 1) + ", de 3 a 5 caracteres.");
                palabra = leer.next();
                pal_len = palabra.length();
            } while (pal_len < 3 || pal_len > 5);
            do{
                fila = (int) (Math.random() * 20);
            } while (vec[fila]);
            vec[fila] = true;
            columna = (int) (Math.random() * (20 - pal_len + 1));
            for(int j = 0; j < pal_len; j ++)
                matriz[fila][columna + j] = palabra.substring(j, j + 1).charAt(0);
        }
        
        for(f = 0; f < 20; f ++)
            for(c = 0; c < 20; c ++)
                if(matriz[f][c] == ' '){
                    aux = (int)(Math.random() * 10);
                    matriz[f][c] = Integer.toString(aux).charAt(0);
                }

        
        for(f = 0; f < 20; f ++){
            for(c = 0; c < 20; c ++)
                System.out.print(matriz[f][c] + " ");
//            System.out.print("[" + matriz[f][c] + "]");
            System.out.println("");
        }
    }
}
