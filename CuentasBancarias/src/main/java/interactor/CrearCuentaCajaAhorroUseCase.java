package interactor;

import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class CrearCuentaCajaAhorroUseCase {

	private ICuentaCajaAhorroRepositorio elRepositorio;

	public CrearCuentaCajaAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		if (!elRepositorio.existeCuentaCajaDeAhorro(cuentaCajaAhorro))
			return elRepositorio.crearCuentaCajaDeAhorro(cuentaCajaAhorro);
		return false;
	}

}
