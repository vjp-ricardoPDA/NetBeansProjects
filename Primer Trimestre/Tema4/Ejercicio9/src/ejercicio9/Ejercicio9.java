package ejercicio9;
/**
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio9 {
    /**
     * @param args the command line arguments
     */
    /*
    Ejercicio 09.- Escribir un algoritmo en JAVA que pida tres números (utiliza un método) y se los pase a otro método
    que los imprima por pantalla el menor de ellos. ESTOS MÉTODOS ESTARÁN EN UNA CLASE DISTINTA DEL MISMO PAQUETE.
     */
    public static void main(String[] args) {
        salidaText.numeroMenor(solicitud(),solicitud(),solicitud());
    }

    public static int solicitud() {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca un numero: ");
        n = entrada.nextInt();
        return n;
    }
    
}
