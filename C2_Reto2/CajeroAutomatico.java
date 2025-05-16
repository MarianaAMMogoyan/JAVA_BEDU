package C2_Reto2;
import java.util.Scanner;
public class CajeroAutomatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var saldo = 1000.0; // Saldo inferido por Java con 'var'
		Scanner sc = new Scanner(System.in);
		int opcion; // Declaramos la variable fuera del do para poder usarla en el while

		do {
		    System.out.println("\n 💳Bienvenido al cajero automático");
		    System.out.println("Selecciona una opción:");
		    System.out.println("1. Consultar saldo");
		    System.out.println("2. Depositar dinero");
		    System.out.println("3. Retirar dinero");
		    System.out.println("4. Salir");

		    opcion = sc.nextInt(); // Leemos la opción del usuario

		    System.out.println(); // Espaciado opcional

		    // USamos switch segun sea el caso
		    switch (opcion) {
		        case 1:
		            System.out.println("Tu saldo actual es: $"+saldo); 
		            break;
		        case 2:
		            System.out.println("¿Cuanto deseas depositar?");
		            double deposito = sc.nextDouble();
		            if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("⚠️ Ingresa una cantidad válida.");
                    }
		            break;
		        case 3:
		            System.out.println("¿Cuanto deseas retirar?");
		            double retiro= sc.nextDouble();
		            if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else if (retiro > saldo) {
                        System.out.println("❌ Fondos insuficientes. Tu saldo es: $" + saldo);
                    } else {
                        System.out.println("⚠️ Ingresa una cantidad válida.");
                    }
                    break;
		        case 4:
		            System.out.println("Gracias por usar el cajero automático.¡Hasta pronto!");
		            System.exit(0);
		            break;
		        default:
		            System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 4. Intenta de nuevo.");
		    }

		} while (opcion != 4);
		sc.close();
	}

}
