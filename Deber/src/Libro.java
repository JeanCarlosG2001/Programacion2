 public class Libro {
    // Atributos privados para encapsulamiento
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean estado;  // true = disponible, false = prestado

    // Constructor para inicializar el libro
    public Libro(String titulo, String autor, int anioPublicacion, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    // Metodo para mostrar la informacion del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Estado: " + (estado ? "Disponible" : "Prestado"));
    }

    // Metodo para actualizar el estado del libro
    public void actualizarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Metodo para modificar los atributos del libro
    public void modificarAtributos(String nuevoTitulo, String nuevoAutor, int nuevoAnio) {
        this.titulo = nuevoTitulo;
        this.autor = nuevoAutor;
        this.anioPublicacion = nuevoAnio;

    }
}

