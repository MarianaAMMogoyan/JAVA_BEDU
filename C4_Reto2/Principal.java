package C4_Reto2;


public class Principal {
	public static void main(String[] args) {
	
	DeclaracionImpuestos d1 = new DeclaracionImpuestos("fdv512",15000);
	DeclaracionImpuestos d2 = new DeclaracionImpuestos("ger",3000);
	CuentaFiscal cf1 = new CuentaFiscal("fdv512",-50);
	
	//Mostrar info
	System.out.println("📄 Declaración enviada por RFC: " + d1.rfcContribuyente() + " por $" + d1.montoDeclarado());
	System.out.println("📄 Declaración enviada por RFC: " + d2.rfcContribuyente() + " por $" + d2.montoDeclarado());
    System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cf1.getRFC() + ", saldo disponible: $" + cf1.getSaldoDisp());
	
    //Validar RFC
    boolean rfcValido = cf1.validarRFC(d1);
    System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    
	} //Fin Main
	
} //Fin clase Principal
