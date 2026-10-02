package ejercicio32;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos la entrada de datos y las variables
        Scanner entrada = new Scanner (System.in); 
        int cartera, totales;
        
        System.out.println("Introduzaca la cantidad de dinero en su cartera: ");
        cartera = entrada.nextInt();
                                                                        // La siguiente explicacion se hara de forma generica para todos los pasos comunes 
        totales = cartera / 50;                                         // gauramos en totales la parte entera de la / entre 50 en este caso asi sabremos los billetes de 50 que hay
        System.out.println("Tiene " + totales + " billetes de 50");     // mostramos por pantalla la cantidad de billetes obtenidos
        cartera -= totales * 50;                                        // actualizamos la cartera restando la cantidad que representa el total, por eso se multiplica por 50, es la cantidad de dinero (no billetes)
        
        totales = cartera / 20;
        System.out.println("Tiene " + totales + " billetes de 20");     //Explicado de manera general en el calculo de los billetes de 50
        cartera -= totales * 20;
        
        totales = cartera / 10;
        System.out.println("Tiene " + totales + " billetes de 10");     //Explicado de manera general en el calculo de los billetes de 50
        cartera -= totales * 10;
        
        totales = cartera / 5;
        System.out.println("Tiene " + totales + " billetes de 5");     //Explicado de manera general en el calculo de los billetes de 50
        cartera -= totales * 5;
        
        totales = cartera / 2;
        System.out.println("Tiene " + totales + " billetes de 2");     //Explicado de manera general en el calculo de los billetes de 50
        cartera -= totales * 2;
        
        totales = cartera / 1;
        System.out.println("Tiene " + totales + " billetes de 1");     //Explicado de manera general en el calculo de los billetes de 50
        cartera -= totales * 1;
        
        System.out.println("Te han quedado " + cartera + "€ en la cartera");    // mostramos el suelto (los centimos) que han quedado en la cartera
        
    }
    
}
