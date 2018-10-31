package interactor;

import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class CrearCuentaCajaDeAhorroEspecialUseCase {

	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public CrearCuentaCajaDeAhorroEspecialUseCase(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuentaCajaDeAhorroEspecial) {
		if (elRepositorio.consultarCuentaCajaDeAhorroEspecial(nuevaCuentaCajaDeAhorroEspecial) ) {
			return false;
		}
		CuentaCajaDeAhorroEspecial cuentaAhorroEspecialNuevo = CuentaCajaDeAhorroEspecial.instancia(nuevaCuentaCajaDeAhorroEspecial.getNumero(), nuevaCuentaCajaDeAhorroEspecial.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorroEspecial(cuentaAhorroEspecialNuevo);
	}

}
