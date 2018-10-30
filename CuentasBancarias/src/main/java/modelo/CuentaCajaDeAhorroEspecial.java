package modelo;

import java.time.LocalDate;

public class CuentaCajaDeAhorroEspecial extends Cuenta {
	private LocalDate ultimoExtraccion;

	public CuentaCajaDeAhorroEspecial(String numero, Cliente titular) {
		super(numero, titular);
		ultimoExtraccion = LocalDate.now().minusYears(1);
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
