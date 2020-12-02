public class Libro{
    
    private String titulo,autor;
    private int noLibro,noSolicitados;

    public Libro(){
        this.titulo = titulo;
        this.autor = autor;
        this.noLibro = noLibro;
        this.noSolicitados = noSolicitados;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setNoLibro(int noLibro){
        this.noLibro = noLibro;
    }
    public int getNoLibro(){
        return noLibro;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setNoSolicitados(int noSolicitados){
        this.noSolicitados = noSolicitados;
    }
    public int getNoSolicitados(){
        return noSolicitados;
    }
}
