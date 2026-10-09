package ejercicio22;
/**
 * @author alumno
 */

import java.util.*;// importamos Scanner y InputMismatchException
public class Ejercicio22 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 22.- Crea un programa que calcule sume dos números que introduzca el usuario.
        • En caso de que el usuario introduzca una letra en vez de un número, debemos capturar la excepción y mostrarle un mensaje de error
        */
        
        Scanner entrada = new Scanner (System.in);
        int num1 = 0, num2 = 0, resultado = 0;// declaramos las variables y solicitamos los numeros al usuario
        
        
        try{
            System.out.println("Introduzca el numero 1:");
            num1 = entrada.nextInt();
            System.out.println("Introduzca el numero 2:");
            num2 = entrada.nextInt();
            resultado = num1 + num2;
        }catch (InputMismatchException e) {
            System.out.println("Ha introducido una letra en un campo numerico " + e.getMessage());
        }
        System.out.println("El resultado de sumar " + num1 + "+" + num2 + " = " + resultado);
        
        
        
        
        
        
    }
    
}
