import java.util.Scanner;
public class Arreglos{

    Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        char elige;


        Scanner entrada = new Scanner(System.in);
        Arreglos opciones = new Arreglos();


        System.out.println("Este programa fue hecho por:");
        System.out.println("3IV9 Lopez Bastida Cesar Ricardo"); 
        System.out.println("");

        do{opciones.menu();

        System.out.println("¿Deseas volver al menu? Si es asi escriba la letra r.");
        System.out.println("Si deseas salir, ingrese cualquier caracter.");

        elige = entrada.next().charAt(0);

        }while (elige == 'r');
    }

    public void menu(){

      int opcion;
      char repetir;
      int [] array = new int [10];

        Arreglos xd = new Arreglos();

          System.out.println("MENU");
          System.out.println("1. Arreglos || Negativos y positivos");
          System.out.println("2. Arreglos || Pares");
          System.out.println("3. Arreglos || Calificaciones");
          System.out.println("4. Arreglos || Matriz");
          System.out.println("5. Arreglos || Salir");
          System.out.println("");


          System.out.print("Elija el programa que desee ejecutar: ");
          System.out.println("");


      opcion = entrada.nextInt();

      if (opcion<1||opcion>5){
             System.out.println("No tenemos esa opcion disponible, por favor ingrese una opcion valida");
        }

        switch (opcion){

        case 1:

          do{

            array = combo(array);
            xd.prom_positivos(array);
            xd.prom_negativos(array);

            System.out.println("Si desea repetir el programa, escriba 'r'. Si no, ingrese cualquier caracter.");

            repetir = entrada.next().charAt(0);
            
            }while (repetir == 'r');

        break;

        case 2:
          do{

            array = combo(array);
            xd.pares(array);

            System.out.println("Si desea repetir el programa, escriba 'r'. Si no, ingrese cualquier caracter.");

            repetir = entrada.next().charAt(0);
          
          }while (repetir == 'r');

        break;

        case 3:
          do{

          float promedio;
          float [] array2 = new float [10];

            array2 = combo2(array2);
            xd.calif(array2);
            promedio = pon_calif(array2);
            xd.mayor_menor(array2);
            xd.up_prom(array2, promedio);
            xd.aprob_reprob(array2);

            System.out.println("Si desea repetir el programa, escriba 'r'. Si no, ingrese cualquier caracter.");

            repetir = entrada.next().charAt(0);

        } while (repetir == 'r');

        break;

        case 4:

          do{
          
          int [][] MatrizA = new int [3][3];
          int [][] MatrizB = new int [3][3];
          char a='A';
          char b='B';

            MatrizA = combo3(MatrizA,a);
            MatrizB = combo3(MatrizB,b);
            xd.sumando_matrix(MatrizA,MatrizB);

            System.out.println("Si quieres repetir el programa, escribe 'r'. Si no, ingrese cualquier caracter.");

            repetir = entrada.next().charAt(0);

          }while (repetir == 'r');

        break;

        }
      }

        public int[] combo(int[] array){

        System.out.println(".Arreglo.");
        System.out.println("Digite 10 numeros");

        for (int i=0; i<array.length;i++){

            System.out.print("Valor de la casilla " + i + ": ");

            array [i] = entrada.nextInt();
        }
        return array;
      }
        public void prom_positivos(int[]array){
          float p=0;
          float elementos = 0;
          for (int i=0; i<array.length;i++){

            if (array[i]>0){
                p += array[i];
                elementos ++;

            } 
        }

        System.out.println("El promedio de los numeros positivos es: "+p/elementos);
    }
    
        public void prom_negativos(int[]array){
          float n=0;
          float elementos = 0;
          for (int i=0; i<array.length;i++){

            if (array[i]<0){
                n += array[i];
                elementos ++;
            } 
        }
        System.out.println("El promedio de los numeros negativos es: "+(n/elementos));
    }

        public void pares(int[]array){
          float p=0;
          float elementos = 0;
          for (int i=0; i<array.length;i++){

            float mod = i % 2;

            if (mod == 0){
                p += array[i];
                elementos ++;
            } 
        }
        System.out.println("El promedio de los pares es: "+(p/elementos));
    }

        public float[] combo2(float[] array2){

          System.out.println("Ingrese 10 calificaciones.");

          for (int i=0; i<array2.length;i++){

            System.out.print("Calificacion "+(i+1)+": ");

            array2 [i] = entrada.nextFloat();

        }
        return array2;
    }

        public void calif(float[] array2){

          System.out.println("Calificaciones");

          for (int i=0; i<array2.length;i++){

            System.out.println("Calificacion "+(i+1)+" = "+(array2 [i]));

        }
    }

        public float pon_calif(float[] array2){
          float c=0;
          for (int i=0; i<array2.length;i++){
          c += array2 [i]; 
        }
          float prom;
          prom = c/array2.length;

            System.out.println("El promedio de las calificaciones es: "+prom);

        return prom;
    }

        public void mayor_menor(float[] array2){
          float may= array2[0];
          float men= array2[0];

          for (int i=0; i<array2.length;i++){
              if (array2[i]>may){
              may = array2[i];

            }
              else if (array2[i]<men){
                  men = array2[i];
            }
        }

        System.out.println("La calificacion mayor es: "+may);
        System.out.println("La calificacion menor es: "+men);

    }

        public void up_prom(float[]array2, float promedio){
          int califs=0;

          for (int i=0; i<array2.length;i++){
              if (array2[i]>promedio){
                califs ++;
            }
        }

        System.out.println("El numero de calificaciones por arriba del promedio es: "+califs);
    }

        public void aprob_reprob(float[]array2){
          int apr=0;
          int repr=0;
          for (int i=0; i<array2.length;i++){

            if (array2[i]>6){
                apr ++;
            }

            else if (array2[i]<6){
                repr ++;

            }
        }

        System.out.println("Alumnos reprobados : " + repr + " :(" );

        System.out.println("Alumnos aprobados : " + apr + " :)");
    }

        public int[][] combo3(int[][]MatrizA, char a){

          System.out.println("Digite los valores de la Matriz "+a);

          for (int i=0; i<MatrizA.length; i++){
          for (int j=0; j<MatrizA[i].length;j++){

                System.out.print("Fila "+(i+1)+" Columna "+(j+1)+": ");

                MatrizA [i][j] = entrada.nextInt();
            }
        }
        return MatrizA;
    }

        public void sumando_matrix(int[][]MatrizA,int[][]MatrizB){
          int [][] MatrizF = new int [3][3];

          for (int i=0;i<MatrizF.length;i++){
            for (int j=0;j<MatrizF[i].length;j++){

            MatrizF[i][j]=MatrizA[i][j]+MatrizB[i][j];
        }
    }
        System.out.println("Matriz A");
        
        for (int i=0;i<MatrizA.length;i++){
        for (int j=0;j<MatrizA.length;j++){

        System.out.print(MatrizA[i][j]+" ");
        }

        System.out.println();

    } 

        System.out.println("Matriz B");
        
        for (int i=0;i<MatrizB.length;i++){
          
        for (int j=0;j<MatrizB.length;j++){

        System.out.print(MatrizB[i][j]+" ");
        }

        System.out.println();
    } 

        System.out.println("Matriz Final");
        System.out.println("La suma Total de la Matriz A y B");

        for (int i=0;i<MatrizF.length;i++){
        for (int j=0;j<MatrizF.length;j++){
        
        System.out.print(MatrizF[i][j]+" ");
        }

        System.out.println();
    }
  }

}