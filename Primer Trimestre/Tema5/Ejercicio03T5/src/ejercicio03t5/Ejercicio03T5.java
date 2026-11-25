package ejercicio03t5;

/**
 *
 * @author alumno
 */
public class Ejercicio03T5 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 03.- Diseña una clase Rueda que contenga los siguientes atributos privados:
        • material (de tipo cadena)
        • pulgadas (de tipo entero)
        • La clase Rueda contendrá los siguientes métodos públicos:
        • establecerMaterial
        • establecerPulgadas.
        • obtenerMaterial.
        • obtenerPulgadas.
    Luego, diseña una clase Coche que contenga los siguientes atributos privados:
        • marca (de tipo cadena)
        • modelo (de tipo cadena)
        • ruedas (objeto de tipo Rueda)
        • La clase Coche contendrá los siguientes métodos públicos:
        • establecerMarca
        • establecerModelo.
        • obtenerMarca.
        • obtenerModelo.
        • establecerRueda.
        • obtenerRueda.
    Para probar el funcionamiento de las clases creadas, crea otra clase llamada Test 
    (dentro del mismo paquete) que contenga el métodomain, donde:
        • Se creen 2 objetos de la clase Rueda: rueda1 y rueda2.
        • Establece el material y el tamaño, primero en el objeto rueda1 y luego en rueda2.
        • Muestra los datos (material y tamaño) de las dos ruedas creados.
        • Crea 3 objetos de la clase Coche: coche1, coche2 y coche3.
        • Establece la marca y el modelo de los 3 coches.
        • Establece las ruedas1 para el coche1 y el coche2, y ruedas2 para el coche3.
        • Muestra los datos de los coches creados (marca, modelo, material de su rueda y
        tamaño de su rueda.

    */
    public static void main(String[] args) {
        Rueda rueda1 = new Rueda ("Aluminio Forjado ", 18);
        Rueda rueda2 = new Rueda ("Aleacion Magnesio", 17);
        System.out.println("Rueda1: \n" + rueda1);
        System.out.println("Rueda2: \n" + rueda2);
        
        Coche coche1 = new Coche("Honda", "Civic", rueda1);
        Coche coche2 = new Coche ("Ford", "Mustang", rueda1);
        Coche coche3 = new Coche("BMW", "M3", rueda2);
        
        System.out.println("Coche1: \n" + coche1);
        System.out.println("Coche2: \n" + coche2);
        System.out.println("Coche3: \n" + coche3);
        
    }
    
}
