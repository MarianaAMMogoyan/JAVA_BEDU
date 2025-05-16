package C1_Reto2;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear registros de tipo Entrada_Record
        Entrada_Record entrada1 = new Entrada_Record("Obra de Teatro", 450.0);
        Entrada_Record entrada2 = new Entrada_Record("Concierto de Rock", 750.0);

        // Mostrar información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
	}

}
