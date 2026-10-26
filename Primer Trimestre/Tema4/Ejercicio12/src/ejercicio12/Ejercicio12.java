package ejercicio12;
/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio12 {
    /*
    Ejercicio 12.- Realiza un programa que le pida una contraseña al usuario. Si la escribe bien le dará la enhorabuena, 
    pero si la escribe mal 3 veces le dará un mensaje de error de acceso.
    • La petición de contraseña la haremos en un método, 
    la comprobación de la contraseña la haremos en otro método de tipo booleano, y el resultado de la comprobación la haremos desde otro método.
    */
    
    public static final int contrasenia = 1234;
    public static void main(String[] args) {
        mostrarOpciones();
        
        
        
    }
    public static void mostrarOpciones(){
        int intentos = 1;
        boolean objetivo = false;
        while (intentos <= 3 && objetivo == false) {
            objetivo = comprobacion(solicitud());
            
            if (objetivo == false){
                System.out.println("La contraseña introducida es incorrecta, vuelva a intentarlo");
                System.out.println("(Intento fallido numero " + intentos + " )");
                intentos++;
            } else if (objetivo == true){
                intentos--;
                System.out.println("La contraseña introducida es correcta, numero de intentos fallidos : " + intentos);
            }
        }
    }
    public static int solicitud(){
        Scanner entrada = new Scanner(System.in);
        int intentoPwd;
        System.out.println("Introduzca la contraseña");
        intentoPwd = entrada.nextInt();
        return intentoPwd;
    }
    
    
    public static boolean comprobacion(int n){
        boolean resultado = false;
        if (n == contrasenia){
            resultado = true;
        }
        
        return resultado;
    }
    
}
