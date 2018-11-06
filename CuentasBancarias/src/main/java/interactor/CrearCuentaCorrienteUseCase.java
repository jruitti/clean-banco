package interactor;


import modelo.CuentaCorriente;

import repositorio.ICuentaCorrienteRepositorio;

public class CrearCuentaCorrienteUseCase{

	private ICuentaCorrienteRepositorio elRepositorio;

	public CrearCuentaCorrienteUseCase(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCorriente(CuentaCorriente cuentaCorriente) {
		if (!elRepositorio.existeCuentaCorriente(cuentaCorriente)) {
			return elRepositorio.crearCuentaCorriente(cuentaCorriente);
		}
		return false;
	}

}
