package ejercicio12;
/**
 * @author alumno
 */
public class Ejercicio12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 12.- Crea un algoritmo en JAVA que, utilizando un
        bucle do…while, imprima los números pares que existen
        entre el número 11 y el número 133.
        */
        int num = 1; // declaramos la varible para el bucle
        do {
            if (num % 2 == 0){ // si el numero es par se imprimira un "-" seguido del numero par usado en ese instante 
                System.out.print(" - " + num);
            }
            num ++; // se incrementa en 1 la varibale
        } while (num >= 11 && num <= 133); // rango comprendido entre el 11 y el 133 ambos incluidos
        
        
        
        
    }
    
}
