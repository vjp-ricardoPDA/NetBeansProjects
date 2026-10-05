package ejercicio14;
/**
 * @author alumno
 */
public class Ejercicio14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 14.- Implementa un algoritmo en JAVA que,
        utilizando bucles, imprima los 100 primeros números pares.  
        */
        int num; // declaramos la variable que vamos a usar en el codigo
        for (num = 0; num <= 100; num ++){ // para todas las situaciones entre el 0 y el 100
            if (num % 2 == 0 && num != 0){ // que cumplan las condiciones de que sean pares (resto de num / 2 es 0)
                System.out.print(" " + num); // lo imprimimos con un espacio entre numeros
                if (num == 50){ // y para que la fila no sea eterna a mitad de numeros hacemos un salto de linea
                    System.out.println("");
                }
            }
        }
        
        
        
    }
    
}
