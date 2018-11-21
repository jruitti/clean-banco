package interactorUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import interactor.verificarClienteUseCase;
import modelo.Cliente;

public class VerificarClienteUnitTest {
	@Test
	public void verificarCliente_ClienteExiste_DevuelveTrue() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeCliente= true;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarCliente(elCliente);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificarCliente_ClienteNoExiste_DevuelveFalse() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeCliente = false;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarCliente(elCliente);
		
		assertFalse(resultado);
	}
	
	@Test
	public void verificarClientePorId_ClienteNoExiste_DevuelveFalse() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeClienteId = false;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarClientePorId(2);
		
		assertFalse(resultado);
	}
	
	@Test
	public void verificarClientePorId_ClienteExiste_DevuelveTrue() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeClienteId = true;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarClientePorId(1);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificarClientePorCuil_ClienteNoExiste_DevuelveFalse() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeClientePorCuil = false;		
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarClientePorCuil("57-12345678");
		
		assertFalse(resultado);
	}
	
	@Test
	public void verificarClientePorCuil_ClienteExiste_DevuelveTrue() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeClientePorCuil = true;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		boolean resultado  = verificarClienteUseCase.verificarClientePorCuil("20-12345678");
		
		assertTrue(resultado);
	}
}
	


