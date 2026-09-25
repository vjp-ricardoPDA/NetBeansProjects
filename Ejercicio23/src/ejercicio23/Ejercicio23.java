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
        float precio, totalCesta;
        int unidades;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduca el precio del producto: ");
        precio = entrada.nextFloat();
        
        System.out.println("Introduca la cantidad que quiere comprar de este producto:");
        unidades = entrada.nextInt();
        
        totalCesta = precio * unidades;
        
        System.out.println("El precio total a pagar es de: " + totalCesta);
        
        
        
        
    }
    
}
