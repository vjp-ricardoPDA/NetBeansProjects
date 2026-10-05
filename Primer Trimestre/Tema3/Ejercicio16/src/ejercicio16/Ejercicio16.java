package ejercicio16;
/**
 * @author alumno
 */
public class Ejercicio16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Crea un programa que imprima los números impares que existen entre los números 20 y el 160.
        Además, al final, nos dirá cuantos impares ha imprimido en total por pantalla.
        • Ejemplo:
        Los números impares existentes entre el número 20 y el 160 son: 21
        – 23 – 25 – 27 – 29 – 31 - …
        La cantidad de números impares impresos han sido: XXX
        */
        
        // declaramos las variables i + contar, i servira para saber el numero por el que vamos y contar para saber las veces que se imprimio un numero impar
        int i, contar = 0;
        for (i = 20; i <= 160; i ++){
            if ( i % 2 == 1) { // si el numero es impar entonces
                System.out.print(" - " + i); // se imprime con un - precediendole
                contar ++; // y se aumenta en 1 la varible que utilizaremos apra saber cuantos numero impares vamos a imprimir 
                
            }
            if ( contar == 38 ){ // para que a mitad de fila haya un salto de linea
                System.out.println(" ");
                
            }
        }
        // la impresion de la cantidad final de numero impresos sacados por pantalla
        System.out.println("\nLa cantidad de numeros impares impresos han sido: " + contar);
        
    }
    
}
