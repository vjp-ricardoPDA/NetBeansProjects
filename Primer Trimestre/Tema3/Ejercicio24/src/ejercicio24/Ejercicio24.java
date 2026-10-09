package ejercicio24;
/**
 * @author alumno
 */
import java.util.*;
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 24.- Crea un programa en JAVA que que imprima todos los números múltiplos de 3 que existen entre el número 1 y otro
        número introducido por el usuario.
        • Controla que el usuario te meta un número mayor que 0 y, sino, avísale del error y vuélveselo al pedir las veces que hagan falta.
        • Por último infórmale al usuario del total de números mostrados.
        */
        Scanner entrada = new Scanner (System.in);
        final int Inicio = 1;
        int num1, i;
        
        //mientras el numero introducido por el usuario sea menor que 1 se le pedira que introduzca el numero
        do {
            System.out.println("Introduzca un numero mayor que 1: ");
            num1 = entrada.nextInt();
            if (num1<=1){
                System.out.println("El numero introducido es menor que 1, introduzca un numero valido");
            }
        
        } while(num1 <= Inicio);
        
        
        //cuando el numero introducido ya si es mayor 1 entonces desde la constante (1 en ese caso) empieza a recorrer y mostrar todos los numeros
        for (i=Inicio; i<=num1; i++){
            if (i % 3 == 0) {
                System.out.print(i + " - ");
            }
                
            if (i == num1/2+1){
                System.out.println("");
            }
        }

    }    
        
}        
        
        

