package ejercicio25;
/**
 * @author alumno
 */
public class Ejercicio25 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 25.- Escribe un programa en JAVA que te diga la suma total de los números pares existentes entre el número 17 y el número 139.
        */
        int i, resultado = 0;
        for (i = 17; i<=139; i++){
            if (i % 2 == 0){
                resultado += i;
            }
        }
        System.out.println("suma total de los numero pares: " + resultado);
        
        
        
        
        
        
        
        
        
    }
    
}
