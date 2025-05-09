package GestionEmpresa;

public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    private double comision;
    private double pagoMensual;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.comision = 200;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public int getEdad() {
        return edad;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void calcularPagoMensual() {
        pagoMensual = salario + comision;
    }

    public void mostrarInformacion() {
        System.out.printf("Nombre: %s | Edad: %d | Pago mensual: $%.2f%n", nombre, edad, pagoMensual);
    }
}