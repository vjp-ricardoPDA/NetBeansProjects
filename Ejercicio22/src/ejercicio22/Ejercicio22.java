package ejercicio22;

/**
 * @author alumno
 */

import static java.lang.Math.*;
import java.util.Scanner;
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1;
        double perimetro, area;
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Introduca el lado comun del triangulo: ");
        lado1 = entrada.nextInt();
        
        perimetro = 3 * lado1;
        area =((lado1 * lado1) * sqrt(3))/4;
        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("El area del triangulo es: " + area);
        
        
        
        
        
    }
    
}
