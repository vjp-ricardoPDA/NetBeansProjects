package ejercicio26;
/**
 * @author alumno
 */
public class Ejercicio26 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 26.- Diseña un programa en JAVA que te diga la suma total de los números impares existentes entre el 111 y el 222.
        */
        int i, resultado = 0;
        for (i = 111; i<=222; i++){
            if (i % 2 != 0){
                resultado += i;
            }
        }
        System.out.println("suma total de los numero impares: " + resultado);
        
        
        
        
        
        
        
    }
    
}
