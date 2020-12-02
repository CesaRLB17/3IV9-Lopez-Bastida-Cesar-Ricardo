import java.util.*;
class Menu{
    
    Scanner entrada = new Scanner(System.in);

    byte opcion;

    public void Programas() {
    
        do{
            Sueldos obj = new Sueldos();
            Proveedores ob = new Proveedores();
            Biblioteca obje = new Biblioteca();

            System.out.println("Bienvenido");
            System.out.println("Elije una de las siguientes opciones:");
            System.out.println("1. Sueldos");
            System.out.println("2. Proveedores");
            System.out.println("3. Biblioteca");
            System.out.println("4. Terminar el programa");
            opcion = entrada.nextByte();

            switch (opcion) {
                case 1:
                    obj.Sueldos();
                break;
                case 2:
                    ob.Proveedores();
                break;
                case 3:
                    obje.Biblioteca();
                break;
                case 4:
                    System.out.println("El programa ha sido finalizado");
                break;
            }
        }while (opcion != 4);
    }
}
