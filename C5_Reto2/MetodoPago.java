package C5_Reto2;

// Clase abstracta que sirve como base para todos los métodos de pago
public abstract class MetodoPago {
    protected double monto; // Protegido para acceso desde subclases

    // Constructor para inicializar el monto
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Método abstracto que cada clase hija deberá implementar con su propia lógica
    public abstract void procesarPago();

    // Método concreto común a todas las clases hijas: imprime un resumen
    public void mostrarResumen(String tipo) {
        System.out.println("📄 Tipo: " + tipo + " - Monto: $" + monto);
    }
}


