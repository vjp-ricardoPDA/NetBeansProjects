package ejercicio27;
/**
 *
 * @author alumno
 */
import java.util.*;
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 27.- Diseña un programa en JAVA que pida al usuario dos números por teclado. Posteriormente el programa mostrará un menú que le permitirá al usuario:
        • 1.- Sumar los números.
        • 2.- Restar los números.
        • 3.- Multiplicar los números.
        • 4.- Dividir los números.
        • 5.- Salir del programa.
        • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
        aparecer pidiendo nuevamente que le introduzcas una opción.
        • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.*/
        
        //Declaramos las variales y el Scanner
        Scanner entrada = new Scanner (System.in);
        int numUsr1, numUsr2, resultado = 0, numMenu = 0, i, resto = 0;
        
        //Solicitamos los dos numeros al ausuario
        System.out.println("Introduzca el primer numero: ");
        numUsr1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero:");
        numUsr2 = entrada.nextInt();
        
        //Empezamos el while hasta que el usuario decida salir pulsando 5, si realiza una operacion se volvera a mostrar el menu hasta que el usuario
        // no decida salir
        while (numMenu != 5) {
            
            //Mostramos el Menu con su numero asignado cada uno
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            
            //Pedimos el numero de la operacion que el usuario quiere realizar
            System.out.println("Introduzca el numero de la operacion que desea realizar con los numeros anteriores: ");
            numMenu = entrada.nextInt();
            
            if (numMenu == 1 ){ //Si selecciona el numero 1 (asociado a la suma) se realiza y muestra dicha operacion
                resultado = numUsr1 + numUsr2;
                System.out.println("El resultado de la Suma de " + numUsr1 + " + " + numUsr2 + " = " + resultado);
                for (i=0; i<3;i++){ //Separacion fisica entre el resultado y el siguiente menu para la siguiente operacion
                    System.out.println("-------------------------");
                }
                
            } else if (numMenu == 2) { //Si selecciona el numero 2 (asociado a la resta) se realiza y muestra dicha operacion
                resultado = numUsr1 - numUsr2;
                System.out.println("El resultado de la Resta de " + numUsr1 + " - " + numUsr2 + " = " + resultado);
                for (i=0; i<3;i++){//Separacion fisica entre el resultado y el siguiente menu para la siguiente operacion
                    System.out.println("-------------------------");
                }
                
            }else if (numMenu == 3){ //Si selecciona el numero 3 (asociado a la multiplicacion) se realiza y muestra dicha operacion
                resultado = numUsr1 * numUsr2;
                System.out.println("El resultado de la Multiplicacion de " + numUsr1 + " * " + numUsr2 + " = " + resultado);
                for (i=0; i<3;i++){ //Separacion fisica entre el resultado y el siguiente menu para la siguiente operacion
                    System.out.println("-------------------------");
                }
                
            } else if (numMenu == 4){ //Si selecciona el numero 4 (asociado a la division) se realiza y muestra dicha operacion
                try { //estas son las operaciones que pueden dar fallo asiq se introducen en el try
                    resultado = numUsr1 / numUsr2;
                    resto = numUsr1 % numUsr2;
                } catch (ArithmeticException e) { //si saliese un error con esta linea y funcion imprimiremos cual ha sido el problema
                    System.out.println("Error: (division por cero) " + e.getMessage());
                    System.out.println("Finalice el programa y asigne al segundo numero un valor distinto de 0");
                }
                System.out.println("El resultado de la Resta de " + numUsr1 + " / " + numUsr2 + " = " + resultado + " con un resto de: " + resto);
                for (i=0; i<3;i++){ //Separacion fisica entre el resultado y el siguiente menu para la siguiente operacion
                    System.out.println("-------------------------");
                }
                
            } else if (numMenu <= 0 || numMenu >= 4){  //Si selecciona otra opcion que no sea entre 1 y 5 se le indica y solicita el numero de nuevo 
                System.out.println("El numero introduciodo se sale de los rangos del menu (1-5)");
                for (i=0; i<3;i++){ //Separacion fisica entre el resultado y el siguiente menu para la siguiente operacion
                    System.out.println("-------------------------");
                }
            }
            
        }
        
    }
    
}
