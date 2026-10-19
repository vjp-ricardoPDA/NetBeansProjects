package ejercicio5;
/**
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 05.- Implementa un algoritmo en JAVA que le pida al usuario un número por teclado (en el main). Ese
    número se lo pasaremos a un método que nos dirá si el número introducido es par o impar. ESTE MÉTODO
    ESTARÁ EN UNA CLASE DISTINTA DE OTRO PAQUETE.
    */
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero para saber si es par o impar: ");
        num1 = entrada.nextInt();
        
        operaciones.Matematicas.parImpar(num1); 
        
        
        
        
        
    }
    
}
