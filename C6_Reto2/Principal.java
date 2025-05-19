package C6_Reto2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        // Lista concurrente para almacenar los temas activos
        List<Tema> temasactivos = new CopyOnWriteArrayList<>();

        // Se agregan temas con título y prioridad
        temasactivos.add(new Tema("Lectura comprensiva", 2));
        temasactivos.add(new Tema("Matemáticas básicas", 1));
        temasactivos.add(new Tema("Cuidado del medio ambiente", 3));

        System.out.println("👥 Temas activos:");
        for (Tema tema : temasactivos) {
            System.out.println("- " + tema);
        }

        // Ordenar por prioridad (de menor a mayor)
        temasactivos.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.getPrioridad(), b.getPrioridad());
            }
        });

        System.out.println("\n📊 Temas ordenados por prioridad:");
        for (Tema tema : temasactivos) {
            System.out.println("- " + tema);
        }
    }
}
