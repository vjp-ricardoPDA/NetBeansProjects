package ejercicio18t5;

/**
 *
 * @author alumno
 */
public class Numeros {
    //Atributo
    private int value;
    
    //Constructores
    public Numeros(){
        value = 0;
    }
    
    public Numeros(int value){
        this.value = value;
    }
    
    //Getter y setter
    public int getNum(){
        return value;
    }
    
    public void setNum(int value){
        this.value = value;
    }
    
    //To String
    @Override
    
    public String toString(){
        return "El numero es: " + value;
    }
    
}
