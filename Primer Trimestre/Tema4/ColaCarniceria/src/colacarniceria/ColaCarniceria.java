package colacarniceria;

/**
 *
 * @author Ricardo Perez de Azcarate
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ColaCarniceria {

    /**
     * @param args the command line arguments
     */
    final static char Compra = 'C'; // declaramos las constantes de las letras de compra y recogida
    final static char Recoger = 'R';

    public static void main(String[] args) { //en el main controlamos la raiz de lo que ocurre o deja de ocurrir con los menu y sus distintas opciones
        int opcion;
        do {
            mostrarMenu(); //mostramos el menu
            opcion = pedirNumero(); // y pedimos el numero de la accion que quiere realizar
            if (opcion == 1) {
                System.out.println("Su numero de compra es: ");
                comprar(); // la opcion de la compra y llamada al metodo
            } else if (opcion == 2) { //la opcion de la recogida
                System.out.println("Su numero de recogida es: ");
                recoger();
            } else if (opcion == 3) { //la funcion para generar varios numeros de lote
                generarLotes();
            } else if (opcion == 4) { // la despedida al finalizar el uso del programa
                System.out.println("Gracias por su compra, esperamos que vuelva pronto");
            } else {
                System.out.println("El numero introducido no es valido, vuelva a intentarlo");
            }
        } while (opcion != 4); // mientras el usuario no marque el numero 4 el proceso no finalizara
    }

    public static void mostrarMenu() { //Funcion del menu el cual solo muestra las distintas cosas que podemos hacer en el programa
        System.out.println("\n");
        System.out.println("Esta ud en la cola de la carniceria");
        System.out.println("1-Comprar carne");
        System.out.println("2-Recoger carne");
        System.out.println("3-Generar lote de tickets");
        System.out.println("4-Salir del programa");
        System.out.println("Introduzca el numero asociado a la accion que desea realizar: ");

    }

    public static void mostrarMenuReducido() { // el menu reducido para cuando se selecciona generar lotes 
        System.out.println("\n");
        System.out.println("1-Comprar Carne");
        System.out.println("2-Recoger Carne");
        System.out.println("3-Salir");
    }

    public static int pedirNumero() {
        int opcion = 0;
        boolean valido;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                opcion = entrada.nextInt(); // se solicita el numero al usuario y mientras no sea bien introducido valido nunca sera true y se le volvera a pedir
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("La opcion introducida no es correcta vuelva a intentarlo"); // se le indica que ha introducido mal el numero y se reitera que es false
                valido = false;
            }
        } while (valido == false);
        return opcion; //la funcion da el numero introducido por el usuario
    }

    public static void comprar() {
        int numero = (int) Math.floor(Math.random() * 100 + 1); // se genera un numero entre 1 y 100
        System.out.println(Compra + "-" + numero); // se concatena dicho numero a la inicial correspondiente en este caso es la compra
    }

    public static void recoger() {
        int numero = (int) Math.floor(Math.random() * 100 + 1); // se genera un numero entre 1 y 100
        System.out.println(Recoger + "-" + numero); // se concatena dicho numero a la inicial correspondiente en este caso es la compra
    }

    public static void generarLotes() {
        int opcion;
        System.out.println("Ha seleccionado generar lotes");
        mostrarMenuReducido(); // se le muestra el menu de las cosas que puede hacer

        System.out.println("Selecciona la opcion que quiere realizar");
        opcion = pedirNumero(); // se le pide un numero de la accion del menu que quiere realizar
        if (opcion != 3 ) { //si el usuario quiere salir no se ejecuta, solo seguira si la opcion del menu es la una o la otra sino seguira sin hacer nada
            System.out.println("Introduzca el numero de tickets que necesita: ");
            int cantidadTickets = pedirNumero(); //se le pide el numero de ticket que quiere
            int i;

            if (opcion == 1) { //si quiere la compra que genera el numero indicado de tickets de compra
                System.out.println("Los numeros para sus " + cantidadTickets + " son: ");
                for (i = 1; i <= cantidadTickets; i++) {
                    comprar();
                }
            } else if (opcion == 2) { // si es recogida se genera el numero indicado de numeros de recogida
                System.out.println("Los numeros para sus " + cantidadTickets + " son: ");
                for (i = 1; i <= cantidadTickets; i++) {
                    recoger();
                }
            } else {
                System.out.println("la opcion no es valida");
            }
        }

    }

}
