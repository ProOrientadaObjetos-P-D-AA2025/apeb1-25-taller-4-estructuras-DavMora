
package GestionEmpresa;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        String opcion;

        while (continuar) {
            System.out.println("Ingrese los datos del empleado:");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            System.out.print("Salario base: ");
            double salario = teclado.nextDouble();

            Empleado emp = new Empleado(nombre, salario, edad);
            teclado.nextLine();

            System.out.println("Desea aplicar aumento al salario? (S/N): ");
            String aplicar = teclado.nextLine();

            if (aplicar.equalsIgnoreCase("S")) {
                System.out.print("Ingrese el porcentaje de aumento: ");
                double porcentaje = teclado.nextDouble();
                double nuevoSalario = emp.getSalario() * (1 + porcentaje / 100);
                emp.setSalario(nuevoSalario);
                teclado.nextLine();
            }

            emp.calcularPagoMensual();

            System.out.println("\nResumen del empleado:");
            emp.mostrarInformacion();

            System.out.println("\nDesea ingresar otro empleado? (S/N): ");
            opcion = teclado.nextLine();

            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
                System.out.println("Fin del programa.");
            }
        }

        teclado.close();
    }
}