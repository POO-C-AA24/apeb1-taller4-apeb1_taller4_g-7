import java.util.Scanner;
public class producto {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double precio;
        int cantidad;
        double descuento;
        double precioFinal;
        
        System.out.println("Ingrese el precio del Producto :");
        precio=entrada.nextDouble();
        
        System.out.println("Ingrese la cantidad de Productos :");
        cantidad=entrada.nextInt();
        
        VentaProducto venta = new VentaProducto(precio,cantidad); 
             
        
        venta.calcularDescuento();
        venta.getPrecioFinal();
         descuento = venta.getDescuento();
         precioFinal=venta.getPrecioFinal();
         System.out.println(venta.toString());
    }
    
}


