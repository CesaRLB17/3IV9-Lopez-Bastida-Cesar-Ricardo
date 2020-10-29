import java.util.Scanner;

    class MenuFiguras{

        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int opcion;
            char letra;
            double altura, base, apotema, radio, resultado;

            do{

                System.out.println("Bienvenido al programa de calculo de areas y perimetros");
                System.out.println("Elija una de las siguientes opciones");
                System.out.println("1.Calcular area de un cuadrado");
                System.out.println("2.Calcular area de un triangulo equilatero");
                System.out.println("3.Calcular area de un circulo");
                System.out.println("4.Calcular area de un rectangulo");
                System.out.println("5.Calcular area de un rombo");
                System.out.println("6.Calcular area de un hexagono");
                System.out.println("7.Calcular perimetro de un cuadro");
                System.out.println("8.Calcular perimetro de un triangulo equilatero");
                System.out.println("9.Calcular perimetro de un circulo");
                System.out.println("10.Calcular perimetro de un rectangulo");
                System.out.println("11.Calcular perimetro de un rombo");
                System.out.println("12.Calcular perimetro de un hexagono");

                opcion = entrada.nextInt();

                if (opcion <= 0 || opcion > 12){
                System.out.println("Introduce una opcion valida");

            }

                    switch(opcion){
                        case 1:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            if (base <= 0) {
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            
                            resultado = base*base;
                            System.out.println("El area es de: "+resultado);
                            }
                        break;

                        case 2:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            if (base <= 0 || altura <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else {
                            resultado = (base*altura)/2;
                            System.out.println("El area es de: "+resultado);
                            }
                        break;

                        case 3:
                            System.out.println("Ingresa el valor del radio");
                            radio = entrada.nextInt();
                            if (radio <= 0) {
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = 3.1416*(radio*radio);
                            System.out.println("El area es de: "+resultado);
                            }
                        break;

                        case 4:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            if (base <= 0 || altura <= 0) {
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = base*altura;
                            System.out.println("El area es de: "+resultado);
                            }
                        break;

                        case 5:
                            System.out.println("Ingresa el valor de la diagonal menor");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la diagonal mayor");
                            altura = entrada.nextInt();
                            if (base <= 0 || altura <= 0) {
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                                }
                                else{
                            resultado = (base*altura)/2;
                            System.out.println("El area es de "+ resultado);
                            }
                        break;

                        case 6:
                            System.out.println("Ingresa el valor del apotema");
                            apotema = entrada.nextInt();
                            System.out.println("ingresa el valor del perimetro");
                            base = entrada.nextInt();
                            if (apotema <= 0 || base <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else {
                            resultado = (apotema*base)/2;
                            System.out.println("El area es de "+resultado);
                            }
                        break;

                        case 7:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            if (base <= 0 ){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = base*4;
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;

                        case 8:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            if (base <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = base*3;
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;

                        case 9:
                            System.out.println("Ingresa el valor del radio");
                            radio = entrada.nextInt();
                            if (radio <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = 2*3.1415*radio;
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;

                        case 10:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out. println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            if (base <= 0 || altura <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = (base*2)+(altura*2);
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;

                        case 11:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            if (base <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = base*4;
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;

                        case 12:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            if (base <= 0){
                                System.out.println("Lo sentimos, solo se aceptan valores positivos");
                                break;
                            }
                            else{
                            resultado = base*6;
                            System.out.println("El perimetro es de "+ resultado);
                            }
                        break;
                    }

                    System.out.println("Si desea salir del programa presione 's' para salir");
                    System.out.println("Si desea repetir, ingrese cualquier caracter");
                    letra = entrada.next().charAt(0);

            }while(letra != 's' );

        }
      }
   