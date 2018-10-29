package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import interactor.CrearClienteUseCase;
import modelo.Cliente;
import repositorio.IClienteRepositorio;

class CrearClienteUnitTest {
	@Test
	public void crearCliente_ClienteNoExiste_ClienteCreado() {
		RepositorioCliente elRepositorio=new RepositorioCliente();
		elRepositorio.resultado=true;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		
		CrearClienteUseCase crearClienteUseCase=new CrearClienteUseCase(elRepositorio);
		
		boolean resultado=crearClienteUseCase.crearCliente(elCliente);
		
		assertTrue(resultado);
	}
	
	@Test
	public void crearCliente_ClienteExiste_ClienteNoCreado() {
		RepositorioCliente elRepositorio=new RepositorioCliente();
		elRepositorio.resultado=false;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		
		CrearClienteUseCase crearClienteUseCase=new CrearClienteUseCase(elRepositorio);
		
		boolean resultado=crearClienteUseCase.crearCliente(elCliente);
		
		assertFalse(resultado);
	}

}
class RepositorioCliente implements IClienteRepositorio{

	public boolean resultado;
	
	@Override
	public boolean guardarCliente (Cliente pCliente) {
		return resultado;
	}

	@Override
	public boolean modificarCliente(Cliente persCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean consultarCliente(Cliente persCliente) {
		// TODO Auto-generated method stub
		return false;
	}
	
}