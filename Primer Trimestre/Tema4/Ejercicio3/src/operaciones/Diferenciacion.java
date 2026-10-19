package operaciones;
/**
 * @author alumno
 */
public class Diferenciacion {
    public static void mayorMenor (int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " es el numero mas grande");
        } else if( n2 > n1 && n2 > n3){
            System.out.println(n2 + " es el numero mas grande");
        } else if (n3 > n1 && n3 > n2){
            System.out.println(n3 + " es el numero mas grande");
        }
    }
}
