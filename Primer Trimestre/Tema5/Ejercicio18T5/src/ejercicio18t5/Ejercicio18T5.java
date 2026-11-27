package ejercicio18t5;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static ejercicio18t5.Operaciones.*;
public class Ejercicio18T5 {
    
    /*
    Ejercicio 18.- Realizar un programa orientado a objetos, que pida al usuario dos números por teclado (serán el atributo de dos objetos distintos). Posteriormente el programa
    mostrará un menú que le permitirá al usuario:
        1.- Sumar los números.
        2.- Restar los números.
        3.- Multiplicar los números.
        4.- Dividir los números.
        5.- Salir del programa.
    • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a aparecer pidiendo nuevamente que le introduzcas una opción.
    • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
    • Nota 3: Crea una clase “Numero”, con un solo atributo llamado valor, que se inicializará en el constructor con el valor que te introduzca el usuario.
    */
    
    public static void mostrarMenu(){
        System.out.println("1-Sumar los numeros");
        System.out.println("2-Restar los numeros");
        System.out.println("3-Multiplicar los numeros");
        System.out.println("4-Dividir los numeros");
        System.out.println("5-Salir del programa");
    }
    
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        while (numero == 0) {
            try {
                numero = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Hubo un error en el tipo de dato introducido, vuelva a introducirlo");
                entrada.nextLine();
            }
        }
        return numero;
    }
    
    public static void main(String[] args) {
        int opcion;
        
        System.out.println("Introduzca un numero distinto de 0: ");
        Numeros n1 = new Numeros();
        n1.setNum(pedirNum());
        
        System.out.println("Introduzca otro numero distinto de 0: ");
        Numeros n2 = new Numeros();
        n2.setNum(pedirNum());
        
        do{
            mostrarMenu();
            System.out.println("Seleccion el numero de la accion que quiere realizar: ");
            opcion = pedirNum();
            switch (opcion){
                case 1:
                    System.out.println("Ha seleccionado Sumar los numeros: ");
                    System.out.println("El resultado es: " + sumar(n1.getNum(), n2.getNum()));
                    break;
                case 2:
                    System.out.println("Ha seleccionado restar los numero: ");
                    System.out.println("El resultado es: " + restar(n1.getNum(), n2.getNum()));
                    break;
                case 3: 
                    System.out.println("Ha seleccionado multiplicar numeros: ");
                    System.out.println("El resultado es: " + multiplicar(n1.getNum(), n2.getNum()));
                    break;
                case 4:
                    System.out.println("Ha seleccionado Dividir numeros: ");
                    System.out.println("El resultado es: " + dividir(n1.getNum(), n2.getNum()));
                    break;
                case 5:
                    System.out.println("Gracias por visitar el programa!!");
                    break;
                default:
                    System.out.println("El numero introducido no es valido en el menu");
            }
        
        } while (opcion != 5);
        
        
        
    }
    
}
