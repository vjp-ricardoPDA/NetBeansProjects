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
        int letraAleatoria = generarLetra(); // nosotros siempre usamos y comparamos numeros pero se los traducimos al usuario
        //System.out.println(letraAleatoria);
        
        jugar(letraAleatoria); // una vez tenemos la letra empeiza el jeugo
    }
    
    public static void jugar(int letraAleatoria){
        int fallos = 0; //el contador de fallos
        int letraUser;
        do{
            letraUser = letraUser(); //inicia el while y almacenamos la letra del usuario para hacer las comprobacones pertinentes
            
            if (letraUser < letraAleatoria){ // si la letra introducida es menor se le avisa que su letra esta antes que la oculta en el abecedario
                System.out.println("La letra introducida tiene una posicion mas temprana que la aleatoria en el abecedario");
                fallos ++;
            } else if (letraUser > letraAleatoria){// si la letra introducida es mayor se le avisa que su letra esta despues que la oculta en el abecedario
                System.out.println("La letra introducida tiene una posicion mas tardia que la aleatoria en el abecedario");
                fallos ++;
            } else if (letraUser == letraAleatoria){ // si acierta le enseñamos la letra oculta y el numero de veces que ha fallado
                System.out.println("Has introducido bien la letra, bien hecho (la letra era " + (char) letraAleatoria + ")");
                System.out.println("(los intentos necesarios han sido = " + fallos + ")");
            }
        }while(letraUser != letraAleatoria);
    }
    
    public static int generarLetra (){
        //generamos un numero aleatorio entre 97 y 123 ya que 97 corresponde a la letra a, y el 122 a la z, de tal forma con un numero obtenemos una letra
        int letra = (int) Math.floor(Math.random() * (123 - 97) + 97);
        
        return letra; // devolvemos la letra en su forma numerica
    }
    
    public static int letraUser(){ //le pedimos al usuario que introduzca una letra
        System.out.println("Introduzca la letra que predice: ");
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.nextLine().charAt(0); //la posicion 0 (la primera) de la linea introducida
        int asciiLetra = (int) letra; // lo traducimos a un numero
        return asciiLetra; // devolvemos el numero
    }
    
    
}
