package interactor;

import modelo.CuentaCajaAhorro;
import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

public class ModificarCuentaCorriente {

	private ICuentaCorrienteRepositorio elRepositorio;

	public ModificarCuentaCorriente(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean ModificarCuentaCorriente(CuentaCorriente cuentaCorriente) {
		CuentaCorriente cuentaCorrienteDB = elRepositorio.devuelveCuentaPorId(cuentaCorriente.getIdCuenta());
		
		if (cuentaCorriente.getNumero().equals(cuentaCorrienteDB.getNumero())||!elRepositorio.existeCuentaCorrientePorNumero(cuentaCorriente.getNumero())) {
			cuentaCorrienteDB.modificarDatosDb(cuentaCorriente);
			return elRepositorio.modificarCuentaCorriente(cuentaCorrienteDB);
		}
		return false;

	}

}
