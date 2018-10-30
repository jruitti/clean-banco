package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class CrearCuentaCajaAhorroUseCase {

	private ICuentaCajaAhorroRepositorio elRepositorio;

	public CrearCuentaCajaAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = new CuentaCajaAhorro(cuentaCajaAhorro.getNumero(), cuentaCajaAhorro.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}

}
