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
	
	public boolean extraer(double monto, LocalDate fecha) {
		//LocalDate fechaActual = LocalDate.now();
		
		if (fecha.getYear() != ultimoExtraccion.getYear()
				|| fecha.getMonth() != ultimoExtraccion.getMonth()) {
			
			actualizarFechaUltima(fecha);
			return (super.extraer(monto));
		
		}
		return false;
	}
	
	public void actualizarFechaUltima(LocalDate fecha) {
		this.ultimoExtraccion = fecha;
	}
	
	public void modificarCajaAhorroEspecial(Cliente nuevoTitular, String numeroCuenta) {
		if(super.getNumero()==numeroCuenta) {
			super.setTitular(nuevoTitular);
		}
	}
	

}
