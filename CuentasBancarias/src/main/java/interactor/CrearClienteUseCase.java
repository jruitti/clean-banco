package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class CrearClienteUseCase {

	private IClienteRepositorio elRepositorio;

	public CrearClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	public boolean crearCliente(Cliente elCliente) {
		if (!elRepositorio.verificarCliente(elCliente)) {
			return elRepositorio.guardarCliente(elCliente);
		}
		return false;
	}
}
