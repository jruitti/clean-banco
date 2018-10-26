package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaDeAhorroRepositorio;

public class ExtraerDineroCajaDeAhorroUseCase {
	private ICuentaCajaDeAhorroRepositorio elRepositorio;

	public ExtraerDineroCajaDeAhorroUseCase(ICuentaCajaDeAhorroRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}

	public boolean extraerDineroCuentaCajaDeAhorro(CuentaCajaAhorro cuentaAhorro) {
		CuentaCajaAhorro cajaAhorroNueva = new CuentaCajaAhorro(cuentaAhorro.getNumero(), cuentaAhorro.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorro(cajaAhorroNueva);
	}

}
