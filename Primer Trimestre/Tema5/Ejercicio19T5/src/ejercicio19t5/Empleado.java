package ejercicio19t5;

/**
 *
 * @author alumno
 */
/*
Por cada empleado se almacenará su nombre, el número de horas que trabajó, y la tarifa que cobra por una hora de trabajo.
*/
public class Empleado {
    //Atributos
    private String nombre;
    private int horas;
    private int tarifa;
    
    //Constructores
    public Empleado(){
        nombre = "";
        horas = 0;
        tarifa = 0;
    }
    
    public Empleado(String nombre, int horas, int tarifa){
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    //Getter y Setter
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    public int getTarifa(){
        return tarifa;
    }
    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }
    
    //Metodos
    private int calculoHorasExtra(int horas){
        int extra = 0; 
        if (horas <= 40){
            extra = 0;
        } else if(horas > 40){
            extra = horas - 40;
        }
        
        return extra;
    }
    
    public double calcularNomina(int horas){
        int extra = calculoHorasExtra(horas);
        double importe;
        
        int ordinarias = horas - extra;
        
        importe = ordinarias * tarifa;
        
        importe = importe +(extra * (tarifa * 1.5));
        
        return importe;
        
    }
    
    
    
    //toString
    @Override
    public String toString(){
        return "El nombre es: " + nombre +
                "\nEl numero de horas es: " + horas + 
                "\nSu tarifa es de " + tarifa + "€ la hora";
    }
    
    
    
    
    
    
}
