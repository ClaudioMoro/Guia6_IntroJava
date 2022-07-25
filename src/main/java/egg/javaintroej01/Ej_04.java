/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * 
 * @author
 */
public class Ej_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gradosC = 38;
        System.out.println("El equivalente a " + gradosC + " grados centígrados en Fahrenheit es " + (32+(9*gradosC/5)));
    }
}
