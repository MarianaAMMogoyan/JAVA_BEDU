package C4_Reto1;

public class Principal {

	public static void main(String[] args) {
		// Creamos dos Facturas
		Factura f1 = new Factura("ABC123", "Mariana Mogoyan", 1560.2);
        Factura f2 = new Factura("ABC123", "Anita Granados", 100.2);
        //Mostrar ambas facturas
        System.out.println(f1);
        System.out.println(f2);
        //Comparar si son iguales
        if (f1.equals(f2)) {
            System.out.println("✅ Las facturas son iguales (mismo folio).");
        } else {
            System.out.println("❌ Las facturas son diferentes.");
        }
	}

}
