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

public class manos_obra_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        String codificada = codificar(frase);
        System.out.println(codificada);
        
    }

    public static String codificar(String frase) {
        int len = frase.length();
        String f = "";
        for(int i = 0; i < len; i ++) {
            char letra = frase.charAt(i);
            switch (letra){
                case 'a', 'A':
                    letra = '@';
                    break;
                case 'e', 'E':
                    letra = '#';
                    break;
                case 'i', 'I':
                    letra = '$';
                    break;
                case 'o', 'O':
                    letra = '%';
                    break;
                case 'u', 'U':
                    letra = '*';
                    break;
            }
            
        //    System.out.print(letra);      Para probar.
            //f = f.concat("k");                //(frase.charAt(i));
            f = f + letra; //frase.charAt(i);
        }
        return f;
    }
}
