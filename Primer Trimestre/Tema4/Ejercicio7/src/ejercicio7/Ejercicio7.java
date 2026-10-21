package ejercicio7;
/**
 * @author alumno
 */

import java.util.Scanner;
import static orden.Colocacion.menorMayor;
public class Ejercicio7 {
    /*
        Ejercicio 07.- Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros (en el main),
        y que se los pase a un método que los muestre por pantalla ordenados de forma creciente (de menor a mayor).
        • En el caso de que veas que hay un conjunto de sentencias que se repiten,UTILIZA BUCLES
        • Muestra por pantalla el resultado de la siguiente forma:
            Por favor, introduzca el primer numero: 8
            Ahora, introduzca un segundo numero: 5
            Introduzca el tercer numero: 9
            Por último, introduzca un cuarto numero: 1
            El orden de los números introducidos es el 1 - 5 - 8 - 9
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos el scanner y las variables
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3, num4;
        
        //Solicitamos cada uno de los numeros
        System.out.println("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        
        //llamamos al metodo
        menorMayor(num1, num2, num3, num4);    
    }
    
}
