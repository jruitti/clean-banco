package interactor;


import modelo.CuentaCorriente;

import repositorio.ICuentaCorrienteRepositorio;

public class CrearCuentaCorrienteUseCase{

	private ICuentaCorrienteRepositorio elRepositorio;

	public CrearCuentaCorrienteUseCase(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCorriente(CuentaCorriente cuentaCorriente) {
		if (!elRepositorio.existeCuentaCorriente(cuentaCorriente)) {//CuentaCorriente cuentaCorrienteNuevo = CuentaCorriente.instancia (cuentaCorriente.getNumero() , cuentaCorriente.getTitular());
			return elRepositorio.crearCuentaCorriente(cuentaCorriente);
		}
		return false;
	}

}
