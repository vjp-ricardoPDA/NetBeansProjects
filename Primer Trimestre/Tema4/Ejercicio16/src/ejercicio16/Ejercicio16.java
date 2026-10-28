package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("Resultados de las operaciones:");
        System.out.println("• Raíz cuadrada de 64: " + obtenerRaizCuadrada(64));
        System.out.println("• 8 elevado al cubo: " + obtenerCubo(8));
        System.out.println("• Exponencial de 2: " + obtenerExponencial(2));
        System.out.println("• Logaritmo de 2.71828: " + obtenerLogaritmo(2.71828));
        System.out.println("• Menor valor entre 2 y 3: " + obtenerMenor(2, 3));
        System.out.println("• Valor absoluto de -4.5: " + obtenerValorAbsoluto(-4.5));
        System.out.println("• Redondeando -4.5 con ROUND: " + obtenerRedondeo(-4.5));
        System.out.println("• Seno de 45 grados: " + obtenerSenoGrados(45));
    }

    // 1. Calcula la raíz cuadrada
    public static double obtenerRaizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    // 2. Eleva un número al cubo
    public static double obtenerCubo(double numero) {
        return Math.pow(numero, 3);
    }

    // 3. Calcula el exponencial (e^x)
    public static double obtenerExponencial(double numero) {
        return Math.exp(numero);
    }

    // 4. Calcula el logaritmo natural (base e)
    public static double obtenerLogaritmo(double numero) {
        return Math.log(numero);
    }

    // 5. Devuelve el menor de dos números enteros
    public static int obtenerMenor(int a, int b) {
        return Math.min(a, b);
    }

    // 6. Devuelve el valor absoluto de un decimal
    public static double obtenerValorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    // 7. Redondea un número decimal al entero más cercano
    public static long obtenerRedondeo(double numero) {
        return Math.round(numero);
    }

    // 8. Calcula el seno convirtiendo los grados a radianes
    public static double obtenerSenoGrados(double grados) {
        double radianes = Math.toRadians(grados);
        return Math.sin(radianes);
    }
    
}
