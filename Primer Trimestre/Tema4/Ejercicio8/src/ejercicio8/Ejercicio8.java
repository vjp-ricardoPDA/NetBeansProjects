package ejercicio8;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio8 {
    /*
    Ejercicio 08.- Realiza un programa que dado un importe en euros (en el main) se los pase a un método que nos indique número óptimo de billetes de 50, 20, 10 y 5,
    así como la cantidad sobrante en monedas de 2 y de 1 euro. En caso de que NO haya billetes/monedas de algún tipo NO se mostrarán.
            • Por ejemplo:
            Por favor, indique una cantidad de dinero: 232
            232 Euros se descomponen en:
            Billetes de 50: 4
            Billetes de 20: 1
            Billetes de 10: 1
            Monedas de 2 euros: 1
    */
    public static void main(String[] args) {
        int cartera;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el dimero que hay en su cartera: ");
        cartera = entrada.nextInt();
        
        cuentas(cartera);
        
    }
    
    public static void cuentas(int c){
        int cantidad;
        System.out.println(c + " Euros se descomponen en:");

        cantidad = c / 50;
        if (cantidad > 0) {
            System.out.println("Billetes de 50: " + cantidad);
        }
        c = c % 50;

        cantidad = c / 20;
        if (cantidad > 0) {
            System.out.println("Billetes de 20: " + cantidad);
        }
        c = c % 20;

        cantidad = c / 10;
        if (cantidad > 0) {
            System.out.println("Billetes de 10: " + cantidad);
        }
        c = c % 10;

        cantidad = c / 5;
        if (cantidad > 0) {
            System.out.println("Billetes de 5: " + cantidad);
        }
        c = c % 5;

        cantidad = c / 2;
        if (cantidad > 0) {
            System.out.println("Monedas de 2 euros: " + cantidad);
        }
        c = c % 2;

        cantidad = c / 1;
        if (cantidad > 0) {
            System.out.println("Monedas de 1 euro: " + cantidad);
        }
    }
    
    
    
}
