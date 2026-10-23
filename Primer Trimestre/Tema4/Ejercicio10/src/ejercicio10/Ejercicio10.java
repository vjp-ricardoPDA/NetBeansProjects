package ejercicio10;
/**
 *
 * @author alumno
 */
import java.util.Scanner;
import operaciones.Tablas;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 10.- Escribe un programa en JAVA que, utilizando bucles, imprima la tabla de multiplicar de un número que elija el usuario. El
        número se pedirá en un método y la tabla de multiplicar se escribirá en otro.
        • Ejemplo:
        Introduzca un numero para calcular su tabla de multiplicar: 8
        8 x 0 = 0
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24 ...
    */
    public static void main(String[] args) {
        Tablas.multiplicacion(datos());
    }
    
    
    public static int datos(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero del que quiere saber la tabla: ");
        num = entrada.nextInt();
        
        return num;
    }
}
