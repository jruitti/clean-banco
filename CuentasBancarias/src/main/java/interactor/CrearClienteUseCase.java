package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class CrearClienteUseCase {

	private IClienteRepositorio elRepositorio;

	public CrearClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean crearCliente(Cliente elCliente) {
		Cliente nuevoCliente = Cliente.instancia(elCliente.getIdCliente(), elCliente.getApellido(),
				elCliente.getNombre(), elCliente.getCuil(), elCliente.getDireccion());
		return elRepositorio.guardarCliente(nuevoCliente);
	}
}
