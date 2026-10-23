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
        
        while (comprobar(solicitud()) == false){
            
        }
        
        
        
        
        
    }
    
    public static int solicitud(){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un numero (mayor que uno): ");
        num = entrada.nextInt();
        
        return num;
    } 
    
    public static boolean comprobar(int n){
        boolean conclusion = false;
        if (n <= 1){
            conclusion = false;
        } else if (n > 1){
            conclusion = true;
        }
        return conclusion;
    }
    
    
}
