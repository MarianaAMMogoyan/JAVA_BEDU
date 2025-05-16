package C3_Reto1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Crear pasajero y reservar
        Pasajero ana = new Pasajero("Marianita Mogoyan", "P123456");
        vuelo.reservarAsiento(ana);

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();

        // Mostrar itinerario sin reserva
        System.out.println(vuelo.obtenerItinerario());

        // Reservar con datos directamente
        vuelo.reservarAsiento("Pedro Perez", "M789012");

        // Mostrar nuevo itinerario
        System.out.println(vuelo.obtenerItinerario());
	}

}
