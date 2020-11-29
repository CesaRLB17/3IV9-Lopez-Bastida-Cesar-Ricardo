import java.util.Scanner;

public class Edad{
    
    public void Edad(){
        
        Scanner entrada = new Scanner(System.in);

        int nac, total;

        System.out.println("Voy a calcular tu edad");
        System.out.println("Ingresa tu año de nacimiento");
        

        nac = entrada.nextInt();
        
        if(nac > 2020){
            System.out.println("El año es incorrecto actualmente");
            break;
        }
        else{
            total = (2020)-(nac);
            System.out.println("Tu edad es:" + total);
        }
    }
}