package ejercicio15;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Escribe un programa en JAVA que, utilizando bucles, imprima la tabla de multiplicar de un número que elija el usuario.
            • Ejemplo:
            Introduzca un numero para calcular su tabla de multiplicar: 8
            8 x 0 = 0
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24 ...
        */
        Scanner entrada = new Scanner (System.in); // declaramos el scanner
        int  tabla, i;  // declaramos la variable tabla que sera el numero del que el usuario quiere la tabla
                        // la variable "i" sera usada para saber el numero x el que multiplicar la variable "tabla" ademas de controlar cuando acaba el bucle
        
        System.out.println("Introduza el numero del que quiere la tabla"); // solicitamos la tabla que quiere el usuario
        tabla = entrada.nextInt(); // a guardamos en su variable
        
        System.out.println("La tabla del " + tabla + " es: ");
        for (i = 1; i <= 10; i ++){ // empezndo por el 1 y hasta el 10 incrementando en cada vuelta la variable " i " en uno
            System.out.println( tabla + " X " + i + " = " + tabla * i); 
            // Mostraremos por pantalla el numero de la tabla a mostrar y el numero por el que sera multiplicado asi como el resultado de la operacion
        }
        
        
        
        
    }
    
}
