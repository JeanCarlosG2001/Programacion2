/*Enunciado 2:
Registro de una Reserva de Hotel

    Desarrolla un sistema que gestione una única reserva en un hotel.
    La reserva debe incluir el nombre del cliente, número de días de la estadía,
    tipo de habitación (individual, doble o suite) y el estado de la reserva (confirmada o cancelada).
    El sistema debe permitir crear una reserva, mostrar la información de la reserva y actualizar su estado.
    Requerimientos:Implementa una clase para la reserva con sus atributos y métodos.
    Usa un constructor para inicializar los atributos de la reserva. Aplica encapsulamiento para los atributos.
     La entrada y salida de datos se debe realizar por consola, permitiendo crear la reserva y modificar su estado.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario para crear la reserva
            System.out.println("Ingrese el nombre del cliente:");
            String nombreCliente = sc.nextLine();

            System.out.println("Ingrese el número de días de estadía:");
            int numeroDiasEstadia = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea

            System.out.println("Ingrese el tipo de habitación (individual, doble, suite):");
            String tipoHabitacion = sc.nextLine();

            System.out.println("Ingrese el estado de la reserva (confirmada, cancelada):");
            String estadoReserva = sc.nextLine();



        // Crear la reserva con los datos ingresados
        Reserva reserva = new Reserva(nombreCliente, numeroDiasEstadia, tipoHabitacion, estadoReserva);

        // Mostrar la información de la reserva creada
        System.out.println("\nInformación de la reserva:");
        reserva.mostrarInformacionReserva();

        // Permitir al usuario actualizar el estado de la reserva
        System.out.println("\n¿Desea actualizar el estado de la reserva? (sí/no)");
        String respuesta = sc.nextLine();



        if (respuesta.equalsIgnoreCase("sí")) {
            System.out.println("Ingrese el nuevo estado de la reserva (confirmada, cancelada):");
            String nuevoEstado = sc.nextLine();
            reserva.setEstadoReserva(nuevoEstado);

            System.out.println("\nEstado de la reserva actualizado:");
            reserva.mostrarInformacionReserva();
        }

        sc.close();
    }
}
