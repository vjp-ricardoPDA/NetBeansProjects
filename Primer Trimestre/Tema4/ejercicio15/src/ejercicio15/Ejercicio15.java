package ejercicio15;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    /*
    Ejercicio 15.- Diseña un programa en JAVA que pida al usuario dos números por teclado.
    Posteriormente el programa mostrará un menú que le permitirá al usuario:
    • 1.- Sumar los números.
    • 2.- Restar los números.
    • 3.- Multiplicar los números.
    • 4.- Dividir los números.
    • 5.- Salir del programa.
    • Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a aparecer
        pidiendo nuevamente que le introduzcas una opción.
    • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
    • Nota 3:Utiliza todos los subprogramas que se te ocurran.

    */
    
    
     public static void main(String[] args) {
        double num1 = pedirNumero("Introduce el primer numero: ");
        double num2 = pedirNumero("Introduce el segundo numero: ");
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirOpcion();
            ejecutarAccion(opcion, num1, num2);
        } while (opcion != 5);
    }

    public static double pedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        return entrada.nextDouble();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1.- Sumar los numeros.");
        System.out.println("2.- Restar los numeros.");
        System.out.println("3.- Multiplicar los numeros.");
        System.out.println("4.- Dividir los numeros.");
        System.out.println("5.- Salir del programa.");
    }

    public static int pedirOpcion() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Seleccione una opcion: ");
    try {
        return entrada.nextInt();
    } catch (Exception e) {
        System.out.println("Error: (entrada no valida) " + e.getMessage());
        return 0;
    }
}


    public static void ejecutarAccion(int opcion, double n1, double n2) {
        switch (opcion) {
            case 1:
                sumar(n1, n2);
                break;
            case 2:
                restar(n1, n2);
                break;
            case 3:
                multiplicar(n1, n2);
                break;
            case 4:
                dividir(n1, n2);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida. Intentelo de nuevo.");
        }
    }

    public static void sumar(double n1, double n2) {
        System.out.println("Resultado: " + (n1 + n2));
    }

    public static void restar(double n1, double n2) {
        System.out.println("Resultado: " + (n1 - n2));
    }

    public static void multiplicar(double n1, double n2) {
        System.out.println("Resultado: " + (n1 * n2));
    }

    public static void dividir(double n1, double n2) {
        try {
            if (n2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }
            System.out.println("Resultado: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
