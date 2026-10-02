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
        int i, contar = 0;
        for (i = 20; i <= 160; i ++){
            if ( i % 2 == 1) {
                System.out.print(" - " + i);
                contar ++;
                
            }
            if (i == 70){
                    System.out.println("");
            }
        }
        System.out.println("La cantidad de números impares impresos han sido: " + contar);
        
    }
    
}
