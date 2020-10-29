import java.util.Scanner;
class Pokedex{ 
    //Declaro la clase

    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in); //Declaro el Scaner
         int eleccion;
         int  Charmander;
         int  Bulbasor;
         int  Squartle;
         int vida1 = 100;
         int fuerza1 = 70;
         int ataquep1 = 40;
         int ataques1 = 30;
         int vida2 = 120;
         int  fuerza2 = 60;
         int ataquep2 = 30;
         int ataques2 = 25; 
         int vida3 = 150;
         int fuerza3 = 40;
         int ataquep3 = 20;       
         int ataques3 = 15;
         //Declaro las variables que voy a utilizar


        do{
            System.out.println("3IV9 Lopez Bastida Cesar Ricardo");
            System.out.println("Otaku bienvenido a la Pokedex");
         System.out.println("ELIGE UN POKEMON PARA CONSULTAR SUS DATOS");
         System.out.println("1. Charmander");
         System.out.println("2. Bulbasor");
         System.out.println("3. Squartle");
         System.out.println("4. Batalla pokemon");
         System.out.println("5. Salir");
eleccion = entrada.nextInt();


       switch (eleccion) { //Inicio la lista de casos

           case 1:
            System.out.println("Elijiste Charmander");
            System.out.println("ID: 38856");
            System.out.println("La defensa vida de tu pokemon es: "+vida1);
            System.out.println("La fuerza de tu pokemon: "+fuerza1);
            System.out.println("El ataque principal de tu pokemon es: "+ataquep1);
            System.out.println("El ataque secundario de tu pokemon es: "+ataques1);
         
               break;
           case 2:
             System.out.println("Elijiste Bulbasaur");
             System.out.println("ID: 47476");
             System.out.println("La defensa vida de tu pokemon es: "+vida2);
             System.out.println("La fuerza de tu pokemon: "+fuerza2);
              System.out.println("El ataque principal de tu pokemon es: "+ataquep2);
             System.out.println("El ataque secundario de tu pokemon es: "+ataques2);

              break;
case 3: 
             System.out.println("Elijiste Squirtle");
             System.out.println("ID: 98975");
             System.out.println("La defensa vida de tu pokemon es: "+vida3);
             System.out.println("La fuerza de tu pokemon: "+fuerza3);
              System.out.println("El ataque principal de tu pokemon es: "+ataquep3);
             System.out.println("El ataque secundario de tu pokemon es: "+ataques3);
     
              break; 
           case 4:

           break;
           case 5:
            default:
               break;

       } 
        }while (eleccion != 5); 


    } 
}



    