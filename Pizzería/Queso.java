import java.util.Scanner;

public class Queso extends Pizza{

    public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }

    public String elegirtipoqueso(){

        Scanner entrada = new Scanner(System.in);
        String queso ;
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
        queso = entrada.next();

        return queso;
    }
}