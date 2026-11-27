package ejercicio05t5;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio05T5 {
    
   /*
    Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6 asignaturas del
    Ciclo de DAM y te calcule la nota media del curso.
    • o Nota 1: Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y la nota.
    • o Nota 2: Crea un constructor con el que puedas asignar directamente el nombre de la asignatura al crear el
    objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método al que se le
    pase la nota como argumento.
    • o Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media (return)
    • o Ejemplo de ejecución:
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Asignatura asg1 = new Asignatura("Programacion");
        Asignatura asg2 = new Asignatura("Lenguaje de Marcas");
        Asignatura asg3 = new Asignatura("Base de Datos");
        Asignatura asg4 = new Asignatura("Entornos de Desarrollo");
        Asignatura asg5 = new Asignatura("Sistemas informaticos");
        Asignatura asg6 = new Asignatura("FOL");
        
        System.out.println("Introduzaca las notas de las siguientes asignaturas");
        System.out.println(asg1.getNombre() + ": ");
        asg1.setNota(entrada.nextFloat());
        
        System.out.println(asg2.getNombre() + ": ");
        asg2.setNota(entrada.nextFloat());
        
        System.out.println(asg3.getNombre() + ": ");
        asg3.setNota(entrada.nextFloat());
        
        System.out.println(asg4.getNombre() + ": ");
        asg4.setNota(entrada.nextFloat());
        
        System.out.println(asg5.getNombre() + ": ");
        asg5.setNota(entrada.nextFloat());
        
        System.out.println(asg6.getNombre() + ": ");
        asg6.setNota(entrada.nextFloat());
        
        
        /*
        System.out.println(
        asg1.toString() +
        asg2.toString() +
        asg3.toString() +
        asg4.toString() +
        asg5.toString() +
        asg6.toString() 
        );
        */
        System.out.println("La nota media del ciclo es: " + Asignatura.calcularMedia(asg1.getNota(), asg2.getNota(), asg3.getNota(), asg4.getNota(), asg5.getNota(), asg6.getNota()));
        
    }
    
    
    
    
    
}
