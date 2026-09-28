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
        Scanner entrada = new Scanner (System.in);
        int cartera, totales;
        
        System.out.println("Introduzaca la cantidad de dinero en su cartera: ");
        cartera = entrada.nextInt();
        
        totales = cartera / 50;
        System.out.println("Tiene " + totales + " billetes de 50");
        cartera -= totales * 50;
        
        totales = cartera / 20;
        System.out.println("Tiene " + totales + " billetes de 20");
        cartera -= totales * 20;
        
        totales = cartera / 10;
        System.out.println("Tiene " + totales + " billetes de 10");
        cartera -= totales * 10;
        
        totales = cartera / 5;
        System.out.println("Tiene " + totales + " billetes de 5");
        cartera -= totales * 5;
        
        totales = cartera / 2;
        System.out.println("Tiene " + totales + " billetes de 2");
        cartera -= totales * 2;
        
        totales = cartera / 1;
        System.out.println("Tiene " + totales + " billetes de 1");
        cartera -= totales * 1;
        
        System.out.println("Te han quedado " + cartera + "€ en la cartera");
        
    }
    
}
