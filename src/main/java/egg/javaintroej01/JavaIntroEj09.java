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
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int suma = 0;
        int cont = 1;
        
        do {
            System.out.println("Ingrese un número (" + cont + ") mayor o igual a 0:");
            int num = leer.nextInt();
            if (num > 0){
                suma += num;
                //suma = suma + num;
                //break;
            }
            else {
                if (num == 0) {
                    System.out.println("Se capturó el número 0.");
                    break;
                }
            }
            cont++;
            //cont = cont + 1;
            //break;
        }
        while (cont <= 20);
        System.out.println("La suma de los números mayores de 0 es " + suma);
    }
}
