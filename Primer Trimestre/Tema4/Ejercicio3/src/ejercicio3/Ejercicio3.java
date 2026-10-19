package ejercicio3;
/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    /*
    Ejercicio 03.- Diseña un programa en JAVA que lea tres números en el main y se los pase a un método que imprimirá por pantalla el
    mayor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE DISTINTA DE OTRO PAQUETE.
    • Muestra por pantalla el resultado de la siguiente forma:
            Por favor, introduzca el primer numero: xxx
            Ahora, introduzca un segundo numero: xxx
            Por último, introduzca un tercer numero: xxx
            El número mayor de los introducidos es el xxx
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        operaciones.Diferenciacion.mayorMenor(num1, num2, num3);
    }
    
}
