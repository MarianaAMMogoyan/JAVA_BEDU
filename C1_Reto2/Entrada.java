package C1_Reto2;
/* Objetivo: Desarrollar un programa en Java que permita registrar la información básica de 
 * entradas para eventos, aplicando los fundamentos de clases, objetos, atributos, métodos 
 * y el uso de constructores.
 */
public class Entrada {
	// Atributos
    private String nombreEvento;
    private double precioEntrada;
    
    // Constructor
    /* Un constructor es un bloque especial de código que se ejecuta automáticamente cuando se crea un nuevo
     * objeto de una clase. Sirve para inicializar los atributos de ese objeto con valores específicos.
     */
    public Entrada(String nombreEvento, double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }
    
    //Metodo publico
    public void mostrarInformacion() {
        System.out.println("Evento: "+ nombreEvento + " | Precio: " + precioEntrada);
    }
}
