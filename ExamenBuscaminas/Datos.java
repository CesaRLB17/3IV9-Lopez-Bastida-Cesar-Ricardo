 
import java.util.*;
public class Datos{
    
    Scanner entrada = new Scanner(System.in);
    
     String nombre, usuario;
     int ID, numero;

    public Datos(){
    }
    public void identificacion(){
    
        System.out.println("Bienvenido! \nTendras que ingresar algunos datos para saber que no eres un bot y poder ingresar");
        System.out.println("Porfavor, ingresa tu nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingresa tu Nombre de usuario");
        usuario = entrada.nextLine();

        System.out.println("Vaya nombre, ahora ingresa tu ID");
        ID = entrada.nextInt();

        System.out.println("Instrucciones:\nBienvenido al juego chaval, esto es buscaminas, no evitaminas por lo que tendras que hallar las minas y desactivarlas");
        
        System.out.println("Digite '1' para ejecutar el juego");
        numero = entrada.nextInt();
        
        Buscaminas dear = new Buscaminas(nombre, usuario, ID);
        if (numero==1){
        System.out.println("El juego se esta iniciando");

        }



    } 

} 

