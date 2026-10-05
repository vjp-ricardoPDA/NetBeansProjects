package ejercicio17;
/**
 * @author alumno
 */

import static java.lang.Math.sqrt; // importamos la raiz cuadrada
import java.util.Scanner;
public class Ejercicio17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Ejercicio 17.- Crea un programa que calcule la raíz cuadrada del número que introduzca el usuario. (Utiliza el
        método Math.sqrt() )
        • Si el usuario introduce un número negativo, debemos mostrarle un mensaje de error y volver a pedírselo (tantas
        veces como sea necesario).
        • Pista: Como sabes que al menos se ejecutará el bucle una vez, deberás utilizar un bucle do…while.
        */
        
        float numero = 0; // declaramos la variable del usuario
        
        while (numero < 1){ // mientras el numero sea menor que 1 (0 o negativo) 
            Scanner entrada = new Scanner (System.in);
            System.out.println("Introduzca un numero para calcular su raiz cuadrada: "); //solicitamos el numero al usuario

            numero = entrada.nextInt(); // lo guardamos en su variable

            if (numero > 0){ // segunda verificacion
                System.out.print("La raiz cuadrada de " + numero + " es: " ); // antes de modificar nada sacamos el numero del usuario
                numero = (float)sqrt(numero); // modificamos la variables a su raiz cuadrada
                System.out.println(numero); // sacamos la raiz cuadrada del numero
            }
        
        
        }
        
        
        
        
        
        
    }
    
}
