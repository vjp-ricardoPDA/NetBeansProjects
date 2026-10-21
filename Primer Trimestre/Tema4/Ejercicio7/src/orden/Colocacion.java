package orden;
public class Colocacion {
    public static void menorMayor (int n1, int n2, int n3, int n4){
        int vaso;
        
        while (n1 > n2 || n2 > n3 || n3 > n4) { // se condiciona que mientras el orden no sea de menor a mayor no se acabara 
            if (n1 > n2){ // se condiciona que mientras el numero de la izquierda (en las 3 posiciones) sea mayo que el de la derecha (en ese instante) cambien las posiciones
                vaso = n1;
                n1 = n2;
                n2 = vaso;
            }if (n2 > n3){
                vaso = n2;
                n2 = n3;
                n3 = vaso;
            }if (n3 > n4){
                vaso = n3;
                n3 = n4;
                n4 = vaso;
            }
        } 
        System.out.println("el orden de menor a mayor es: " + n1 + n2 + n3 + n4);
    }

}
