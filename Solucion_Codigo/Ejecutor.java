
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        double porcentajeAumento;
        int edad;
        
        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar informacion de empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el salario del empleado: ");
                salario = scanner.nextDouble();
                System.out.print("Ingrese la edad del empleado: ");
                edad = scanner.nextInt();

                Empleado.agregarEmpleado(nombre, salario, edad);
            } else if (opcion == 2) {
                Empleado.mostrarInformacionEmpleados();
            } else if (opcion == 3) {
                System.out.print("Ingrese el porcentaje de aumento salarial: ");
                porcentajeAumento = scanner.nextDouble();

                Empleado.calcularAumentoSalarial(porcentajeAumento);
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Opción invalida. Por favor, seleccione otra opcion : .");
            }
        }

        scanner.close();
    }
}
