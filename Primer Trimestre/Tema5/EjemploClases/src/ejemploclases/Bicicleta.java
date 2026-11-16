package ejemploclases;

/**
 * Class Bicicleta
 * @author alumno
 */
public class Bicicleta {
    
    //Atributos
    private String marca;
    private String color;
    private String talla;
    private int anios;
    private Propietario propietario; //Composicion de clases
    
    
    //Metodos
    
    //Getters/Setters
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    
    public String getTalla(){
        return talla;
    }
    public void setTalla(String t){
        talla = t;
    }
    
    public int getAnios(){
        return anios;
    }
    public void setAnios(int a){
        anios = a;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    public void setPropietario(Propietario p){
        propietario = p;
    }
    
    
    //Otros metodos
    public void mostrarAntiguedad(){
        if (anios > 10){
            System.out.println("La bici es antigua");
        } else {
            System.out.println("La bici es nueva");
        }
    }
    
    
    //Mostrar todos los atributos de la clase
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Talla: " + talla);
        System.out.println("Anios: " + anios);
        propietario.mostrarPropietario();
    }
    @Override
    public String toString(){
        return "Marca: " + marca 
                + " Color: " + color 
                + " Talla: " + talla 
                + " Anios: " + anios
                + propietario.toString();
    }
    
    
    
    
}
