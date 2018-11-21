package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class ModificarClienteUseCase {
	private IClienteRepositorio elRepositorio;

	public ModificarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCliente(Cliente personaCliente) {
		Cliente clienteDb = elRepositorio.devolverClientePorId(personaCliente.getIdCliente());
		
 		if (personaCliente.getCuil().equals(clienteDb.getCuil())||elRepositorio.verificarClientePorCuil(personaCliente.getCuil())) {
 			clienteDb.modificarClienteDb(personaCliente);
			return elRepositorio.modificarCliente(clienteDb);
		}
		return false;
	}

}
