package operaciones;
/**
 *
 * @author alumno
 */
public class Tablas {
    public static void multiplicacion(int n){
        int i;
        System.out.println("La tabla de " + n + " es: ");
        for (i = 0; i<11; i++){
            System.out.println( n + " * " + i + " = " + n * i);
        }
    }
}
