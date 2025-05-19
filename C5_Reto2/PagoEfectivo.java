package C5_Reto2;

// Esta clase concreta hereda de MetodoPago e implementa la interfaz Autenticable
public class PagoEfectivo extends MetodoPago implements Autenticable {

    // Constructor para inicializar el monto
    public PagoEfectivo(double monto) {
        super(monto);
    }

    // Implementación del método de autenticación (en efectivo siempre es válida)
    @Override
    public boolean autenticar() {
        return true;
    }

    // Lógica de procesamiento del pago en efectivo
    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
