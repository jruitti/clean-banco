package modelo;

import java.time.LocalDate;

public class CuentaCajaDeAhorroEspecial extends Cuenta {
	private LocalDate ultimoExtraccion;

	private CuentaCajaDeAhorroEspecial(String numero, Cliente titular) {
		super(numero, titular);
		ultimoExtraccion = LocalDate.now().minusYears(1);
	}
	public static CuentaCajaDeAhorroEspecial instancia(String numero, Cliente titular) {
		if(numero == null || titular == null) {
			return null;
		}
		else {
			return new CuentaCajaDeAhorroEspecial(numero, titular);
		}
	}
	
	public boolean extraer(double monto) {
		LocalDate fechaActual = LocalDate.now();

		if (fechaActual.getYear() != ultimoExtraccion.getYear()
				|| fechaActual.getMonth() != ultimoExtraccion.getMonth()) {
			return (super.extraer(monto));
		}
		return false;
	}

}
