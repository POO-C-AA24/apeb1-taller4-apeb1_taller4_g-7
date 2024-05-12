
public class Empleado {
private String nombre;
     double salario;
     int edad;
     static Empleado[] empleados = new Empleado[100]; // Arreglo para almacenar empleados
    private static int numEmpleados = 0; // Contador de empleados

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Edad: " + edad);
        System.out.println();
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentajeAumento) {
        salario += salario * (porcentajeAumento / 100);
    }

    public static void agregarEmpleado(String nombre, double salario, int edad) {
        if (numEmpleados < 100) {
            empleados[numEmpleados++] = new Empleado(nombre, salario, edad);
            System.out.println("Empleado agregado con exito");
        } else {
            System.out.println("No se pueden agregar más empleados. Limite alcanzado");
        }
    } 

    public static void mostrarInformacionEmpleados() {
        System.out.println("Informacion de los empleados:");
        for (int i = 0; i < numEmpleados; i++) {
            empleados[i].mostrarInformacion();
        }
    }

    public static void calcularAumentoSalarial(double porcentajeAumento) {
        double totalSalario = 0;
        for (int i = 0; i < numEmpleados; i++) {
            totalSalario += empleados[i].getSalario();
        }
        double salarioPromedio = totalSalario / numEmpleados;

        System.out.println("Nuevos salarios:");
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getSalario() < salarioPromedio) {
                empleados[i].aumentarSalario(porcentajeAumento);
                System.out.println(empleados[i].getSalario());
            }
        }
    }
}

