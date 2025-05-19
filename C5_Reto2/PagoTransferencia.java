package C5_Reto2;

// Clase concreta que representa un pago por transferencia bancaria
public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionExitosa;

    // Constructor para definir el monto y simular validación externa (true o false)
    public PagoTransferencia(double monto, boolean validacionExitosa) {
        super(monto);
        this.validacionExitosa = validacionExitosa;
    }

    // Implementación de autenticación (simula si fue exitosa)
    @Override
    public boolean autenticar() {
        if (validacionExitosa) {
            System.out.println("✅ Autenticación exitosa.");
            return true;
        } else {
            System.out.println("❌ Fallo de autenticación. Transferencia no válida.");
            return false;
        }
    }

    // Lógica específica del procesamiento
    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia bancaria por $" + monto);
    }
}
