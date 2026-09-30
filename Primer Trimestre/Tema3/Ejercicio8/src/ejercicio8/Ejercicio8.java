package ejercicio8;
/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cartera, cantidad;
        
        System.out.println("Introduzaca la cantidad de dinero que tiene en su cartera: ");
        cartera = entrada.nextInt();
        
        cantidad = cartera / 50;
        if (cantidad != 0){
            System.out.println("Billetes de 50: " + cantidad);
        }
        cartera -= cantidad * 50;
        
        cantidad = cartera / 20;
        if (cantidad != 0){
            System.out.println("Billetes de 20: " + cantidad);
        }
        cartera -= cantidad * 20;
        
        cantidad = cartera / 10;
        if (cantidad != 0){
            System.out.println("Billetes de 10: " + cantidad);
        }
        cartera -= cantidad * 10;
        
        cantidad = cartera / 5;
        if (cantidad != 0){
            System.out.println("Billetes de 5: " + cantidad);
        }
        cartera -= cantidad * 5;
        
        cantidad = cartera / 2;
        if (cantidad != 0){
            System.out.println("Monedas de 2: " + cantidad);
        }
        cartera -= cantidad * 2;
        
        cantidad = cartera / 1;
        if (cantidad != 0){
            System.out.println("Monedas de 1: " + cantidad);
        } 
        
        
        
        
    }
    
}
