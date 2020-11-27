public class Herencia{ //creo la clase que contendra a los getters y los stetters
    //declaro las variables
    private String nombre, usuario;
    private int ID;
    
    //Declaro el builder
    public Herencia(){
    }
    

    public Herencia(String nombre, String usuario, int ID){
        this.nombre = nombre;
        this.usuario = usuario;
        this.ID = ID;
    }


    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(int puesto){
        this.usuario = usuario;   
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getID(){
        return ID;
    }

    public void setID(){
        this.ID = ID;
    }
    
}
