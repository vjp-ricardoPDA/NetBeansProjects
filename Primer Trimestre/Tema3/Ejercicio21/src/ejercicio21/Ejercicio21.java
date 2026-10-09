package ejercicio21;
/**
 * @author alumno
 */
import java.util.*; // importamos Scanner y InputMismatchException
public class Ejercicio21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 21.- Crea un programa que calcule el resultado de
        dividir los números que introduzca el usuario.
        • En caso de que el usuario introduzca un número divisor
        igual a 0, debemos capturar la excepción y mostrarle un
        mensaje de error al usuario.
        */
        
        Scanner entrada = new Scanner (System.in);
        int num1, num2, resultado = 0; // declaramos las variables
        
        //pedimos al usuario que introduzca los dos numeros para la division
        System.out.println("Introduzca el numero1 (divisor): ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el numero 2 (dividendo): ");
        num2 = entrada.nextInt();
        
        //control de errores
        try{ //realizamos la operacion para ver si es psoible realizarla
            resultado = num1 / num2;
        } catch (ArithmeticException e) { //si saliese un error con esta linea y funcion imprimiremos cual ha sido el problema
            System.out.println("Error: (division por cero) " + e.getMessage());
        }
        //si todo esta bien sacamos el resultado de la operacion por pantalla
        System.out.println("El ressultado de dividor " + num1 + "/" + num2 + " = " + resultado);
        
        
        
        
        
        
        
    }
    
}
