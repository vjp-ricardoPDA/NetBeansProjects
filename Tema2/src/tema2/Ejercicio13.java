package tema2;
/**
 * @author alumno
 */
public class Ejercicio13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte vasoUno = 1;
        byte vasoDos = 2;
        byte vasoTres;
        System.out.println("Vaso uno: " + vasoUno + "\nVaso dos: " + vasoDos);
        vasoTres = vasoUno;
        vasoUno = vasoDos;
        vasoDos = vasoTres;
        System.out.println("Tras los cambios \nVaso uno: " + vasoUno + "\nVaso dos: " + vasoDos);
    }
    
}
