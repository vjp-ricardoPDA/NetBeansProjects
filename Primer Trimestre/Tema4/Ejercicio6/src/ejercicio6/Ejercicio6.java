package ejercicio6;
/**
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio6 {
    /*
    Ejercicio 06.- Crea un programa en JAVA en donde el usuario introduzca la nota de un alumno (número entero entre 0 y 10) en el
    main, y se le pasará a un método que escribirá su calificación según el valor de la nota ingresada:
    • 0 a 4 = Suspenso.
    • 5 a 6 = Bien.
    • 7 a 8 = Notable.
    • 9 a 10 = Sobresaliente.
    • Nota: Se le avisará al usuario de un error en caso de que la nota que
    nos introduzca no esté entre 0 y 10.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota;
        
        System.out.println("Introduzca la nota: ");
        nota = entrada.nextFloat();
        notas(nota);
        
    }
    
    public static void notas(float n){
        if (n < 0 || n > 10){
            System.out.println("La nota introducida esta fuera del rango (0-10) ");
        } else if (n > 0 && n < 5){
            System.out.println(n + " Suspenso");
        } else if (n >= 5 && n < 7){
            System.out.println(n + " Bien");
        } else if (n >= 7 && n < 9){
            System.out.println(n + " Notable ");
        }else if (n >= 9 && n <= 10){
            System.out.println(n + " Notable ");
        }
    }
    
}
