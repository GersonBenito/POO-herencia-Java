package herencia;

// la pabra reservado extends hace referencia a la herencia que tendra la clase hija de la clase padre
public class Consultor extends Persona{

    // atributtos
    int idConsultora;
    String nombreConsultora;

    // constructores
    public Consultor(){

    }

    public Consultor(int id, String dui, String nombre,
                     String apellido, String direccion,
                     String telefono, int idConsultora, String nombreConsultora
    ){
        // metodo super para usar los atributos de la clase padre de la cula hereda la clase hija
        super(id, dui, nombre, apellido, direccion, telefono);
        this.idConsultora = idConsultora;
        this.nombreConsultora = nombreConsultora;
    }

    // metodos

    public void mostrarDatos(){
        System.out.println("----CONSULTOR----");
        System.out.println("Id: " + id);
        System.out.println("DUI: " + dui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Id Consultora: "+ idConsultora);
        System.out.println("Nombre consultora: " + nombreConsultora);
    }

    // getters and setters
    public int getIdConsultora(){
        return this.idConsultora;
    }

    public void setIdConsultora(int idConsultora){
        this.idConsultora = idConsultora;
    }

    public String getNombreConsultora(){
        return this.nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora){
        this.nombreConsultora = nombreConsultora;
    }
}
