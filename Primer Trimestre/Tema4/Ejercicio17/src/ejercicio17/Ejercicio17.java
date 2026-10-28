package ejercicio17;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 17.- Escribe un programa que juegue con el usuario a adivinar una letra minúscula. El ordenador debe generar una letra aleatoria entre a y z, y el usuario
    tiene que intentar adivinarla.
    • Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario si la letra que tiene que adivinar está antes o después en el alfabeto.
    • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de intentos que el usuario ha necesitado para adivinar el número. Recuerda utilizar
    subprogramas.
    • Pistas:
    • El códigoASCII de la a es el 97, y el de la z es el 122.
    • Para capturar el char que introduzca el usuario, utiliza:
    char letra=entrada.nextLine().charAt(0);
        math.random(97-122)
        char letra = entarda.nextLine().charAt(0);
        int asciiLetra = (int) letra; ------ char letra = (char) asciiLetra;
        para optener el ascii del usuario --------para traducir el ascii para el usuario
    */
    
    public static void main(String[] args) {
        char letra = generarLetra();
        System.out.println(letra);
    }
    
    
    public static char generarLetra (){
        char letra = (char) Math.floor(Math.random() * (122 - 97) + 97);
        
        return letra;
    }
    
    public static char letraUser(){
        
    }
    
    
}
