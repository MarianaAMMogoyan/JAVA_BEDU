package C2_Reto1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Hola, este es un simulador de farmacia");
        // Solicita datos al usuario
        System.out.print("Por favor ingrese el nombre del medicamento: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa el precio unitario: ");
        double precio = sc.nextDouble();
        System.out.print("Por favor ingresa la cantidad de piezas: ");
        int cantidad = sc.nextInt();
        // Crea el objeto paciente con los datos ingresados
        SimuladorFarmacia paciente = new SimuladorFarmacia(nombre, precio, cantidad);
        // Muestra resumen de compra
        paciente.mostrarResumen();
        sc.close();
	}

}
