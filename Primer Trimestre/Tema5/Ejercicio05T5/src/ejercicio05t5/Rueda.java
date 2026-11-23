package ejercicio05t5;

/**
 *
 * @author alumno
 */

/*
 Diseña una clase Rueda que contenga los siguientes atributos privados:
        • material (de tipo cadena)
        • pulgadas (de tipo entero)
        • La clase Rueda contendrá los siguientes métodos públicos:
        • establecerMaterial
        • establecerPulgadas.
        • obtenerMaterial.
        • obtenerPulgadas.
*/

public class Rueda {
    
    //Atributos 
    private String material;
    private int pulgadas;
    
    // Constructor 
    public Rueda (String mat, int pulg){
        material = mat;
        pulgadas = pulg;
    
    }
    
    
    // Geter y Seter
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String m){
        material = m;
    }
    
    
    public int getPulgadas(){
        return pulgadas;
    }
    public void setPulgadas(int p){
        pulgadas = p;
    }
    
    
    
    //Mostrar datos
    @Override
    public String toString(){
        return "Material: " + material 
                + "\nPulgadas: " + pulgadas;
    }
}
