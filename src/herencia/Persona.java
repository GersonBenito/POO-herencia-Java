package herencia;

public class Persona {

    // atributos
    int id;
    String dui;
    String nombre;
    String apellido;
    String direccion;
    String telefono;

    // constructores
    public Persona(){

    }

    public Persona(int id, String dui, String nombre, String apellido, String direccion, String telefono){
        this.id = id;
        this.dui = dui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // metodos

    // getters and setters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDui(){
        return this.dui;
    }

    public void setDui(String dui){
        this.dui = dui;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
