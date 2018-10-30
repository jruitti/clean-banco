package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ModificarCuentaCajaAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;
	

	public ModificarCuentaCajaAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}


	public boolean ModificarCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = new CuentaCajaAhorro(cuentaCajaAhorro.getNumero(),cuentaCajaAhorro.getTitular());
		return elRepositorio.modificarCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}


}
