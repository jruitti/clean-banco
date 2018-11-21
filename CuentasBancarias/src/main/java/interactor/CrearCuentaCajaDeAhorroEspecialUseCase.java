package interactor;

import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class CrearCuentaCajaDeAhorroEspecialUseCase {

	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public CrearCuentaCajaDeAhorroEspecialUseCase(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuentaCajaDeAhorroEspecial) {
		if (!elRepositorio.existeCuentaCajaDeAhorroEspecial(nuevaCuentaCajaDeAhorroEspecial) ) {
			return elRepositorio.crearCuentaCajaDeAhorroEspecial(nuevaCuentaCajaDeAhorroEspecial);
		}
		return false;

	}
}
