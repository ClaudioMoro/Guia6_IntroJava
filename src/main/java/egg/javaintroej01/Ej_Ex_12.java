/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import static java.lang.String.valueOf;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * 0-1-2
 * 0-1-E
 * Nota: investigar función equals() y como convertir números a String.
 * 
 * @author
 */
public class Ej_Ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, len = 3, i;
        String n_str, carac;
        for(n = 0; n < 1000; n ++){
            n_str = valueOf(n);
        //    len = n_str.length();
            if(n_str.length() == 1)
                n_str = "00".concat(n_str);
            if(n_str.length() == 2)
                n_str = "0".concat(n_str);
        //    len = 3;
            for(i = 0; i < len; i ++){
                carac = n_str.substring(i, i + 1);
                if(carac.equals("3"))
                    System.out.print("E");
                else
                    System.out.print(carac);
                if(i < len - 1)
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
}
