package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ExtraerDineroCajaDeAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;

	public ExtraerDineroCajaDeAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}

	public boolean ExtraerDineroCuentaCajaDeAhorro(CuentaCajaAhorro laCuenta, double monto) {
		boolean resultado = laCuenta.extraer(monto);
		if (resultado) {
			elRepositorio.guardarCambiosCuenta(laCuenta);
			
		}
		
		return resultado;
	}

}
