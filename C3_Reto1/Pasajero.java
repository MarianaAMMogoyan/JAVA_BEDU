package C3_Reto1;

public class Pasajero {
	String nombre;
	String pasaporte;

//METODOS

public Pasajero (String nombre, String pasaporte) {
	this.nombre = nombre;
    this.pasaporte = pasaporte;
}
public String getNombre() {
	return nombre;
}

public String getPasaporte() {
	return pasaporte;
}

}
