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
            // si el dia introducido es del uno al cinco la variable laborable es true
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            // si es 6 o 7 corresponde a sabado o domingo y no se trabaja 
            case 6:
            case 7:
                laborable = false;
        }
        
        // Opcion propuesta por NetBeans
        /*
        switch (diasemana) {
            case 1, 2, 3, 4, 5 -> laborable = true;
            case 6, 7 -> laborable = false;
        }
        */
        if (diasemana >=1 && diasemana <= 7)
            if (laborable == true){ // si si laborabe toca trabajar
                System.out.println("El dia introducido se tiene que trabajar :(");
            } else if (laborable == false) { // si no laborable puedes descansar
                System.out.println("El dia introducido no se trabaja :)");
            } else{
                System.out.println("Excepcion no controlada por la aplicacion");
            }
        else {
            System.out.println("El numero introducido no coincide con ningun dia de la semana");
        }
        
        // Opcion propuesta por NetBeans
        /*
        switch (laborable) {
            default -> System.out.println("Excepcion no controlada por la aplicacion");
            case true -> System.out.println("El dia introducido se tiene que trabajar :(");
            case false -> System.out.println("El dia introducido no se trabaja :)");
        }
        */
        
        
        
        
        
        
    }
    
}
