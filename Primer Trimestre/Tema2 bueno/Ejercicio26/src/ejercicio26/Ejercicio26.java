package ejercicio26;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio26 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cifra1, cifra2, cifra3, cifra4, numero;
        
        System.out.println("Introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt();
        
        cifra1 = numero / 1000;
        cifra2 = (numero % 1000) / 100;
        cifra3 = ((numero % 1000) % 100) / 10;
        cifra4 = ((numero % 1000) % 100) % 10;
        
        System.out.println("La primera cifra es: " + cifra1);
        System.out.println("La segunda cifra es: " + cifra2);
        System.out.println("La tercera cifra es: " + cifra3);
        System.out.println("La cuarta cifra es: " + cifra4);
        
        
        
    }
    
}
