package C5_Reto1;

public class CentralEmergencias {
    public static void main(String[] args) {
        UnidadEmergencia ambulancia = new Ambulancia("Ambulancia", new Operador("Juan"));
        UnidadEmergencia patrulla = new Patrulla("Patrulla", new Operador("Laura"));
        UnidadEmergencia bomberos = new UnidadBomberos("UnidadBomberos", new Operador("Marco"));

        ((Ambulancia) ambulancia).iniciarOperacion();
        System.out.println();
        ((Patrulla) patrulla).iniciarOperacion();
        System.out.println();
        ((UnidadBomberos) bomberos).iniciarOperacion();
    }
}

