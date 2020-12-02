public class Libros extends Libro{
    private int rLibro,rSolicitados;
    public Libros(){}
    public void random(){
        rLibro = ((int)Math.round(Math.random()*20));
        do{
            rSolicitados = ((int)Math.round(Math.random()*20));
        }while(rSolicitados>rLibro);
        setNoLibro(rLibro);
        setNoSolicitados(rSolicitados);
    }
}
