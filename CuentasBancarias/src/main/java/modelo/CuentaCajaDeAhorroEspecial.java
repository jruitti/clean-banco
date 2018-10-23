package modelo;

import java.time.LocalDate;

public class CuentaCajaDeAhorroEspecial extends Cuenta {
	private LocalDate ultimoExtraccion;
	
	public CuentaCajaDeAhorroEspecial(String numero, String titular, double saldo) {
		super(numero, titular, saldo);
		ultimoExtraccion = LocalDate.now().minusYears(1);
	}
	
	public boolean extraer(double monto) {
		LocalDate fechaActual = LocalDate.now();
		
		if(fechaActual.getYear() != ultimoExtraccion.getYear() || fechaActual.getMonth() != ultimoExtraccion.getMonth() ){
			return (super.extraer(monto));
		}
		return false;
	}
	
	
	

}
