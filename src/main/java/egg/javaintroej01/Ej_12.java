/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
 * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
 * X y el último tiene que ser una O. 
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
 * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
 * de FDE, que no respete el formato se considera incorrecta. 
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
 * incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
 * siguientes funciones de Java Substring(), Length(), equals().
 * 
 * @author
 */
public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad;
        int largo, suma_correctas = 0, suma_incorrectas = 0;
        Scanner leer = new Scanner(System.in);
                
        do {
            System.out.println("Ingrese cadena (inicio=X, fin=O, longitud <= 5):");
            cad = leer.next();
            largo = cad.length();
//            System.out.println(cad.substring(0, 1)+cad.substring(largo-1, largo)+largo);
            if(cad.substring(0, 1).equals("X") && cad.substring(largo-1, largo).equals("O") && largo<=5)
//            if((cad.substring(0, 1)=="X") && (cad.substring(largo-1, largo)=="O") && (largo<=5))
//            if((cad.charAt(0)=='X') && (cad.charAt(largo-1)=='O') && (largo<=5))
                suma_correctas ++;
            else
                suma_incorrectas ++;
        } while (!cad.equals("&&&&&"));
        suma_incorrectas --;    //resto 1 porque "&&&&&" se sumó como incorrecta.
        System.out.println("La cantidad de cadenas correctas es " + suma_correctas + ".");
        System.out.println("La cantidad de cadenas incorrectas es " + suma_incorrectas + ".");
    }
}
