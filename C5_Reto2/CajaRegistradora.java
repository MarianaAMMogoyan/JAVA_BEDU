
package C5_Reto2;

public class CajaRegistradora {
    public static void main(String[] args) {
        // Crear arreglo de tipo MetodoPago, usando polimorfismo
        MetodoPago[] pagos = new MetodoPago[3];

        // Agregamos instancias concretas (cada una implementa Autenticable)
        pagos[0] = new PagoEfectivo(150.0); // Siempre válido
        pagos[1] = new PagoTarjeta(320.0, 500.0); // Tiene saldo suficiente
        pagos[2] = new PagoTransferencia(200.0, false); // Fallará validación

        // Recorrer cada pago
        for (MetodoPago pago : pagos) {
            // Verificamos si el objeto implementa la interfaz Autenticable
            if (pago instanceof Autenticable) {
                Autenticable a = (Autenticable) pago;
                if (a.autenticar()) {
                    pago.procesarPago();
                    pago.mostrarResumen(pago.getClass().getSimpleName());
                }
            }
        }
    }
}
