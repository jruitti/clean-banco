package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class ModificarClienteUseCase {
	private IClienteRepositorio elRepositorio;

	public ModificarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCliente(Cliente personaCliente) {
		Cliente clienteModificado = Cliente.instancia(personaCliente.getIdCliente(), personaCliente.getApellido(),
				personaCliente.getNombre(), personaCliente.getCuil(), personaCliente.getDireccion());
		return elRepositorio.modificarCliente(clienteModificado);
	}
}
