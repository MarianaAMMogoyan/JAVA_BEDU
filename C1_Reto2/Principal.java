package C1_Reto2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);
        // Mostrar información de las entradas
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
	}

}
