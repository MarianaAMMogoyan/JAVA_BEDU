package C1_Reto2;

public record Entrada_Record(String nombreEvento, double precioEntrada) {

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}
