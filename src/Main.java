import herencia.Consultor;
import herencia.Empleado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tipoPersona = 0;

        // solicitar datos por teclado usando la clase Scanner
        System.out.println("*********** MENU *************");
        System.out.println("* [1] Empleado               *");
        System.out.println("* [2] Consultor              *");
        System.out.println("******************************\n");
        System.out.println("Ingrese un numero del menu:");
        tipoPersona = scanner.nextInt();

        // verificar que tipo de persona se selecciono
        if(tipoPersona == 1){
            obtenerDatosEmpleado(scanner);
        }else if(tipoPersona == 2){
            obtenerDatosConsultora(scanner);
        }else{
            System.out.println("Debes de ingresar una de las opciones del menu");
            scanner.close();
        }
    }

    public static void obtenerDatosEmpleado(Scanner scanner){

        // creamos un instancia de la clase Empleado
        Empleado empleado = new Empleado();

        String calcularSalario = "";

        System.out.println("******** DATOS EMPLEADO ***********\n");

        System.out.println("Ingrese el id:");
        empleado.setId(scanner.nextInt());

        // saltar al siguiente ingreso de datos usando nextLine()
        scanner.nextLine();

        System.out.println("Ingrese el DUI:");
        empleado.setDui(scanner.nextLine());
        System.out.println("Ingrese el nombre:");
        empleado.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido:");
        empleado.setApellido(scanner.nextLine());
        System.out.println("Ingrese la direccion:");
        empleado.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el telefono:");
        empleado.setTelefono(scanner.nextLine());
        System.out.println("Ingres el numero legajo:");
        empleado.setNumeroLegajo(scanner.nextLine());
        System.out.println("Ingrese el cargo:");
        empleado.setCargo(scanner.nextLine());
        System.out.println("Ingresa el salario:");
        empleado.setSalario(scanner.nextDouble());
        System.out.println("Desea agregar decuento de ISSS [S/N]: ");
        calcularSalario = scanner.next();

        // verificar si desdea calcular el salario con descuento de IVA
         double salarioFinal = validarSeleccion(calcularSalario, empleado);

        // mostrar los datos del empleado
        empleado.mostrarDatos(salarioFinal, calcularSalario);

        scanner.close();
    }

    public static void obtenerDatosConsultora(Scanner scanner){

        // creamos una nueva instancia de la clase consultor
        Consultor consultor = new Consultor();

        System.out.println("******** DATOS CONSULTOR ***********\n");

        System.out.println("Ingrese el id:");
        consultor.setId(scanner.nextInt());

        // saltar al siguiente ingreso de datos usando nextLine()
        scanner.nextLine();

        System.out.println("Ingrese el DUI:");
        consultor.setDui(scanner.nextLine());
        System.out.println("Ingrese el nombre:");
        consultor.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido:");
        consultor.setApellido(scanner.nextLine());
        System.out.println("Ingrese la direccion:");
        consultor.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el telefono:");
        consultor.setTelefono(scanner.nextLine());
        System.out.println("Ingres el id de la consultora:");
        consultor.setIdConsultora(scanner.nextInt());

        // saltar al siguiente ingreso de datos usando nextLine()
        scanner.nextLine();

        System.out.println("Ingrese el nombre de la consultora:");
        consultor.setNombreConsultora(scanner.nextLine());

        // mostrar los datos de la consultora
        consultor.mostrarDatos();

        scanner.close();

    }

    public static double validarSeleccion(String tipoSeleccion, Empleado empleado){

        tipoSeleccion = tipoSeleccion.toUpperCase();

        if(tipoSeleccion.equals("S")){
            return empleado.descuentoISSS(empleado.getSalario());
        }else{
            return empleado.getSalario();
        }

    }

}