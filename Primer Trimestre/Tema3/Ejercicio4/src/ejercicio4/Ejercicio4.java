package ejercicio4;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //declaramos las variables y la entrada
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3;
        // Introducimos los numeros
        System.out.println("Introduzaca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduca el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzaca el tercer numero: ");
        num3 = entrada.nextInt();
        // hacemos las comparaciones oportunas para saber cual es el menor numero
        if (num1 < num2 && num1 < num3) { // numero 1 menor que 2 y que 3
            System.out.println("El numero mas pequeño de los tres es: " + num1);
        } else if (num2 < num1 && num2 < num3 ){// numero 2 menor que 1 y que 3
            System.out.println("El numero mas pequeño de los tres es: " + num2);
        } else if (num3 < num1 && num3 < num2){// numero 3 menor que 1 y que 2
            System.out.println("El numero mas pequeño de los tres es: " + num3);
        } else if (num1 == num2 || num1 == num3 || num2 == num3) { // los numeros son iguales entre ellos, ya sean dos o tres de ellos
            System.out.println("Dos de los tres numeros o los tres coinciden siendo el mas pequeño");
        }  
        
        
    }
    
}
