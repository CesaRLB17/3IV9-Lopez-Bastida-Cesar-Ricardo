import java.util.Scanner;

public class Llamadas{

    public void Celular(){
        
        Scanner entrada = new Scanner(System.in);

        int i, saldo = 200;
        int numeros[] = new int [10];
        int n1 = 0; 
        int n2 = 0; 
        int n3 = 0;
        double GT;
        double suma1 = 0;
        double suma2 = 0;
        double suma3 = 0;
        char letra;

        System.out.println("Seleccione una opcion");
        System.out.println("1.- Llamada nacional");
        System.out.println("2.- Llamada internacional");
        System.out.println("3.- Celular");
        System.out.println("El saldo con el que cuenta es de $200");
        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] == 1){
                n1++;
                suma1 = n1*0.5;
            }
            else if (numeros[i] == 2){
                n2++;
                suma2 = (n2/2)*(0.6);
            }
            else if (numeros[i] == 3){
                n3++;
                suma3 = (n3/3)*0.2;
            }
        }
            
        GT = suma1 + suma2 + suma3;

        System.out.println("Ha gastado un total de $" + GT);
        System.out.println("Si desea conocer su saldo, digite 's' si desea salir entonces digite cualquier caracter");
        
        letra = entrada.next().charAt(0);
        
        if(letra == 's'){
            System.out.println("Su saldo original era de $" + saldo);
            System.out.println("Su nuevo saldo es de: $" + (saldo - GT));
        }
    }
}
