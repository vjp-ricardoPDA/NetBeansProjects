package ejercicio1;
/**
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    
    /*
        Ejercicio 01.- Realiza un programa en JAVA en el cual se le pide al usuario (en el main) un número por teclado. 
        Luego se llamará a un método que pasándole número introducido por el usuario, nos dirá si el número introducido es positivo o negativo.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        El número introducido es positivo o negativo
        */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        num = entrada.nextInt();
        positivoNegativo(num);
    }
    public static void positivoNegativo (int n){
        if (n<0){
            System.out.println("el numero es negativo");
        } else if (n>0) {
            System.out.println("El numero es positivo");
        } else if (n == 0){
            System.out.println("El numero introducido no es ni positivo ni negativo, vuelva a introducirlo");
        }
    }
    
}
