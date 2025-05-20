package C8_Reto1;

public class TransicionSimple implements TransicionHistoria{
	@Override
    public void siguienteEscena(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("🧭 Has decidido ir al bosque encantado.");
        } else if ("B".equalsIgnoreCase(decision)) {
            System.out.println("🏰 Has entrado al castillo abandonado.");
        } else {
            System.out.println("❌ Decisión no reconocida. Te quedaste en el mismo lugar.");
        }
    }
}
