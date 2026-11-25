package ejercicio03t5;

/**
 *
 * @author alumno
 */

/*
diseña una clase Coche que contenga los siguientes atributos privados:
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
*/

public class Coche {
    
    //Atrigutos
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    //Constructor
    public Coche (String marc, String model, Rueda rue){
        marca = marc;
        modelo = model;
        rueda = rue;
    }
    
    //Getter y Setter
    
    public String marca(){
        return marca;
    }
    
    public void marca(String m){
        marca = m;
    }
    
    public String modelo(){
        return modelo;
    }
    
    public void modelo(String m){
        modelo = m;
    }
    
    
    public Rueda rueda (){
        return rueda;
    }
    
    public void rueda (Rueda r){
        rueda = r;
    }
    
    //To String
    
    @Override
    public String toString(){
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nRueda: " + rueda;
    }
    
}
