import java.util.*; 
public class Principal{
   
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        char menu;
        System.out.println("3IV9 Lopez Bastida Cesar Ricardo");
        do{
          
            Principal.menu();
                System.out.println("Si quiere volver al menu digite 'm', si desea salir del programa ingrese cualquier caracter");
        
                menu = entrada.next().charAt(0);
        }while (menu == 'm');
    }
 
public static void menu(){
    Scanner entrada = new Scanner(System.in);
int n1;

Datos BM = new Datos();

System.out.println("*Menu*\nDigite 1 para ejecutar el buscaminas");
n1 = entrada.nextInt();
if(n1 != 1){
    System.out.println("Esa opción no está disponible");
} 
switch (n1){

    case 1:
    BM.identificacion();
    try{
}catch(Exception e){

    System.out.println("El dato ingresado es incorrecto");

    System.out.println("Error: "+ e.getMessage());
}
    break;
    }

    
}
}
