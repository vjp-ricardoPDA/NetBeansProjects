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
        Scanner entrada = new Scanner (System.in);
        int num1;
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();
        
        if (num1 == 0){
            System.out.println("Cero no es ni par ni impar");
        } else if (num1 % 2 != 0){
            System.out.println("El numero introducido es impar");
        } else if(num1 % 2 == 0){
            System.out.println("El numero es par");
        }
        
        
        
        
    }
    
}
