
 class VentaProducto {
 double precio;
 int cantidad;
 double descuento;
 double precioFinal;

public VentaProducto(double precio, int cantidad){
    this.precio=precio;
    this.cantidad=cantidad;
}
public void calcularDescuento(){
    if (precio>=1000 && cantidad >=10) {
        descuento=0.10 *precio;
    }else {
         descuento = 0.05*precio;
    }  
  }
 public void calcularPrecioFinal(){
     precioFinal=precio-descuento;
 }
 public double getDescuento() {
     return descuento;
 }
  public double getPrecioFinal() {
     return precioFinal;
 }

    @Override
    public String toString() {
        return "VentaProducto{" + "precio=" + precio + ", cantidad=" + cantidad + ", descuento=" + descuento + ", precioFinal=" + precioFinal + '}';
    }
  
}    

