package interactorUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import interactor.consultarClienteUseCase;
import modelo.Cliente;

public class VerificararClienteUnitTest {
	@Test
	public void verificarCliente_ClienteExiste_ClienteDevuelto() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeCliente=true;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		consultarClienteUseCase consultarClienteUseCase = new consultarClienteUseCase(elRepositorio);
		
		boolean resultado  = consultarClienteUseCase.ConsultarCliente(elCliente);
		
		assertTrue(resultado);
	}
	
	@Test
	public void verificarCliente_ClienteNoExiste_ClienteNoDevuelto() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.clientePorCuil = false;
		
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		consultarClienteUseCase consultarClienteUseCase = new consultarClienteUseCase(elRepositorio);
		
		boolean resultado  = consultarClienteUseCase.ConsultarCliente(elCliente);
		
		assertFalse(resultado);
	}
}
	


