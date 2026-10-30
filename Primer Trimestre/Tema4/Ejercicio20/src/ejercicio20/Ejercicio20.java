package ejercicio20;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 20.- Realiza un programa que le haga un examen al usuario, preguntándole cuál es la capital de España y quién descubrió América.
    • Le dirá si ha respondido correctamente o no, cual sería la respuesta correcta, y por último le dirá su nota (Un 0, un 5 o un 10)
    • Ejemplo de ejecución:
        EXAMEN DE CULTURA GENERAL
        1ª PREGUNTA: ¿Cuál es la capital de España?: Madrid
        Muy bien, respuesta correcta.
        2ª PREGUNTA: ¿Quién descubrió América?: Napoleón Bonaparte
        No es correcto. La respuesta correcta sería Colón
        NOTA DEL EXAMEN: 5
        • Nota: Las 2 soluciones (Madrid y Colón) guárdalas como constantes. Además,
        procura hacer cada pregunta en un método distinto.
    */
    //declaramos las constantes y la variable global
    public static final String CAPITAL = "Madrid";
    public static final String DESCUBRIDOR = "Colon";
    public static int nota = 0;
    
    public static void main(String[] args) {
        //llamamos a cada funcion de manera ordenada ademas de mostrar los resultados al final
        System.out.println("Examen de cultura general");
        primeraPregunta();
        segundaPregunta();
        resultados();
    }
    
    public static void primeraPregunta(){
        Scanner entrada = new Scanner(System.in); // declaramos el Scanner
        System.out.println("1º Pregunta: Cual es la capital de Espania?: "); // realizamos la regunta
        String respuesta = entrada.nextLine();
        if (respuesta.equals(CAPITAL) ){// si compara su respues con el valor de la constante, si acierta se suma la nota y felicita
            System.out.println("Bien hecho, introdujo el valor correcto");
            nota = nota + 5;
        }else {
            System.out.println("Ha introducido una respuesta equivocada, la correcta era: " + CAPITAL);
        }
    }
    public static void segundaPregunta(){ // misma logica que para la primera pregunta
        Scanner entrada = new Scanner(System.in);
        System.out.println("2º Pregunta: Quien descrubrio America?: ");
        String respuesta = entrada.nextLine();
        if (respuesta.equals(DESCUBRIDOR)){
            System.out.println("Bien hecho, introdujo el valor correcto");
            nota = nota + 5;
        }else {
            System.out.println("Ha introducido una respuesta equivocada, la correcta era: " + DESCUBRIDOR);
        }
    }
    public static void resultados(){// se muestra la nota que tiene el usuario
        System.out.println("Su nota es de un: " + nota);
    }
}
