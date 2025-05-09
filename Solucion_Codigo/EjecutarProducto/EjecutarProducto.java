package EjecutarProducto;



import java.util.Scanner;

public class EjecutarProducto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        String opcion;

        while (continuar) {
            System.out.println("Ingrese el precio del producto:");
            double precio = teclado.nextDouble();

            System.out.println("Ingrese la cantidad de productos:");
            int cantidad = teclado.nextInt();

            Producto producto = new Producto(precio, cantidad);
            producto.calcularPrecioFinal();

            System.out.println("----- Resumen de la compra -----");
            System.out.println("Precio unitario: $" + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Descuento aplicado: " + (producto.getDescuento() * 100) + "%");
            System.out.println("Precio final: $" + producto.getPrecioFinal());

            teclado.nextLine(); 
            System.out.println("Desea ingresar otro producto? (S/N): ");
            opcion = teclado.nextLine();

            if (opcion.equals("N")) {
                continuar = false;
            }
        }
    
    }
}