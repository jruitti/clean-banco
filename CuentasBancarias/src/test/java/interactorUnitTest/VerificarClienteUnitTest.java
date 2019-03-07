package interactorUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void devolverClientePorId_ClienteNoExiste_DevuelveNull() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.clienteDevuelto=null;
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		Cliente resultado  = verificarClienteUseCase.devolverClientePorId(1);
		
		assertNull(resultado);
	}
	
	@Test
	public void devolverClientePorId_ClienteExiste_DevuelveCliente() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.clienteDevuelto = Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		Cliente resultado  = verificarClienteUseCase.devolverClientePorId(1);
		
		assertNotNull(resultado);
	}
	
	@Test
	public void devolverClientesPorApellido_ClientesExisten_DevuelveListaConCliente() {
		
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.listaDeClientes= new ArrayList<>();
		Cliente c1 = Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		Cliente c2 = Cliente.instancia(2,"Perez","pedro","40-12345678","San Martin 150");
		
		elRepositorio.listaDeClientes.add(c1);
		elRepositorio.listaDeClientes.add(c2);
		
		verificarClienteUseCase verificarClienteUseCase = new verificarClienteUseCase(elRepositorio);
		
		List<Cliente> resultado  = verificarClienteUseCase.devolverClientesPorApellido("perez");
		
		assertNotNull(resultado);		
		assertEquals(2, elRepositorio.listaDeClientes.size());
	}
	
	
}
	


