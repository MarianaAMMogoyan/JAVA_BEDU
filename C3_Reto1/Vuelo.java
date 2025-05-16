package C3_Reto1;
/*
Objetivo: Diseñar un sistema basico de reservas de vuelo aplicando fundamentos POO
*/
public class Vuelo {
private final String codigoVuelo; //Úsalo cuando el valor nunca debe cambiar después de ser establecido
private String horaSalida; //Úsalo cuando necesitas que el valor del atributo pueda cambiar después de crear el objeto.
private String destino;
//"Declaro una variable privada llamada asientoReservado, que será un objeto de tipo Pasajero (puede ser null si nadie ha reservado todavía)."
private Pasajero asientoReservado; 

//CREAR LOS METODOS

//Creacion del constructor
//En Java, la palabra clave this se refiere al objeto actual que está siendo construido o modificado. Es decir, hace referencia a los atributos de la clase.
public Vuelo(String codigo, String destino, String horaSalida) {
	// Usamos this.codigoVuelo para dejar claro que nos referimos al atributo del objeto actual, y no al parámetro local.
	this.codigoVuelo = codigo; 
	this.destino = destino;
	this.horaSalida = horaSalida;
	this.asientoReservado = null; //Inicialmente sin reserva
}

public boolean reservarAsiento(Pasajero p) { //Asigna al pasajero si no hay reserva previa
	if (asientoReservado == null) {
        asientoReservado = p;
        System.out.println("✅ Reserva realizada con éxito.");
        return true;
    } else {
        System.out.println("⚠️ Ya hay una reserva en este vuelo.");
        return false;
    }
}

// Reserva con nombre y pasaporte
public boolean reservarAsiento(String nombre, String pasaporte) {
    return reservarAsiento(new Pasajero(nombre, pasaporte));
}

//Cancelar reserva
public void cancelarReserva() {
    if (asientoReservado != null) {
        System.out.println("❌ Cancelando reserva...");
        asientoReservado = null;
    } else {
        System.out.println("⚠️ No hay ninguna reserva para cancelar.");
    }
}

// Mostrar itinerario
public String obtenerItinerario() {
    String pasajeroInfo = (asientoReservado != null) 
        ? asientoReservado.getNombre()
        : "[Sin reserva]";
    return String.format(
        "✈️ Itinerario del vuelo:\nCódigo: %s\nDestino: %s\nSalida: %s\nPasajero: %s\n",
        codigoVuelo, destino, horaSalida, pasajeroInfo
    );
}


}
