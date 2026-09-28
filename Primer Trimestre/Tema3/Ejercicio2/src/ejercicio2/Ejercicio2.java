package ejercicio2;
/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado = 0;
        String operacion = null;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzaca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduzaca el segundo numero: ");
        num2 = entrada.nextInt();
        
        if (num1 > 10){
            resultado = num1 * num2;
            operacion = "Multiplicacion";
        }else if (num1 <= 10){
            resultado = num1 + num2;
            operacion = "Suma";
        }
        System.out.println("La operacion que se ha realizado es " + operacion + " y el resultado es: " + resultado);
        
        
        
    }
    
}
