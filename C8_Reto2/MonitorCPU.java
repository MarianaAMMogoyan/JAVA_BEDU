package C8_Reto2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosRegistrados = new HashSet<>();
        
        try {
            System.out.println("🧠 Monitor de Consumo de CPU");
            System.out.print("¿Cuántos servidores deseas registrar? ");
            int totalServidores;

            // Validar que se ingrese un número entero
            try {
                totalServidores = Integer.parseInt(scanner.nextLine());
                if (totalServidores <= 0) {
                    System.out.println("❌ La cantidad debe ser mayor a cero.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Debe ingresar un número entero.");
                return;
            }

            for (int i = 1; i <= totalServidores; i++) {
                System.out.printf("🔹 Ingrese el consumo de CPU para el servidor %d (0-100): ", i);
                String entrada = scanner.nextLine();

                try {
                    int consumo = Integer.parseInt(entrada);

                    if (consumo < 0 || consumo > 100) {
                        System.out.println("⚠️ El valor debe estar entre 0 y 100.");
                        i--; // Reintenta el mismo servidor
                        continue;
                    }

                    if (consumosRegistrados.contains(consumo)) {
                        System.out.println("⚠️ Este valor ya fue registrado. No se permiten duplicados.");
                        i--;
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🚨 ¡Alerta! Consumo crítico detectado: " + consumo + "%");
                    }

                    consumosRegistrados.add(consumo);
                    System.out.println("✅ Registro exitoso.");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Entrada inválida. Debes ingresar un número.");
                    i--; // Reintenta
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                    // Aquí podrías decidir si parar o continuar
                    consumosRegistrados.add(95); // opcional: marcar como tope de registro
                }
            }

            System.out.println("\n📊 Resumen de consumo:");
            for (int consumo : consumosRegistrados) {
                System.out.println("- " + consumo + "%");
            }

        } finally {
            scanner.close();
            System.out.println("\n🔒 Scanner cerrado. Fin del monitoreo.");
        }
    }
}
