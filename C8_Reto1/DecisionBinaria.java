package C8_Reto1;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{
	 @Override
	    public String obtenerDecision() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("🔍 ¿Qué deseas hacer?");
	        System.out.println("A) Ir al bosque encantado");
	        System.out.println("B) Entrar al castillo abandonado");
	        System.out.print("Ingresa tu decisión (A/B): ");
	        return scanner.nextLine();
	    }
}
