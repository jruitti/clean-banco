package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ModificarCuentaCajaAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;
	

	public ModificarCuentaCajaAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}


	public boolean ModificarCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = CuentaCajaAhorro.instancia(cuentaCajaAhorro.getNumero(),cuentaCajaAhorro.getTitular());
		return elRepositorio.modificarCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}


}
