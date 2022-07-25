/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
 * (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 * 
 * @author
 */
public class Ej_14 {

    /**
     * @param args the command line arguments
     */

    public static void convertir(double euros, String moneda) {
        double cambio=0;
        switch (moneda){
            case "dolares":
                cambio = euros * 1.28611;
                break;
            case "yenes":
                cambio = euros * 129.852;
                break;
            case "libras":
                cambio = euros * 0.86;
                break;
        }
        System.out.println("El cambio será "+euros+" euros por "+cambio+" "+moneda+".");
    }


    public static void main(String[] args) {
        float euros, cambio;
        String tipo_moneda;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a cambiar:");
        euros = leer.nextFloat();
        System.out.println("Ingrese el tipo de moneda para el cambio:");
        System.out.println("(Dolares, Yenes o Libras)");
        tipo_moneda = leer.next();
        tipo_moneda = tipo_moneda.toLowerCase();
        convertir(euros, tipo_moneda);
    }
}
