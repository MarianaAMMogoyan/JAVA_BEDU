package C7_Reto2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String rutaArchivo = "errores.log";
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        // try-with-resources para abrir el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    errores++;
                }

                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen
            System.out.println("📄 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + errores);
            System.out.println("Cantidad de advertencias (WARNING): " + advertencias);

            double porcentaje = ((double)(errores + advertencias) / totalLineas) * 100;
            System.out.printf("Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo. Se guardará el mensaje en registro_fallos.txt");

            // Guardar mensaje en otro archivo
            try (PrintWriter pw = new PrintWriter(new FileWriter("registro_fallos.txt", true))) {
                pw.println("Error al procesar errores.log: " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("❌ No se pudo guardar el error en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
