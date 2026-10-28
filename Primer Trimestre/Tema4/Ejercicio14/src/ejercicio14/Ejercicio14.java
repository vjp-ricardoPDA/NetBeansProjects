package ejercicio14;
/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    /*
    Ejercicio 14.- Crea un programa en JAVA que que imprima todos los números múltiplos de 3 que existen entre el número 1 y otro
    número introducido por el usuario.
    • Controla que el usuario te meta un número mayor que 0 y, sino, avísale del error y vuélveselo al pedir las veces que hagan falta.
    • Por último infórmale al usuario del total de números mostrados.
    • Crea un método para pedir el dato al usuario, otro para comprobar que es mayor que 0 y otro para hacer los cálculos y mostrar el resultado.
    */
    
    public static void main(String[] args) {
        int numero;
        do {
            numero = pedirNumero();
            if (!validarMayorCero(numero)) {
                System.out.println("Error: El número debe ser mayor que 0.");
            }
        } while (!validarMayorCero(numero));

        calcularYMostrar(numero);
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número mayor que 0: ");
        return entrada.nextInt();
    }

    public static boolean validarMayorCero(int n) {
        return n > 0;
    }

    public static void calcularYMostrar(int n) {
        int contador = 0;
        System.out.println("Múltiplos de 3 entre 1 y " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("\nTotal de números mostrados: " + contador);
    }
    
}
