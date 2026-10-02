package ejercicio9;
/**
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //calculo de la longitud de una circunferencia 
        
        //declaramos las varibales radio y longitud y la constante pi
        float radio = 3.55f;
        final float pi = 3.1415927f;
        float longitud;
                
       longitud = 2 * pi * radio;  // Almacenamos en la variable longituz el calculo realizado
       
     System.out.println("La longitud de una circunferencia cuyo radio vale " + radio + " seria: " + longitud + " metros.");
    }
    
}
