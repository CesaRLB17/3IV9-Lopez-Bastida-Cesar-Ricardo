import java.util.Scanner;

public class Menu {

    private int total = 0;
    private int opc;
    private int compra;

    public void MenuOperaciones(){

        Scanner entrada = new Scanner(System.in);

        byte opcion;
        String que = null;
        final int precio[] = new int[16];
        precio[0] = 75;
        precio[1] = 89;
        precio[2] = 112;
        precio[3] = 135;
        precio[4] = 89;
        precio[5] = 115;
        precio[6] = 135;
        precio[7] = 175;
        precio[8] = 96;
        precio[9] = 119;
        precio[10] = 131;
        precio[11] = 167;
        precio[12] = 88;
        precio[13] = 97;
        precio[14] = 111;
        precio[15] = 157;


        Pizza piz = null;
        System.out.println("Bienvenido a la Pizzeria");
        System.out.println("Ingrese la cantidad de pizzas que va a ordenar");
        compra = entrada.nextInt();
        while (compra < 1) {
            do {
                System.out.println("Ingresa una opcion valida");
                compra = entrada.nextInt();
            } while (compra < 1);
        }
        Pizza pizzzas [] = new Pizza[compra];

        for (int i = 0; i < compra; i++) {


            System.out.println("Elija paso a paso su pizza");
            System.out.println("1.- Pizza de Queso");
            System.out.println("2.- Pizza de Pepperoni");
            System.out.println("3.- Pizza Vegetariana");
            opc = entrada.nextInt();
            while (opc < 1 || opc > 3) {
                do {
                    System.out.println("Seleccione correctamente el ingrediente");
                    opc = entrada.nextInt();
                } while (opc < 1 || opc > 3);
            }
            System.out.println("Indique el tamaño de la pizza");
            System.out.println("1. Chica");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.println("4. Familiar");
            opcion = entrada.nextByte();
            while (opcion < 1 || opcion > 4) {
                do {
                    System.out.println("Ingresa una opcion valida");
                    opcion = entrada.nextByte();
                } while (opcion < 1 || opcion > 4);
            }


            switch(opc){
                case 1:

                    piz = new Queso();

                    Queso ques = new Queso();
                    ques.elegirtipoqueso();

                    piz.hornear();
                    piz.cortar(opcion);
                    piz.empacar();
                    if (ques.equals("Mozzarela")){
                        total += precio[opcion-1];
                    }else{
                        total += precio[opcion+3];
                    }

                    break;
                case 2:
                    piz = new Pepperoni();
                    Pepperoni Pep = new Pepperoni();
                    Pep.elegirpepperoni();
                    piz.hornear();
                    piz.cortar(opcion);
                    piz.empacar();
                    total += precio[opcion+7];

                    break;
                case 3:
                    piz = new Vegetariana();
                    Vegetariana Veg = new Vegetariana();
                    Veg.elegiringredientes();
                    piz.hornear();
                    piz.cortar(opcion);
                    piz.empacar();
                    total += precio[opcion+11];
                break;
            }
        }
        System.out.println("Su cuenta es: "+total);
    }
}