package C3_Reto2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura facturaConRfc = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura facturaSinRfc = new Factura(1800.0, "Reparación de equipo", null);
        System.out.println(facturaConRfc.getResumen());
        System.out.println();
        System.out.println(facturaSinRfc.getResumen());
	}

}
