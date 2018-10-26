package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaDeAhorroRepositorio;

public class CrearCuentaCajaAhorroUseCase {

	private ICuentaCajaDeAhorroRepositorio elRepositorio;

	public CrearCuentaCajaAhorroUseCase(ICuentaCajaDeAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = new CuentaCajaAhorro(cuentaCajaAhorro.getNumero(), cuentaCajaAhorro.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}

}
