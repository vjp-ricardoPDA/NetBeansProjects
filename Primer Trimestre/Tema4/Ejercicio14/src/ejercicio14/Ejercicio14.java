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
    Ejercicio 14.- Crea un programa en JAVA que que imprima todos los numeros multiplos de 3 que existen entre el numero 1 y otro
    numero introducido por el usuario.
    • Controla que el usuario te meta un numero mayor que 0 y, sino, avísale del error y vuélveselo al pedir las veces que hagan falta.
    • Por ultimo infórmale al usuario del total de numeros mostrados.
    • Crea un método para pedir el dato al usuario, otro para comprobar que es mayor que 0 y otro para hacer los cálculos y mostrar el resultado.
     */
    public static void main(String[] args) {
        int numero;

        // bucle para obligar al usuario a meter un numero correcto antes de calcular nada
        do {
            numero = pedirNumero(); // llamamos al metodo para pedir el numero

            if (!validarMayorCero(numero)) { // si da false (o sea, es 0 o negativo) salta el error
                System.out.println("Error: El numero debe ser mayor que 0.");
            }

        } while (!validarMayorCero(numero)); // se repite mientras el numero NO sea valido

        calcularYMostrar(numero); // una vez tenemos el numero correcto, hacemos los calculos
    }

    public static int pedirNumero() { // metodo para pedir el numero al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero mayor que 0: ");
        return entrada.nextInt(); // devolvemos el numero que ha escrito
    }

    public static boolean validarMayorCero(int n) { // metodo para comprobar si es mayor que 0
        return n > 0; // si es mayor devuelve true, si es menor o igual devuelve false
    }

    public static void calcularYMostrar(int n) { // metodo para hacer los calculos del bucle y los multiplos
        int contador = 0; // hucha para llevar la cuenta de cuantos numeros mostramos

        System.out.println("Multiplos de 3 entre 1 y " + n + ":");

        // empezamos en 1 y vamos de uno en uno hasta llegar al numero del usuario
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) { // si el resto de dividir el numero entre 3 da 0, es que es multiplo
                System.out.print(i + " "); // lo pintamos por pantalla seguido de un espacio
                contador++; // sumamos uno al contador de multiplos encontrados
            }
        }

        // al salir del bucle informamos del total guardado en el contador
        System.out.println("\nTotal de numeros mostrados: " + contador);
    }
}
