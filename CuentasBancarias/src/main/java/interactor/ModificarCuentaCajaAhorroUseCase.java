package interactor;

import modelo.CuentaCajaAhorro;
import modelo.CuentaCorriente;
import repositorio.ICuentaCajaAhorroRepositorio;

public class ModificarCuentaCajaAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;
	

	public ModificarCuentaCajaAhorroUseCase(ICuentaCajaAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	public boolean ModificarCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		if (!elRepositorio.existeNumeroCuentaCajaAhorro(cuentaCajaAhorro.getNumero())) {
			return elRepositorio.modificarCuentaCajaDeAhorro(cuentaCajaAhorro);
		}
		return false;
		
	}
	
}
