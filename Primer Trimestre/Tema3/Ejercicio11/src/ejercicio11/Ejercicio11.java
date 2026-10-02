package ejercicio11;
/**
 * @author alumno
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Crea un programa en JAVA que, utilizando
            bucles, muestre por pantalla el mensaje "Hola" seis veces
            acompañado por un numero que se incrementa cada vez.
            • Muestra por pantalla el resultado de la siguiente forma:
            - Hola1 – Hola2 – Hola3 – Hola4 – Hola5 – Hola6 -
        */
        
        int i; // declaramos la varibal usada en el bucle
        for (i=0; i < 7; i ++){ // hasta el numero 7, empezando por el 0 imprimimos todos los numeros en fila separados por un -
            System.out.print(" - Hola " + i);
        }
        
        
        
    }
    
}
