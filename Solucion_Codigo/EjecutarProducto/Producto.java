
package EjecutarProducto;

public class Producto {
    private double precio;
    private int cantidad;
    private double descuento;
    private double precioFinal;


    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = 0;
        this.precioFinal = 0;
    }

   
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

   
    public void calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            descuento = 0.10;
        } else if (precio < 1000) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }
    }

   
    public void calcularPrecioFinal() {
        double total = precio * cantidad;
        calcularDescuento();
        precioFinal = total - (total * descuento);
    }
}