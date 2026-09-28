package ejercicio25;
/**
 *@author alumno
 */

import java.util.Scanner ;
public class Ejercicio25 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double num1, num2, num3, suma, producto;
        
        System.out.println("Introduzaca el siguiente numero: ");
        num1 = entrada.nextDouble();
        
        System.out.println("Introduzca el segundo numero: ");
        num2 =entrada.nextDouble();
        
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextDouble();
        
        suma = num1 + num2 + num3;
        producto = num1 * num2 * num3;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El producto de los numeros es: " + producto);
        
    }
    
}
