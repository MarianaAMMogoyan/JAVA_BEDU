package C5_Reto2;

// Clase concreta que representa un pago con tarjeta
public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoDisponible;

    // Constructor para asignar monto e inicializar saldo
    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    // Implementación del método autenticar: verifica si hay saldo suficiente
    @Override
    public boolean autenticar() {
        if (saldoDisponible >= monto) {
            System.out.println("✅ Autenticación exitosa.");
            return true;
        } else {
            System.out.println("❌ Fondos insuficientes.");
            return false;
        }
    }

    // Implementación del procesamiento del pago
    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
