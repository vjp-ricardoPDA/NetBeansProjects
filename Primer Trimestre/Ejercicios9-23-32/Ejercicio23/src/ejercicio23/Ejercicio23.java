package ejercicio23;
/**
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio23 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaramos las variables de cada tipo segun correspondecia y uso
        float precio, totalCesta;
        int unidades;
        //declaramos el Scanner para las entradas
        Scanner entrada = new Scanner (System.in);
        
        //solicitamos el importe del roducto
        System.out.println("Introduca el precio del producto: ");
        precio = entrada.nextFloat();
        
        //solicitamos la cantidad de producto INDIVISIBLE que vamos a llevarnos
        System.out.println("Introduca la cantidad que quiere comprar de este producto:");
        unidades = entrada.nextInt();
        
        // Calculamos el precio del conjunto con la multiplicacion de productos del mismo precio que queremos y lo mostramos por pantalla
        totalCesta = precio * unidades;
        
        System.out.println("El precio total a pagar es de: " + totalCesta);
        
        
        
        
    }
    
}
