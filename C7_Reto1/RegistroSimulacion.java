package C7_Reto1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Ruta del archivo: carpeta "config" y archivo "parametros.txt"
        Path rutaArchivo = Paths.get("config", "parametros.txt");

        // Llamada a método para guardar parámetros
        guardarParametros(rutaArchivo);

        // Validar si el archivo existe
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ Archivo creado correctamente.");

            // Leer y mostrar contenido
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ No se pudo crear el archivo.");
        }
    }

    // Método para escribir los parámetros en el archivo
    public static void guardarParametros(Path rutaArchivo) {
        // Texto que se escribirá en el archivo
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // Crear la carpeta si no existe
            Files.createDirectories(rutaArchivo.getParent());

            // Escribir el archivo con los parámetros
            Files.write(rutaArchivo, contenido.getBytes());

            System.out.println("📄 Parámetros guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    // Método para leer y mostrar el contenido del archivo
    public static void leerParametros(Path rutaArchivo) {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("📖 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}

