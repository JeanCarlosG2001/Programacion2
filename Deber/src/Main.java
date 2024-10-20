/*
Enunciado 1: Gestión de un Libro

Crea un programa para gestionar la información de un solo libro.
El libro debe tener atributos como título, autor, año de publicación y estado (disponible o prestado).
El sistema debe permitir mostrar la información del libro, actualizar su estado (cuando se presta o devuelve)
y cambiar sus atributos.
Requerimientos: Implementa una clase que represente el libro con sus atributos y métodos.
 Usa un constructor para inicializar los atributos del libro. Utiliza encapsulamiento para proteger los atributos.
 La entrada y salida de datos debe ser por consola, permitiendo crear el libro y actualizar su información.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de un libro
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, true);

        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Libros\n " +
                    "1. Mostrar información del libro\n " +
                    "2. Prestar libro\n " +
                    "3. Devolver libro \n " +
                    "4. Modificar atributos del libro\n " +
                    "5. Salir\n " +
                    "Elija una opción: ");


            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1://Mostrar información del libro
                    libro.mostrarInformacion();
                    break;
                case 2://Prestar libro
                    libro.actualizarEstado(false);  // Prestado
                    System.out.println("El libro ha sido prestado.");
                    break;
                case 3://Devolver libro
                    libro.actualizarEstado(true);  // Disponible
                    System.out.println("El libro ha sido devuelto.");
                    break;
                case 4://Modificar atributos del libro
                    System.out.print("Ingrese el nuevo título: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Ingrese el nuevo autor: ");
                    String nuevoAutor = scanner.nextLine();
                    System.out.print("Ingrese el nuevo año de publicación: ");
                    int nuevoAnio = scanner.nextInt();
                    libro.modificarAtributos(nuevoTitulo, nuevoAutor, nuevoAnio);
                    System.out.println("Los atributos del libro han sido modificados.");
                    break;
                case 5://Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default://error
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
