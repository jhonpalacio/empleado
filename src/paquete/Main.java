package paquete;


public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Empleado
        Empleado empleado = new Empleado("Juan", 30, 2000.0);

        // Imprimir los detalles del empleado
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: " + empleado.getSalario());

        // Modificar la edad y el salario del empleado
        empleado.setEdad(31);
        empleado.setSalario(2200.0);

        // Imprimir los nuevos detalles del empleado
        System.out.println("Nueva Edad: " + empleado.getEdad());
        System.out.println("Nuevo Salario: " + empleado.getSalario());
    }
}