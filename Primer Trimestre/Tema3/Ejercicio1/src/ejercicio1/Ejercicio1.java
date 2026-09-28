package ejercicio1;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        
        if (num < 0){
            System.out.println("El numero introducido es negativo");

        } else if (num > 0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("Excepcion no controlada por la aplicacion o es un cero");
        }
        
        
        
        
    }
    
}
