package C3_Reto2;

import java.util.Optional;

public class Factura {
	private double monto;
	private String descripcion;
	private Optional<String> rfc;
	


//CREACION DE METODOS

public Factura(double monto, String descripcion, String rfc) {
	this.monto= monto;
	this.descripcion = descripcion;
	this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
}

public String getResumen() {
	//Crea un objeto StringBuilder, una clase eficiente para construir cadenas de texto paso a paso sin crear múltiples objetos intermedios.
	//StringBuilder resumen = new StringBuilder();
    //resumen.append("📄 Factura generada:\n"); //Va concatenando cada parte del resumen con información:
	return "📄 Factura generada:\n" +
    "Descripción: " + descripcion + "\n" +
    "Monto: $" + monto + "\n" +
    "RFC: " + rfc.orElse("[No proporcionado]"); 
}

} //Fin de la clase Factura