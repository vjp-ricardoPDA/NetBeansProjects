package ejercicio9;
/**
 *
 * @author alumno
 */
public class salidaText {

    public static void numeroMenor(int n1, int n2, int n3) {
        System.out.println(n1+" "+n2+" "+n3);
        int menor = n1;
        
        if (n2 < n1 && n2 < n3){
            menor = n2;
        }if (n2 < menor){
            menor = n2;
        } if (n3 < menor){
          menor = n3;  
        } if (n1 == n2 || n1 == n3 || n2 == n3){
            System.out.println("dos de los tres (o los tres) numeros introducidos son iguales, vuelva a intentarlo");
        }
        
        System.out.println("El numeor mas pequenio de los tres introducidos es: " + menor);
    }
}






    




