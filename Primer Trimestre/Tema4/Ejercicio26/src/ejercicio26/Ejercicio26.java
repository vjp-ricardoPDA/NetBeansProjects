package ejercicio26;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 26.- Escribe un programa que contenga un método llamado esPrimo que reciba un número entero como
    parámetro y devuelva un booleano que indique si se trata de un número primo o no.
    • Pista: Para comprobar que se trata de un número primo, hay que comprobar que no tiene divisores distintos de la unidad
    y del propio número. Se irá comprobando si tiene algún divisor a partir del 2 en adelante y si se encuentra algún
    divisor cuyo resto sea 0 ya sabremos que ese número no es primo.

    */
    public static void main(String[] args) {
        boolean valor = esPrimo(userNum()); // guardamos el valor en una variable para solo llamarlo una vez
        if (valor == true){
            System.out.println("El numero introducido es primo"); // el valor es primo si retorna true
        } else if (valor == false){
            System.out.println("El numero introducido no es primo");// si es false no es primo 
        }
    }
    public static int userNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber si es primo"); // se le solicita el numero al usuario
        return entrada.nextInt();
    }
    public static boolean esPrimo(int n) {
        boolean veredicto = true;// declaramos la variable a retornar
        int i;
        for (i = 2; i < n; i++) { // para todos los numeros entre 2 (incluido) y el numero introducido 
            if (n % i == 0) {// si alguna de las divisiones da 0 como resto es xq no es primo
                veredicto = false;
            }
            
                    
        }
        return veredicto;
    }
}
