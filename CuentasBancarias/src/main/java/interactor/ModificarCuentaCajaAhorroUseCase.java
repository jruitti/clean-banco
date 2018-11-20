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

		CuentaCajaAhorro cuentaCajaAhorroDB = elRepositorio.devuelveCuentaPorId(cuentaCajaAhorro.getIdCuenta());
		
		if (cuentaCajaAhorro.getNumero().equals(cuentaCajaAhorroDB.getNumero())||!elRepositorio.existeNumeroCuentaCajaAhorro(cuentaCajaAhorro.getNumero())) {
			cuentaCajaAhorroDB.modificarDatosDb(cuentaCajaAhorro);
			return elRepositorio.modificarCuentaCajaDeAhorro(cuentaCajaAhorroDB);
		}
		return false;
		
	}
	
}
