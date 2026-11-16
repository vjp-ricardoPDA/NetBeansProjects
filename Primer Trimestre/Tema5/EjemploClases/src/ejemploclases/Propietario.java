package ejemploclases;

/**
 *
 * @author alumno
 */
public class Propietario {
    
    //Atributos
    private String nombre;
    private int edad;
    
    
    //Getter/setter
    
    public String getNombre (){
        return nombre;
    }
    public void setNombre (String n){
        nombre = n;
    }
    
    public int getEdad (){
        return edad;
    }
    public void setEdad (int e){
        edad = e;
    }
    
    //mostrar / toString
    
    public void mostrarPropietario(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    @Override
    public String toString(){
        return "\nEdad: " + edad + "\nNombre: " + nombre;
    }
}
