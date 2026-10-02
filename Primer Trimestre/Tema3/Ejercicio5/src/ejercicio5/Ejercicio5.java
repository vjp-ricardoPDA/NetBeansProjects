package ejercicio5;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de varuables
        Scanner entrada = new Scanner (System.in);
        int num1;
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();
        
        if (num1 == 0){ // Si el numero es 0 salta el error
            System.out.println("Cero no es ni par ni impar");
        } else if (num1 % 2 != 0){ // si el resto es distinto que 0 es impar (para negativos impares
            System.out.println("El numero introducido es impar");
        } else if(num1 % 2 == 0){ // si el resto es 0 es porque el numero es par
            System.out.println("El numero es par");
        }
        
        
        
        
    }
    
}
