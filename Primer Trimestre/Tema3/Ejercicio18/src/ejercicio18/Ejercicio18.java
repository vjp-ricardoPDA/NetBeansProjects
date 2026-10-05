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
        int fallo = 0, contraseña = 1234, intentoAcceso;
        Scanner entrada = new Scanner (System.in);
        do {
            System.out.println("Introduzca la contrasenia: ");
            intentoAcceso = entrada.nextInt();
            
            if (contraseña != intentoAcceso){
                fallo ++;
                System.out.println("La contrasenia introducida es erronea, vuelva a intentarlo (fallo numero: " + fallo + ")");
            }else if (contraseña == intentoAcceso){
                System.out.println("La contrasenia introducida es correcta");
                System.out.println("Hicieron falta " + fallo + " intentos fallidos");
                fallo = 4;
            }
            
        } while (fallo <3);
        
        
        
        
        
        
        
    }
    
}
