package ejercicio21;
/**
 * @author alumno
 */

import java.util.Scanner;


public class Ejercicio21 {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
                
        int segundos, minutos, horas;
        
        System.out.println("Intoduzca el numero de segundos a traducir: ");
        segundos = entrada.nextInt();
        
        horas = segundos / 3600;
        segundos = segundos % 3600;
        
        minutos = segundos / 60;
        segundos = segundos % 60;
        
        System.out.println("El ressultado son: " + horas + ":" + minutos + ":" + segundos);
        
        
        
        
    }
    
}
