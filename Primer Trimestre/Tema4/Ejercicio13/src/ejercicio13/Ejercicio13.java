package ejercicio13;
/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio13 {
    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 13.- Realiza un algoritmo que imprima todos los números existentes entre el número 1 y otro introducido por el usuario.
    • Controla que el usuario te meta un número mayor que 1 y, sino, avísale del error y vuélveselo a pedir las veces que
    hagan falta. (hasta que introduzca un número mayor que 1)
    • Crea un método para pedir el número al usuario, otro de tipo booleano para comprobar que el número es mayor que 1 y otro para mostrar el resultado.

    */
    
     public static void main(String[] args) {
        int numero;
        do {
            numero = solicitud();
            if (!comprobar(numero)) {
                System.out.println("Error: El número debe ser estrictamente mayor que 1. Inténtelo de nuevo.");
            }
        } while (!comprobar(numero));

        mostrarResultado(numero);
    }

    public static int solicitud() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número (mayor que uno): ");
        return entrada.nextInt();
    }

    public static boolean comprobar(int n) {
        return n > 1;
    }

    public static void mostrarResultado(int n) {
        System.out.println("Los números entre 1 y " + n + " son:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
}
