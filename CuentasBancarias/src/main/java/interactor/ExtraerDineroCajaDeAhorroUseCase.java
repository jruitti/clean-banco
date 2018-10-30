package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ExtraerDineroCajaDeAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;

	public ExtraerDineroCajaDeAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}

	public boolean extraerDineroCuentaCajaDeAhorro(CuentaCajaAhorro cuentaAhorro) {
		CuentaCajaAhorro cajaAhorroNueva = new CuentaCajaAhorro(cuentaAhorro.getNumero(), cuentaAhorro.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorro(cajaAhorroNueva);
	}

}
