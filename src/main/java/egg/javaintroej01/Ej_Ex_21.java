/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.javaintroej01;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
 * adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
 * desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
 * prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
 * programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
 * desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
 * igual al 7 de sus notas del curso.

 * @author
 */
public class Ej_Ex_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, sum_a = 0, sum_d = 0;
        double pp, sp, pi, si, nota;
        
        double[] alumnos = new double[10];
        Scanner leer = new Scanner (System.in);
        for(i = 0; i < 10; i ++){
            System.out.println("Ingrese notas del alumno " + (i + 1) + " (0 a 10).");
            System.out.println("Ingrese nota del primer práctico:");
            pp = leer.nextDouble();
            System.out.println("Ingrese nota del segundo práctico:");
            sp = leer.nextDouble();
            System.out.println("Ingrese nota del primer integrador:");
            pi = leer.nextDouble();
            System.out.println("Ingrese nota del segundo integrador:");
            si = leer.nextDouble();
            nota = pp * 0.10 + sp * 0.15 + pi * 0.25 + si * 0.50;
            alumnos[i] = nota;
        }
        
        for(i = 0; i < 10; i ++){
            System.out.print("Alumno " + (i + 1) + ", ");
            System.out.printf("%.2f", alumnos[i]);
            if(alumnos[i] >= 7){
                System.out.println(". Aprobado.");
                sum_a ++;
            }
            else{    
                System.out.println(". Desaprobado.");
                sum_d ++;
            }
        }
        System.out.println("Los alumnos aprobados son " + sum_a + ".");
        System.out.println("Los alumnos desaprobados son " + sum_d + ".");
    }
}
