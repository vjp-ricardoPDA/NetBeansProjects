package ejercicio24;
/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio24 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float nota, media;
                
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Intoduzca la nota de Programacion: ");
        nota = entrada.nextFloat();
        
        System.out.println("Intoduzca la nota de Lenguaje de Marcas: ");
        nota += entrada.nextFloat();
        
        System.out.println("Intoduzca la nota de Base de Datos: ");
        nota += entrada.nextFloat();
        
        System.out.println("Intoduzca la nota de Entornos de Desarrollo: ");
        nota += entrada.nextFloat();
        
        System.out.println("Intoduzca la nota de Sistemas Informaticos: ");
        nota += entrada.nextFloat();
        
        System.out.println("Intoduzca la nota de Formacion y Orientacion Laboral: ");
        nota += entrada.nextFloat();
        
        media = nota / 6;
        
        System.out.println("La media de las 6 asignaturas es: " + media);
        
        
    }
    
}
