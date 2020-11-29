import java.util.*;

public class Buscaminas extends Herencia{
  
    public Buscaminas(){
    }
 
    public Buscaminas(String nombre, String usuario, int ID){
        super(nombre,usuario,ID);
    }

	Scanner entrada = new Scanner (System.in);
	
	public void juego(){
		
		
		int tablero [][]= new int[15][15];
		double w=0;
  		double z=0;
		int ntminas=0;
		int intento=50;
		int tminas=10;
		
		for(int j=0;j<15;j++)
			for (int i=0;i<15;i++)
				tablero [j][i]=0;
		
		do  {  
           
     			w=Math.random()*15;
        		z=Math.random()*15;  
           		w=(int)w;
           		z=(int)z;
           		if  (z!=0 && w!=0 && z!=15-1 && w!=15-1){
             	tablero[(int)w][(int) z ]=1;
              	ntminas++;
           			}
       		}while (ntminas<=10);
       
		System.out.println("******************************************************************")
        System.out.println("\nHola "+getUsuario()+"                                          *");
        System.out.println("\nDa lo mejor de ti " +getNombre()+"                             *");
        System.out.println("\nTu ID es: "+getID()+"                                          *");	
		System.out.println("******************************************************************")
		System.out.println("  Ingresa la coordenada en la que desees probar suerte, tienes del 1 al 15 de columnas y filas");
       	do {
       		int x=0,y=0;          
       		int nminas = 0;
       		
       		do{
       			 System.out.println("\n	Intento :"+intento+" , Ingrese una coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=entrada.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=entrada.nextInt();
       			 
       			 if(x==0 || y==0 || x>15 || y>15)
       			 	System.out.println("\nLa coordenada no existe \n");
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
       				System.out.println("\n	Haz desactivado una bomba! Te quedan "+tminas+" Minas");
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
            System.out.println("Perdiste, no te quedan más intentos, :c");
        }
        public void Victoria(){
            System.out.println("Victoria! Haz desactivado todas las minas");
		}
	}
       
       
       
    