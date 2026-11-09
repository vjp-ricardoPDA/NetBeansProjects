package examen1;

import java.util.InputMismatchException; //Importamos el control para saber que el tipo de dato introducido por el usuario es el esperado
import java.util.Scanner; //Importamos el Scanner 

/**
 *
 * @author alumno
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccion;
        do{
            mostrarMenu(); // mostramos el menu de las opciones que tiene el usuario
            seleccion = pedirNum();// le pedimos por primera vez la seleccion de lo que quiere realizar
            switch (seleccion){
                case 1: // si la opcion seleccionada es "1"
                    System.out.println("Introduzca el numero de personas que forman su grupo: "); //se le solicita el numero de personas para pasarselo al metodo
                    generarGrupos(pedirNum()); //se invoca la funcion que genera los numeros pidiendo primero el numero de personas
                    break;
                case 2: // llama a la funcion de organizar las horas
                    organizarHorario();
                    break;
                case 3: // pide el radio en metros y devuelve el area en metros llamando a la funcion que calcula el area y devuelve el numero
                    System.out.println("Introduzca el radio del escenario(en metros): ");
                    System.out.println("El area resultante con el radio introducido es: " + calcularArea(pedirNum()) + "m");
                    break;
                case 4: // se despide del usuario
                    System.out.println("Gracias por usar el programa esperamos verle pronto");
                    break;
                default: // si el valor es mayo que 4 (si es negativo o una letra ya tiene el control de errores) se le dice que introdujo un numero no valido
                    System.out.println("Su seleccion no es valida por favor vuelva a intentarlo: ");
            
            
            }
            
            
            
        }while (seleccion != 4);// mientras el usuario no pulse el numero 4 asociado a salir del menu este se ejecutara 
        
        
    }
    
    public static void mostrarMenu (){ // el menu
        System.out.println("Este es el menu del festival de musica");
        System.out.println("1-Distribucion de los asistentes en grupos");
        System.out.println("2-Organizacion de los horarios de las actuaciones");
        System.out.println("3-Calculo del area del escenario (radio)");
        System.out.println("4-Salir del programa");
        System.out.println("Seleccione la accion que desea realizar");
        
    }
    
    public static int pedirNum (){
        int num = 0; // se declara la variable
        Scanner entrada = new Scanner(System.in); // El Scanner
        System.out.println("Por favor introduzca el numero: ");//se le solicita el numero al usuario
        do {
            try {
                num = entrada.nextInt(); //captura el seiguiente numero entero introdujcido por el usuario
                if (num <=0){  // si es menor que 0 se le dice al uauario y no sale del while
                    System.out.println("(el numero es 0 o menor vuelva a intentarlo: )");
                }
            } catch (InputMismatchException e) { // si el usuario mete una letra o algun tipo de caractar distinto a un numero entero se le avisa y se le solicita de nuevo
                System.out.println("Ha introducido un valor erroneo o un caracter no valido por favor vuelva a intentarlo: ");
                entrada.next(); // se limpia el buffer
            }

        } while (num <= 0); // mientras el numero sea 0 o negativo se le solicitara el numero 
        System.out.println("\n\n");// para espaciar las cosas un poco 
        return num; // devuelve numero
    }
    
    public static void generarGrupos(int n){ //funcion para la generacion de nuemros
        int i; // se declara la varibale del for
        boolean logrado = false; // se usa porque solo queremos menos grupos o mas integrantes por grupo, de esta forma cuando lo tenemos no se imprimen las demas opciones
        System.out.println("Siendo " + n + " personas en el grupo");
        for (i = 2; i < n; i++){ // partiendo de dos (todos son divisores de 1) y sin llegar a si mismo (si son 7 personas por logica hay un grupo de 7 personas pero queremos minimo dos grupos)
            if (n % i == 0 && logrado != true) { //Si su divisor da 0 (no se queda nadie descolgado) y aun no hemos encontrado un numero ya le tenemos
                logrado = true; // se pone el estado de logrado en true para que el for no imprimas mas opciones
                System.out.println("La forma ideal de repartirlos seria: " + n/i + " personas en " + i + " grupos"); //se le muestra al usuario la opcion, el nº de grupos y de personas por grupo                
            }
        }
        if (logrado == false){ // si no se logro se le avisa al ausuario
            System.out.println("No es posible reducir el grupo con su numero de integrantes");
        }
    }
    
    public static void organizarHorario(){
        int n1,n2,n3, vaso; // se declaran las variables de los 3 numeros y el vaso que vamos a necesitar
        System.out.println("Ha seleccionado la organizacion de horarios\nIntroduzca la duracion de las 3 acctuaciones en minutos a continuacion: ");
        
        System.out.println("Primera actuazion: "); // se solicitan los 3 numeros
        n1 = pedirNum();
        
        System.out.println("Segunda actuazion: ");
        n2 = pedirNum();
        
        System.out.println("Tercera actuazion: ");
        n3 = pedirNum();
        
        while (n1 > n2 || n2 > n3){ // mientras el primer numero es mayor que el segundo o el segundo que el tercero se cambian posiciones
            if (n1 > n2){ // si el primero es mayor que el segundo se cambian las posiciones
                vaso = n1;
                n1 = n2;
                n2 = vaso;
            } if (n2 > n3){ //y si el segundo es mayor que el tercer numero se vuelven a cambiar 
                vaso = n2;
                n2 = n3;
                n3 = vaso;
            } if (n1 == n2 || n1 == n3 || n2 == n3){ // en caso de qye dos numeros o los tres sean iguales se le avisara al usuario que se han ordenado pero con esta particularidad
                System.out.println("Dos de las tres actuaciones son iguales, tengalo en cuenta");
            }
        }
        System.out.println("El orden de las actuaciones de menor a mayor es el sigiente: " + n1 + " " + n2 + " " + n3); // y se le muestra el orden de menor a mayor
    }
    
    public static double calcularArea(int radio){ // calculo del area segun el radio introducido por el usuario
        double area; // se declara la variable 
        area = Math.PI * Math.pow(radio, 2); //con la constante PI de Math y con a funcion para potencias se calcula la potencia del radio se multiplican y da el area conmo resultado
        return area;
    }
    
    
    
    
    
}
