package ejercicio9;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3, num4, vaso;
        // se solicitan los 4 numeros
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercero numero");
        num3 = entrada.nextInt();
        
        System.out.println("Introduzca el cuarto numero");
        num4 = entrada.nextInt();
        
        // System.out.println("Antes de tocar nada " + num1 + num2 + num3 + num4);  punto de control para verificar que funcione
        if (num1 > num2){ // si el numero 1 es mayor que el numero 2 cambian las posiciones volvando el valor de numero 1 en un auxiliar 
            vaso = num1;  //el numero 1 se convierte en el numero 2 y el numero 2 almacena el valor de auxiliar (num1)
            num1 = num2;
            num2 = vaso;
        } if (num2 > num3){ // si el numero 2 es mayor que el numero 3 cambian las posiciones volvando el valor de numero 2 en un auxiliar
            vaso = num2;    //el numero 2 se convierte en el numero 3 y el numero 3 almacena el valor de auxiliar (num2)
            num2 = num3;
            num3 = vaso;
        } if (num3 > num4){// si el numero 3 es mayor que el numero 4 cambian las posiciones volvando el valor de numero 3 en un auxiliar
            vaso = num3;    //el numero 3 se convierte en el numero 4 y el numero 3 almacena el valor de auxiliar (num3)
            num3 = num4;
            num4 = vaso;
        } 
        // System.out.println("primera vuelta " + num1 + num2 + num3 + num4); punto de control para verificar que funcione
        // se re`pite la condicional anterior N-1 veces, como N son 4 numeros se repetiria 3 veces con la misma explicacion
        if (num1 > num2){ 
            vaso = num1;
            num1 = num2;
            num2 = vaso;
        } if (num2 > num3){
            vaso = num2;
            num2 = num3;
            num3 = vaso;
        } if (num3 > num4){
            vaso = num3;
            num3 = num4;
            num4 = vaso;
        } 
        // System.out.println("Segunda vuelta " + num1 + num2 + num3 + num4); punto de control para verificar que funcione
        if (num1 > num2){
            vaso = num1;
            num1 = num2;
            num2 = vaso;
        } if (num2 > num3){
            vaso = num2;
            num2 = num3;
            num3 = vaso;
        } if (num3 > num4){
            vaso = num3;
            num3 = num4;
            num4 = vaso;
        } 
        
        
        
        System.out.println("El orden final de menor a mayo es " + num1 + num2 + num3 + num4);
        
        
    }
    
}
