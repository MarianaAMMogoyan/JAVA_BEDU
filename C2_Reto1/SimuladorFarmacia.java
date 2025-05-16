package C2_Reto1;

public class SimuladorFarmacia {
    // Atributos
    private String nombreMedicamento;
    private double precioUnitario;
    private int cantidad;

    // Constructor
    public SimuladorFarmacia(String nombreMedicamento, double precioUnitario, int cantidad) {
        this.nombreMedicamento = nombreMedicamento;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    // Métodos de cálculo
    public double calcularTotalSinDescuento() {
        return precioUnitario * cantidad;
    }

    public boolean aplicaDescuento() {
        return calcularTotalSinDescuento() > 500;
    }

    public double calcularDescuento() {
        return aplicaDescuento() ? calcularTotalSinDescuento() * 0.15 : 0.0;
    }

    public double calcularTotalConDescuento() {
        return calcularTotalSinDescuento() - calcularDescuento();
    }

    // Método para mostrar el resumen
    public void mostrarResumen() {
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + calcularTotalSinDescuento());
        System.out.println("¿Aplica descuento?: " + aplicaDescuento());
        System.out.println("Descuento: $" + calcularDescuento());
        System.out.println("Total a pagar: $" + calcularTotalConDescuento());
    }
}

