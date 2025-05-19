package C6_Reto2;

// Esta clase representa un solo tema con título y prioridad
public class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    // Constructor
    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Getter del título
    public String getTitulo() {
        return titulo;
    }

    // Getter de la prioridad
    public int getPrioridad() {
        return prioridad;
    }

    // Orden natural: por título (alfabético)
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    // Para mostrar información del tema al imprimir
    @Override
    public String toString() {
        return "📚 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

