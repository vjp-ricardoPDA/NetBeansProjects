package ejercicio27;
/**
 *
 * @author alumno
 */
import java.util.*;
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 27.- Diseña un programa en JAVA que pida al usuario dos números por teclado. Posteriormente el programa mostrará un menú que le permitirá al usuario:
        • 1.- Sumar los números.
        • 2.- Restar los números.
        • 3.- Multiplicar los números.
        • 4.- Dividir los números.
        • 5.- Salir del programa.
        • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
        aparecer pidiendo nuevamente que le introduzcas una opción.
        • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.*/
        
        Scanner entrada = new Scanner (System.in);
        int numUsr1, numUsr2, numMenu1 = 0;
        
        System.out.println("Introduzca un numero: ");
        numUsr1 = entrada.nextInt();
        System.out.println("Introduzca otro numero:");
        numUsr2 = entrada.nextInt();
        
        while (numMenu1 != 5) {
            System.out.println("Introduzca el numero de la operacion que desea realizar con los numeros anteriores: ");
            System.out.println("");
        }
        
    }
    
}
