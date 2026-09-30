package ejercicio7;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        byte diasemana;
        boolean laborable = true;        
        
        System.out.println("Introduzca el dia de la semana (en numero) de hoy: ");
        diasemana = entrada.nextByte();
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
        }
        
        if (laborable == true){
            System.out.println("El dia introducido se tiene que trabajar :(");
        } else if (laborable == false) {
            System.out.println("El dia introducido no se trabaja :)");
        } else{
            System.out.println("Excepcion no controlada por la aplicacion");
        }
        
        
        
        
        
        
    }
    
}
