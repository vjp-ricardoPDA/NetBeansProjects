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
        salidaText.numeroMenor(solicitud1(),solicitud2(),solicitud3());
    }

    public static int solicitud1() {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el primer numero: ");
        n = entrada.nextInt();
        return n;
    }
    public static int solicitud2() {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el segundo numero: ");
        n = entrada.nextInt();
        return n;
    }
    public static int solicitud3() {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el tercer numero: ");
        n = entrada.nextInt();
        return n;
    }
    
}
