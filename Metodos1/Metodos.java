import java.util.*;

public class Metodos{

    public void menu(){

        Scanner entrada = new Scanner(System.in);
        int  opcion;
        char letra;
        
        do{
            System.out.println("Seleccione el programa que desea ejecutar");
            System.out.println("1.- Calculadora de edad");
            System.out.println("2.- Area y perimetro");
            System.out.println("3.- Llamadas");
            
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    do{
                    Edad prog = new Edad();
                    prog.Edad();
                    System.out.println("Si desea repetir el programa escriba 'r'");
                    System.out.println("Si desea salir, ingrese cualquier otro caracter");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 2:
                    do{
                    Figuras prog = new Figuras();
                    prog.Operaciones();
                    System.out.println("Si desea repetir el programa escriba 'r'");
                    System.out.println("Si desea salir, ingrese cualquier otro caracter");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 3:
                    do{
                    Llamadas prog = new Llamadas();
                    prog.Celular();
                    System.out.println("Si desea repetir el programa escriba 'r'");
                    System.out.println("Si desea salir, ingrese cualquier otro caracter");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
            }
            System.out.println("Si desea regresar al menu escriba 'm'");
            System.out.println("Si desea salir, ingrese cualquier otro caracter");
            letra = entrada.next().charAt(0);
        }while(letra == 'm');
    }
}
