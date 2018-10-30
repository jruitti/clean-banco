package interactor;

import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class CrearCuentaCajaDeAhorroEspecialUseCase {

	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public void CrearCuentaCajaDeAhorroEspecialUseCase(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean CrearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial cuentaCajaAhorro) {
		CuentaCajaDeAhorroEspecial cuentaAhorroEspecialNuevo = new CuentaCajaDeAhorroEspecial(cuentaCajaAhorro.getNumero(), cuentaCajaAhorro.getTitular());
		return elRepositorio.crearCuentaCajaDeAhorroEspecial(cuentaAhorroEspecialNuevo);
	}

}
