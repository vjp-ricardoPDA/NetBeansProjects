package ejercicio11;
/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 11.- Crea un programa que calcule la raíz cuadrada del número que introduzca el usuario. (Utiliza el método Math.sqrt() )
    • Si el usuario introduce un número negativo, debemos mostrarle un mensaje de error y volver a pedírselo (tantas veces como sea necesario).
    • La petición del número lo haremos en un método, el cálculo de la raíz cuadrada en otro, y mostraremos el resultado en otro método.
    */
    public static void main(String[] args) {
        int num;
        do{
            num = pedirDato();
            if (num<=1) {
                System.out.println("El numero introducido es menor que 1");
            }
        }while(num <=1);
        mostrarResultado(calcularRaiz(num),num);
    }
    
    public static void mostrarResultado(double n, int numRaiz){
        System.out.println("La raiz cuadrada de " + numRaiz + " es: " + n);
    }
    
    public static double calcularRaiz (int n){
        double resultado = Math.sqrt(n);
        
        return resultado;
    }
    
    
    public static int pedirDato (){
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el numero del que quiere saber la raiz cuadrada: ");
        num = entrada.nextInt();
        return num;
    }
    
}
