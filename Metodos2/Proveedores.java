import java.util.*;
public class Proveedores{

    String Nombre;
    int i;
    int[] Costo = new int[10];
    int[] Existencia = new int[10];
    String[] Producto = new String[10];
    float SumaC, Max, Min, Pro;

    Scanner entrada = new Scanner(System.in);
    
    public void Proveedores(){        
        EntradaDatos();
    }
    public void EntradaDatos(){
        System.out.println("Ingresa el nombre del cliente");
        Nombre = entrada.next();
        System.out.println("Digita el nombre y el costo de los productos respectivamente");
            for(i = 0; i < Costo.length; i++){
                System.out.println("Producto " + (i + 1));
                Producto[i] = entrada.next();
                System.out.println("Costo");
                Costo[i] = entrada.nextInt();
                SumaC += Costo[i];
                System.out.println("Numero de productos existentes " + (i + 1)); 
                Existencia[i] = entrada.nextInt();
            }

        Min = Max = Costo[0];

            for (i = 0; i < Costo.length; i++){
                if(Costo[i] > Max){
                    Max = Costo[i];
                }
                else if(Costo [i] < Min){
                    Min = Costo[i];
                }
            }
        System.out.println("Existencia"); 
            
        Datos();
    }
    public void Datos(){                
        System.out.println("Los datos de los productos de nuestro cliente " + Nombre + ".");
        System.out.println("Existencia: " + Existencia[1]+ " producto de: " + Producto[1] + ", con un costo de: $" + Costo[1] + " cada uno");
        System.out.println("Existencia: " + Existencia[2]+ " producto de: " + Producto[2] + ", con un costo de: $" + Costo[2] + " cada uno");
        System.out.println("Existencia: " + Existencia[3]+ " producto de: " + Producto[3] + ", con un costo de: $" + Costo[3] + " cada uno");
        System.out.println("Existencia: " + Existencia[4]+ " producto de: " + Producto[4] + ", con un costo de: $" + Costo[4] + " cada uno");
        System.out.println("Existencia: " + Existencia[5]+ " producto de: " + Producto[5] + ", con un costo de: $" + Costo[5] + " cada uno");
        System.out.println("Existencia: " + Existencia[6]+ " producto de: " + Producto[6] + ", con un costo de: $" + Costo[6] + " cada uno");
        System.out.println("Existencia: " + Existencia[7]+ " producto de: " + Producto[7] + ", con un costo de: $" + Costo[7] + " cada uno");
        System.out.println("Existencia: " + Existencia[8]+ " producto de: " + Producto[8] + ", con un costo de: $" + Costo[8] + " cada uno");
        System.out.println("Existencia: " + Existencia[9]+ " producto de: " + Producto[9] + ", con un costo de: $" + Costo[9] + " cada uno");
        System.out.println("El total de costos es de: $" + SumaC);
        System.out.println("Costo mayor: $" + Max);
        System.out.println("Costo menor: $" + Min);
        Pro = SumaC/10;
        System.out.println("El promedio de los costos es de: $" + Pro);
    }
}
