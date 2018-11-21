package interactor;

import java.util.List;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class verificarClienteUseCase {

	private IClienteRepositorio elRepositorio;

	public verificarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	
	public boolean verificarCliente(Cliente clienteAVerificar){
		if(elRepositorio.verificarCliente(clienteAVerificar.getCuil(), clienteAVerificar.getApellido(), clienteAVerificar.getNombre() ) ) {
			return true;
		}
		return false;		
	}
	
	public boolean verificarClientePorId(int clienteId){
		return elRepositorio.verificarClientePorId(clienteId);
	}
	
	public boolean verificarClientePorCuil(String clienteCuil){
		return elRepositorio.verificarClientePorCuil(clienteCuil);
	}
	
	public Cliente devolverClientePorId(int id){
		return elRepositorio.devolverClientePorId(id);
	}
	
	public List<Cliente> devolverClientesPorApellido(String apellido){
		return elRepositorio.devolverClientesPorApellido(apellido);
	}


}
