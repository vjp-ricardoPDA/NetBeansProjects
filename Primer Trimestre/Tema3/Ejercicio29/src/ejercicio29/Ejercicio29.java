package ejercicio29;
/**
 * @author alumno
 */
import java.lang.Math.*;
import java.util.Scanner;
public class Ejercicio29 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 29.- Escribe un programa que juegue con el usuario a adivinar un número. El ordenador debe generar un número
        entero aleatorio entre 1 y 100, y el usuario tiene que intentar adivinarlo.
        • Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario si el número que tiene que adivinar es
        mayor o menor que el que ha introducido.
        • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número.
        */
        Scanner entrada = new Scanner (System.in);
        float aleatorio;
        int prediccion, intentos = 0;
        aleatorio = (int) (Math.random() * 100 + 1);
        
        System.out.println(aleatorio);
        
        do{
            System.out.println("Introduzaca su prediccion: ");
            prediccion = entrada.nextInt();
            if (prediccion < 0 || prediccion > 100){
                System.out.println("El numero introduccido esta fuera de los rangos (1-100) introduzcalo de nuevo");
                intentos ++;
            } else if (prediccion < aleatorio){
                System.out.println("El numero introduciodo es menor que el oculto, intentelo de nuevo ");
                intentos ++;
            }else if (prediccion > aleatorio){
                System.out.println("El numero introduciodo es mayor que el oculto, intentelo de nuevo ");
                intentos ++;
            } else if (prediccion == aleatorio){
                System.out.println("Has adivinado el numero, bien hecho!!!!");
                System.out.println("El numero de intentos necesarios han sido: " + intentos);
            }
        } while (aleatorio != prediccion);

        
        
        
        
    }
    
}
