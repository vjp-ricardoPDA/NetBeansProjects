package caritmetica;

    /**
     * @autor Ricardo Peerez de Azcarate
     * Operaciones Aritmeticas
     * @param args the command line arguments
     */

public class CAritmetica {

    /**
     * @autor Ricardo Peerez de Azcarate
     * Operaciones Aritmeticas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; // Declaracion de Varible int (numerico)
        int dato2, resultado; //Declaro a la vez dos variables int, dato2 y resultado
        
        dato1 = 20; //Valor por defecto de "dato1" es 20
        dato2 = 10; //Valor por defecto es 10
        
        //Realizacion de la Suma
        
        resultado = dato1 + dato2; //El valor de resultado es la suma del dato1 y el dato2
        System.out.println(dato1 + " + " + dato2 + " = " + resultado);
        
        /* Es la forma de concatenar en la pantalla variables y texto literal, separando el texto de las variables por "" y simbolos de + para
        la union de este
        */
        
        //resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        //producto
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);

        //cociente
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
    
    
}
