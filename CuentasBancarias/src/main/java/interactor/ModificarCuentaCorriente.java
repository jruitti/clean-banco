package interactor;

import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

public class ModificarCuentaCorriente {

	private ICuentaCorrienteRepositorio elRepositorio;

	public ModificarCuentaCorriente(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean ModificarCuentaCorriente(CuentaCorriente cuentaCorriente) {
		if (!elRepositorio.existeCuentaCorrientePorNumero(cuentaCorriente.getNumero())) {
			return elRepositorio.modificarCuentaCorriente(cuentaCorriente);
		}
		return false;

	}

}
