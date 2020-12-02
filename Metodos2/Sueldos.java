import java.util.*;
public class Sueldos{

    byte puesto;
    int ID, ExtraDia, ExtraNoche;

    double gasto, sueldo;
    double SueldoE = 5000;
    double SueldoS = 8000;
    double infonavit = 8;
    double ISR = 16; 
    double SGM = 12.8;
    String NombreC;

    Scanner entrada = new Scanner(System.in);

    public void Sueldos(){
        Sueldos obj = new Sueldos();

        obj.Dinero();
    }
    public void Dinero(){

        System.out.println("Ingresa tu ID");
        ID = entrada.nextInt();
        System.out.println("Bien, ahora ingresa tu nombre");
        NombreC = entrada.next();
        
        do{
            System.out.println("Ingresa tu puesto de trabajo");
            System.out.println("1. Empleado");
            System.out.println("2. Supervisor");
            puesto = entrada.nextByte();
        }while (puesto > 2 ||  puesto < 1);
        if(puesto == 1){
            Empleado();
        }
        else{
            Supervisor();
        }
    }
    public void Empleado(){
        System.out.println("Ingresa la cantidad de horas extra trabajadas durante el dia");
        int ExtraDia = entrada.nextInt();
        System.out.println("Ahora ingresa la cantidad de horas trabajadas durante la noche");
        int ExtraNoche = entrada.nextInt();

        ExtraDia = ExtraDia*50;
        ExtraNoche = ExtraNoche*60;
        sueldo = SueldoE + ExtraDia + ExtraNoche;
        Total();
    }
    public void Supervisor(){
        gasto = infonavit + ISR + SGM;
        sueldo = SueldoS - gasto;
        Total();
    }
    public void Total(){
        System.out.println("El sueldo de "+ ID +" "+NombreC+" es de: $" + sueldo);
    }
}
