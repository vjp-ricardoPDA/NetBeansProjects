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
        int num1, num2, num3, num4, vaso = 0;
        
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercero numero");
        num3 = entrada.nextInt();
        
        System.out.println("Introduzca el cuarto numero");
        num4 = entrada.nextInt();
        
        
        if (num1 > num2){
            vaso = num2;
            num2 = num1;
            num1 = vaso;
        } else if (num2 > num3){
            vaso = num3;
            num3 = num2;
            num2 = vaso;
        } else if (num3 > num4){
            vaso = num4;
            num4 = num3;
            num3 = vaso;
        } 
        
        else if (num1 > num2){
            vaso = num2;
            num2 = num1;
            num1 = vaso;
        } else if (num2 > num3){
            vaso = num3;
            num3 = num2;
            num2 = vaso;
        } else if (num3 > num4){
            vaso = num4;
            num4 = num3;
            num3 = vaso;
        } 
        
        else if (num1 > num2){
            vaso = num2;
            num2 = num1;
            num1 = vaso;
        } else if (num2 > num3){
            vaso = num3;
            num3 = num2;
            num2 = vaso;
        } else if (num3 > num4){
            vaso = num4;
            num4 = num3;
            num3 = vaso;
        } 
        
        
        
        System.out.println("El orden final de menor a mayo es " + num1 + num2 + num3 + num4);
        
        
    }
    
}
