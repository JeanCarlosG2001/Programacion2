public class Reserva {
    // Atributos encapsulados
    private String nombreCliente;
    private int numeroDiasEstadia;
    private String tipoHabitacion;
    private String estadoReserva;  // Confirmada o Cancelada

    // Constructor para inicializar los atributos
    public Reserva(String nombreCliente, int numeroDiasEstadia, String tipoHabitacion, String estadoReserva) {
        this.nombreCliente = nombreCliente;
        this.numeroDiasEstadia = numeroDiasEstadia;
        this.tipoHabitacion = tipoHabitacion;
        this.estadoReserva = estadoReserva;
    }


        // Metodos getter y setters
        public String getNombreCliente () {
        return nombreCliente;}

        public void setNombreCliente (String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

        public int getNumeroDiasEstadia () {
        return numeroDiasEstadia;}

        public void setNumeroDiasEstadia ( int numeroDiasEstadia){
        this.numeroDiasEstadia = numeroDiasEstadia;
    }

        public String getTipoHabitacion () {
        return tipoHabitacion;}

        public void setTipoHabitacion (String tipoHabitacion){
        this.tipoHabitacion = tipoHabitacion;
    }

        public String getEstadoReserva () {
        return estadoReserva;}

        public void setEstadoReserva (String estadoReserva){
        this.estadoReserva = estadoReserva;
    }
        //Fin de Metodos getter y setters
        //-------------------------------------------------------------------------------------------



    // Metodo para mostrar información de la reserva
    public void mostrarInformacionReserva() {
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Número de días de estadía: " + numeroDiasEstadia);
        System.out.println("Tipo de habitación: " + tipoHabitacion);
        System.out.println("Estado de la reserva: " + estadoReserva);
    }
}
