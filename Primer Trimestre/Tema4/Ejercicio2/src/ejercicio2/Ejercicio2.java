package ejercicio2;
/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    /*
    Ejercicio 02.- Realiza un programa en el que le solicites en el main al usuario 2 números y, si el primer número introducido es mayor que 10, se
    llamará a un método que los multiplicará y mostrará el resultado, y en caso contrario se llamará a un método que los sume. ESTOS DOS
    MÉTODOS ESTARÁN EN UNA CLASE DISTINTA EN EL MISMO PAQUETE. Muestra al usuario la operación realizada y el resultado.
    • Muestra por pantalla el resultado de la siguiente forma:
            Por favor, introduzca un numero: xxx
            Ahora, introduzca un segundo numero: xxx
            La operación que se realizó es suma o producto y el resultado es xxx
    */
    
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        if (num1 > 10){
            Operacion.multiplicacion(num1, num2);
        } else {
            Operacion.suma (num1, num2);
        }
        
    }
    
}
