package C4_Reto2;
import java.util.Objects;

public class CuentaFiscal {
	private String rfc;
	private double saldoDisponible;

	public CuentaFiscal(String rfc, double saldoDisponible) {
		this.rfc = rfc;
		//Constructor con validación para que el saldo no sea negativo.
		if (saldoDisponible >0) {
			this.saldoDisponible = saldoDisponible;
		} else {
			 System.out.println("❌ El saldo es negativo.");
			 this.saldoDisponible = saldoDisponible;
		}
	}

	//Getter para rfc
	public String getRFC() {
	    return rfc;
	}
	//Getter para saldo
	public double getSaldoDisp() {
	  return saldoDisponible;
	}
	// Metodo para comparar RFC cuenta con declaracion
	public boolean validarRFC(DeclaracionImpuestos d) {
		 return Objects.equals(this.rfc, d.rfcContribuyente());
	}
	  

} //Fin clase CuentaFiscal
