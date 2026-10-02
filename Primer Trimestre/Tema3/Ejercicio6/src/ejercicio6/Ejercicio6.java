package ejercicio6;
/**
 *@author alumno
 */

import java.util.Scanner;
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables y entrada
        Scanner entrada = new Scanner (System.in);
        float nota;
        //solicitamos la nota del modulo
        System.out.println("Introduzaca la nota de la asignatura");
        nota = entrada.nextFloat();
        
        if (nota >= 0 && nota < 5){
            System.out.println("Su examen calificado con un " + nota + " es un Suspenso");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Su examen calificado con un " + nota + " es un Bien");
        } else if (nota >= 7 && nota < 9){
            System.out.println("Su examen calificado con un " + nota + " es un Notable");
        } else if (nota >= 9 && nota <= 10){
            System.out.println("Su examen calificado con un " + nota + " es un Bien");
        } else {
            System.out.println("Excepcion no controlada por la aplicacion");
        }
        
        
        
        
        
        
        
        
    }
    
}
