package interactor;

import repositorio.ICuentaCajaDeAhorroComunRepositorio;

public class CrearCuentaCajaAhorroUseCase {
	private IClienteRepositorio elRepositorio;

	public public CrearCuentaCajaAhorroUseCase(ICuentaCajaDeAhorroComunRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

}
