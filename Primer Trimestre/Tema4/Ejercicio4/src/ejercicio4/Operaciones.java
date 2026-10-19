package ejercicio4;

/**
 *
 * @author alumno
 */
public class Operaciones {
    public static void menorMayor(int n1, int n2, int n3){
        if (n1 < n2 && n1 < n3){
            System.out.println(n1 + " es el numero mas pequenio");
        } else if( n2 < n1 && n2 < n3){
            System.out.println(n2 + " es el numero mas pequenio");
        } else if (n3 < n1 && n3 < n2){
            System.out.println(n3 + " es el numero mas pequenio");
        }
    }
}
