package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class ModificarClienteUseCase {
	private IClienteRepositorio elRepositorio;

	public ModificarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCliente(Cliente personaCliente) {
		if (!elRepositorio.existeClientePorId(personaCliente.getIdCliente())) {
			return elRepositorio.modificarCliente(personaCliente);
		}
		return true;
	}
	
	
	
}
