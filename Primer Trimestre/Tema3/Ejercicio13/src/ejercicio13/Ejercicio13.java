package ejercicio13;
/**
 * @author alumno
 */
public class Ejercicio13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un algoritmo en JAVA que, utilizando un
        bucle while, imprima los números pares que existen entre el
        número 11 y el número 133
        */
        
        int num = 11; // declaramos la varibale del bucle
        
        while (num >= 11 && num <= 133){ // al igual que en el ejercicio anterior para el rango comprendido entre el 11 y el 133
            if (num % 2 == 0){ // calcualmos cual de estos numeros es par y lo imprimimos con una "-" precediendole
                System.out.print(" - " + num);
            }
            num ++; // incrementamos en uno la variable
        }
        
        
        
        
    }
    
}
