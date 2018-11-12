package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class consultarClienteUseCase {

	private IClienteRepositorio elRepositorio;

	public consultarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	
	public boolean ConsultarCliente(Cliente clienteConsultado){
		if(!elRepositorio.consultarClientePorCuil(clienteConsultado.getCuil())) {
			return elRepositorio.existeCliente(clienteConsultado);
		}
		return false;
		
		
	}

}
