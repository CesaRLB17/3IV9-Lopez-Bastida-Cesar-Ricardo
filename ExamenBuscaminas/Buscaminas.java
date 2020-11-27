import java.util.*;
//Se declara que la clase se extiende de una clase padre
public class Buscaminas extends Herencia{
    //se declara el constructor
    public Buscaminas(){
    }
    //acceso a las variables de herencia
    public Buscaminas(String nombre, String usuario, int ID){
        super(nombre,usuario,ID);
    }
    //se declara el scanner
    Scanner entrada = new Scanner (System.in);
    //metodo para invocar al juego (dificultad facil)
    //juego basado en el de Mitchel Hdz ((2016))
	public void juego(){
		
		//se crea un array, de 215x15, el cual sera nuesto "Tablero", aunque no se representara graficamente
		int tablero [][]= new int[15][15];
		double w=0;
  		double z=0;
		int ntminas=0;
		int intento=75;
		int tminas=10;
		
		for(int j=0;j<15;j++)
			for (int i=0;i<15;i++)
				tablero [j][i]=0;
		
		do  {  
            //se usa math randmon para que la pocision en la que se encuentran las minas sea diferente
     			w=Math.random()*15;
        		z=Math.random()*15;  
           		w=(int)w;
           		z=(int)z;
           		if  (z!=0 && w!=0 && z!=15-1 && w!=15-1){
             	tablero[(int)w][(int) z ]=1;
              	ntminas++;
           			}
       		}while (ntminas<=10);
       
               //se hace uso de la herencia
        System.out.println("\n****************************************************************");
        System.out.println("\nHola "+getUsuario()+"                                          *");
        System.out.println("\nSuerte "+getNombre()+"                                          *");
        System.out.println("\nTu ID es: "+getID()+"                                          *");
        System.out.println("\n****************************************************************");
       	System.out.println("  Ingresa una coordenada, seleccionando dos numeros del 1 al 15");
       	do {
       		int x=0,y=0;            //por este medio se repetira el programa en 0 cada turno
       		int nminas = 0;
       		
       		do{
       			 System.out.println("\n-******************************************************");
       			 System.out.println("\n	Intento :"+intento+" , Ingrese una coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=entrada.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=entrada.nextInt();
       			 
       			 if(x==0 || y==0 || x>15 || y>15)
       			 	System.out.println("\n	==>Ojo a la comedia<== \n");
       		}while (x==0 || y==0 || x>15 || y>15);
       		
       		x=x-1;
       		y=y-1;
       		if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<15 && y<15)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<15 && y<15)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<15 && y<15)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{
       				
       					if(x-1>=0 && x-1<15 && y-1<15)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<15 && y-1<15)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<15 && y-1<15)
       						nminas=nminas+tablero [x+1][y-1];
       					if(x+1>=0 && x+1<15 && y<15)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<15 && y<15)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("\n	Mina no encontrada. ");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	Alrededor hay: "+ nminas);
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Acertaste!, Mina Eliminada Restan "+tminas+" Minas");
       				System.out.println("\n	Intentos restantes: "+(intento-1));
       			}
       	
          intento=intento-1;
      }while (intento>=tminas && intento>0 && tminas>0);	
 	   
       	if(tminas==0)
       		Victoria();
       	
       	if(tminas>intento)
       		Derrota();
       	
       	if(intento==0)
       		Derrota2();
        }
        public void Derrota(){
            System.out.println("Perdiste, ");
        }
        public void Derrota2(){
            System.out.println("Perdiste, te quedaste sin intentos :(");
        }
        public void Victoria(){
            System.out.println("Felicidades, desactivaste todas las minas");
		}
	}
       
       
       
    