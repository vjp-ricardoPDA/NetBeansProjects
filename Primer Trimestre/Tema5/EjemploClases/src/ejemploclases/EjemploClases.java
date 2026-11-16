package ejemploclases;

/**
 *
 * @author alumno
 */
public class EjemploClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear dos bicicletas
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setTalla("L");
        bici1.setAnios(15);
        
        Propietario p1 = new Propietario();
        p1.setNombre("PEPE");
        p1.setEdad(45);
        bici1.setPropietario(p1);
        
        
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Merida");
        bici2.setColor("Azul");
        bici2.setTalla("XL");
        bici2.setAnios(8);
        
        Propietario p2 = new Propietario();
        p2.setNombre("CRISTINA");
        p2.setEdad(26);
        bici2.setPropietario(p2);
        
        
        //Mostrar bici1
        System.out.println("Bici1");
        bici1.mostrarBicicleta();
       /* bici1.mostrarAntiguedad();
        System.out.println("Color Bici1: " + bici1.getColor());
        */
        
        //Mostrar bici2
        System.out.println("\nBici2");
        System.out.println(bici2.toString());
        /*bici2.mostrarAntiguedad();
        
        // Cambio de la talla de Bici2
        bici2.setTalla("M");
        bici2.mostrarBicicleta();*/
        
        
    }
    
}
