package tema2;
/**
 * @author alumno
 */
public class Ejercicio15 {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int segundos= 10000, minutos, horas;
               
        horas = segundos / 3600;
        segundos = segundos % 3600;
        
        minutos = segundos / 60;
        segundos = segundos % 60;
        
        System.out.println("El ressultado son: " + horas + ":" + minutos + ":" + segundos);
        
        
    }
    
}
