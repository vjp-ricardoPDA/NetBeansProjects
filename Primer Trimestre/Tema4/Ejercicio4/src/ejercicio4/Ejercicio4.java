package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres números (en el main) y se los pase a un método que los
    imprima por pantalla el menor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE DISTINTA DEL MISMO PAQUETE.    
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
        
        Operaciones.menorMayor(num1, num2, num3);
        
        
        
    }
    
}
