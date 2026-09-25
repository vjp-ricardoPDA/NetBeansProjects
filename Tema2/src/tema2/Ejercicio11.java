package tema2;
/**
 * @author alumno
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 2;
        int cuad; //Hay que declar la variable antes de usarla
        
        cuad = numero * numero; //el segundo "numero" no puede llevar la tilde por estandar ademas de que no seria la misma variable
        System.out.println("El cuadrado de " + numero + " Es: " + cuad); //en la concatenacion NUMERO no puede ir en mayusculas ya que no seria la misma variable
        
    }
    
}
