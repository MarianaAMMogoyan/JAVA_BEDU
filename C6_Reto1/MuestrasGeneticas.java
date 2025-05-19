/**
 * 
 */
package C6_Reto1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/**Estás colaborando como desarrollador Java en un laboratorio de biotecnología molecular. 
 * Tu tarea es ayudar al equipo de bioinformática a organizar el registro de las muestras genéticas que llegan diariamente 
 * al laboratorio. Deben llevar el control de:
		📥 El orden de llegada de las muestras (pueden repetirse si se replican).
		🧬 Las especies únicas que han sido procesadas.
		🧑‍🔬 El ID de cada muestra asociado con el nombre del investigador responsable.
 */
public class MuestrasGeneticas {

	/**
	 * 
	 */
	public MuestrasGeneticas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Paso 1: ArrayList para registrar todas las especies en orden
		ArrayList<String> especies = new ArrayList<>();

        // Registrar el orden de llegada
        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens"); // Se repite y está bien, porque son muestras

		// Paso 2: HashSet para filtrar especies únicas
        // ✅ HashSet: registrar defectos únicos
        HashSet<String> tiposEspecies = new HashSet<>(especies); // Elimina duplicados
       
		// Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> ID_Muestra = new HashMap<>();
        ID_Muestra.put("M-001", "Dra Mariana Moreno");
        ID_Muestra.put("M-002", "Dra Alejandra Rivera");
        ID_Muestra.put("M-003", "Dra Nataly Perez");
		// Paso 4: Mostrar resultados
        System.out.println("🗂️ Reportes de muestras (totales):");
        for (int i = 0; i < especies.size(); i++) {
            System.out.println(i + 1 + ". " + especies.get(i));
        }
        // Eliminando los duplicados
        System.out.println("\n✅ Tipos únicos de especies encontradas:");
        for (String especie : tiposEspecies) {
            System.out.println("- " + especie);
        }
        // Relacion id con investigador
        System.out.println("\n📇 Relacion ID muestra con investigador (ID → Causa):");
        for (Map.Entry<String, String> entry : ID_Muestra.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        // Buscar por ID de muestra
        String idBuscar = "M-002";
        System.out.println("\n🔍 La muestra corresponde a: " + idBuscar + ": " + ID_Muestra.get(idBuscar));
	}

}
