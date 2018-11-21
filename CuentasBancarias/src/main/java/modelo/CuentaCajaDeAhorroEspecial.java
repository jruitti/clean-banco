package modelo;

import java.time.LocalDate;

public class CuentaCajaDeAhorroEspecial extends Cuenta {
	private LocalDate ultimoExtraccion;

	private CuentaCajaDeAhorroEspecial(String numero, Cliente titular,Integer idCuenta) {
		super(numero, titular, idCuenta);
		ultimoExtraccion = LocalDate.now().minusYears(1);
	}
	public static CuentaCajaDeAhorroEspecial instancia(String numero, Cliente titular,Integer idCuenta) {
		if(numero == null || titular == null) {
			return null;
		}
		else {
			return new CuentaCajaDeAhorroEspecial(numero, titular, idCuenta);
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
	
	public LocalDate getUltimoExtraccion() {
		return ultimoExtraccion;
	}
	public void actualizarFechaUltima(LocalDate fecha) {
		this.ultimoExtraccion = fecha;
	}
	
	public void modificarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuentaAModificar, String nuevoNumeroCuenta) {
		if(super.getNumero()==cuentaAModificar.getNumero()) {
			super.setNumeroCuenta(nuevoNumeroCuenta);
		}
	}
	
	public void modificarDatosDb(CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial) {
		this.setNumero(cuentaCajaDeAhorroEspecial.getNumero());
		
	}
	

}
