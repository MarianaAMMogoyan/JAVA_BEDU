package C1_Reto1;
import java.util.Scanner;
public class Principal {
	/* Objetivo: ⚒️ Desarrollar un programa en Java que registre los datos de un paciente, 
	 * aplicando los fundamentos de clases, objetos, atributos, métodos y la entrada de datos por consola.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        // Solicitar los datos al usuario
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Número de expediente: ");
        String expediente = scanner.nextLine();

        // Crear objeto y asignar datos
        Paciente paciente = new Paciente();
        paciente.setDatos(nombre, edad, expediente);

        // Mostrar información
        System.out.println("\nInformación del paciente:");
        paciente.mostrarInformacion();
        
        scanner.close();
	}

}
