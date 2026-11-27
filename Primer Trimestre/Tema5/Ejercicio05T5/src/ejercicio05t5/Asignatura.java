package ejercicio05t5;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;
    private float nota;
    

//Contructor
    public Asignatura(){
        nombre = "";
        nota = 0;
    }
    
    public Asignatura(String nom){
        nombre = nom;
    }
    
    
    //geter y setter
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre = n;
    }
    
    public float getNota(){
        return nota;
    }
    public void setNota(float n){
        nota = n;
    }
    
    
    
    
    //metodos
    public static float calcularMedia(float n1, float n2, float n3, float n4, float n5, float n6){
        float notaMedia;
        
        notaMedia = (n1 + n2 + n3 + n4 + n5 + n6) / 6;
        
        
        return notaMedia;
    }
    
    
    //toString
    
    @Override
    
    public String toString(){
        return "Nombre Asignatura: " + nombre + " nota de la asignatura: " + nota + "\n";
    }
    
    
}
