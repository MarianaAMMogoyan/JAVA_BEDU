package C1_Reto1;

public class Paciente {
    // Atributos
    private String nombre;
    private int edad;
    private String expediente;

    // Método para asignar valores
    public void setDatos(String nombre, int edad, String expediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = expediente;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
