package ejercicio18;
/**
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio18 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Ejercicio 18.- Realiza un programa que le pida una contraseña al usuario. Si la escribe bien le dará la enhorabuena, pero si la escribe
        mal 3 veces le dará un mensaje de error de acceso.
        • Pista: Como sabes que al menos se ejecutará el bucle una vez, deberás utilizar un bucle do…while.
        • Comprime el proyecto con el nombre de ejercicio18.zip (o ejercicio18.rar) y súbelo a tu carpeta de Google Drive, dentro de una carpeta llamada Tema03.
        */
        int fallo = 0, contraseña = 1234, intentoAcceso; // cremos las variables para saber el nm de intento, la contraseña correcta y la contraseña que esta intentando
        Scanner entrada = new Scanner (System.in);
        do {
            System.out.println("Introduzca la contrasenia: "); // guardamos la contraseña a probar
            intentoAcceso = entrada.nextInt();
            
            if (contraseña != intentoAcceso){ // si la contraseña falla se aumenta el fallo en 1 y te dice el nm de fallo en el que estas
                fallo ++;
                System.out.println("La contrasenia introducida es erronea, vuelva a intentarlo (fallo numero: " + fallo + ")");
            }else if (contraseña == intentoAcceso){ // si la contraseña es correcta te dice que has pasado y te dice los intento que te han hecho falta
                System.out.println("La contrasenia introducida es correcta");
                System.out.println("Hicieron falta " + fallo + " intentos fallidos");
            }
            
        } while (fallo <3 && contraseña == intentoAcceso); // mientras fallo sea menor que 3 (el primer intento fallo esta en 0)
        
        
        
        
        
        
        
    }
    
}
