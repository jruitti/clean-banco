package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ExtraerDineroCajaDeAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;

	public ExtraerDineroCajaDeAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}

	public boolean extraerDineroCuentaCajaDeAhorro(CuentaCajaAhorro cuentaAhorro, Float montoDinero) {
		return cuentaAhorro.extraer(montoDinero);
	}

}
