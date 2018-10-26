package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaDeAhorroRepositorio;

public class ModificarCuentaCajaDeAhorroUseCase {
	private ICuentaCajaDeAhorroRepositorio elRepositorio;
	

	public ModificarCuentaCajaDeAhorroUseCase(ICuentaCajaDeAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}


	public boolean ModificarCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = new CuentaCajaAhorro(cuentaCajaAhorro.getNumero(),cuentaCajaAhorro.getTitular());
		return elRepositorio.modificarCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}


}
