package C4_Reto1;

import java.util.Objects;

//Objetivo: Modelar facturas emitidas para un sistema contable, reforzando el uso de constructores, equals(), hashCode() y toString().
public class Factura {
	String folio;
	String cliente;
	double total;

	//Modela un constructor
	public Factura (String folio, String cliente, double total) {
		this.folio= folio;
		this.cliente= cliente;
		this.total= total;
	}
    
	// Sobrescribimos equals() para comparar solo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return folio.equals(otro.folio);
               
    }

    // hashCode() compatible con equals() basado solo en folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }

    // toString() para ver fácilmente la información del ticket
    @Override
    public String toString() {
    	return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }
} //Cierre clase Factura
