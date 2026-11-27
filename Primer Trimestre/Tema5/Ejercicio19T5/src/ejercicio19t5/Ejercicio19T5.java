package ejercicio19t5;

/**
 *
 * @author alumno
 */
public class Ejercicio19T5 {

    /*
    Ejercicio 19.- Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno de los tres empleados de una empresa. La empresa paga la tarifa normal
    en las primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en todas las horas trabajadas que excedan de 40.
    • El programa creará 3 objetos (uno para cada empleado) y se le pedirá al usuario que rellene la información para cada empleado en el constructor.
    • Por cada empleado se almacenará su nombre, el número de horas que trabajó, y la tarifa que cobra por una hora de trabajo.
    • Para probar la clase Empleado, crea una clase Test con un método que determine y muestre el sueldo bruto de cada empleado.
    • Ejemplo:
        Pepe trabajó 42 horas, cobra 20 euros la hora por lo que le corresponde un sueldo de 860 euros.
    */
    
    
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pepe", 42, 20);
               
        System.out.println("El importe es: " + e1.calcularNomina(e1.getHoras()));
        
        
        
        
        
    }
    
}
