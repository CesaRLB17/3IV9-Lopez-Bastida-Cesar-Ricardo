import java.util.Scanner;

public class Pepperoni extends Pizza{

    public Pepperoni() {
    }

    public Pepperoni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Pepperoni en Rodajas";

    }
    public String elegirpepperoni(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        String pepperoni;
        System.out.println("Elije el tipo de pepperoni");
        System.out.println("1.- Rodajas");
        System.out.println("2.- Rodajas con parmesano");
        System.out.println("3. Rodajas y albaca");
        System.out.println("4. Doble Pepperoni en Rodajas");
        pepperoni = entrada.next();

        return pepperoni;
    }
}