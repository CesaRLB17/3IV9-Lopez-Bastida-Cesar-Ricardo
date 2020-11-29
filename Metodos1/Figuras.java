import java.util.Scanner;

public class Figuras{ 
    Scanner entrada = new Scanner(System.in);
        
    int opcion;
    double perimetro, area, radio, base, altura, ladoa, ladob;
    
    public void Operaciones(){

        System.out.println("Seleccione una figura para calcular su area y perimetro");
        System.out.println("1.- Circulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Cuadrado");
        System.out.println("4.- Triangulo");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                Circulo();
            break;

            case 2:
                Rectangulo();
            break;
            
            case 3:
                Cuadrado();
            break;

            case 4:
                Triangulo();
            break;
        }
    }
    public void Circulo(){
        System.out.println("Digite el radio del circulo");
        
        radio = entrada.nextDouble();
        perimetro = (2*Math.PI)*radio;
        area = Math.PI*(radio*radio);
        
        System.out.println("La circunferencia es: " + perimetro);
        System.out.println("El Area es: " + area);
    }
    public void Rectangulo(){
        System.out.println("Digite la base del rectangulo");
        
        base = entrada.nextDouble();
        
        System.out.println("Digite la altura del rectangulo");
        
        altura = entrada.nextDouble();
        perimetro = base*altura;
        area = 2*(base+altura);

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
    }
    public void Cuadrado(){
        System.out.println("Digite el valor de un lado del cuadrado");

        base = entrada.nextDouble();
        perimetro = base*4;
        area = base*base;

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
    public void Triangulo(){
        System.out.println("Digite la base del triangulo");
        
        base = entrada.nextDouble();

        System.out.println("Digite los lados restantes del triangulo");
        
        ladoa = entrada.nextDouble();
        ladob = entrada.nextDouble();

        System.out.println("Digite la altura del triangulo");
        
        altura = entrada.nextDouble();
        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
    }
}