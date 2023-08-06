package herencia;

// la palabra reservado extends indica que es una herencia de la clase a la que extiende
public class Empleado extends Persona{

    // atrubutos
    String numeroLegajo;
    String cargo;
    double salario;

    public Empleado(){

    }

    // constructores
    public Empleado(int id, String dui, String nombre,
                    String apellido, String direccion, String telefono,
                    String numeroLegajo, String cargo, double salario
    ){
        // el metodo super() nos permite pasar atributos a la clase padre de cual hereda o extiende la clase hija
        super(id, dui, nombre, apellido, direccion, telefono);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
        this.salario = salario;
    }

    // metodos

    // mostrar los datos
    public void mostrarDatos(double salarioCalculado, String decuento){
        decuento = decuento.toUpperCase();
        System.out.println("----EMPLEADO----");
        System.out.println("Id: " + id);
        System.out.println("DUI: " + dui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero legajo: " + numeroLegajo);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Descuento: " + (decuento.equals("S") ? "SI" : "NO"));
        System.out.println("Salario neto: " + salarioCalculado);
    }

    public double carcularSalarioIVA(double salario){
        final double IVA = 13; // El IVA equivale al 13%
        double descuento = salario * (IVA / 100);
        return salario - descuento;
    }

    // getters and setters
    public String getNumeroLegajo(){
        return this.numeroLegajo;
    }

    public void setNumeroLegajo(String numeroLegajo){
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
